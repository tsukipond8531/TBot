package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.IllegalValueToStringException;
import jarkz.tbot.exceptions.types.ToStringContractException;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.annotations.EmptyClass;
import jarkz.tbot.types.annotations.GeneralInterface;
import jarkz.tbot.violations.Violation;
import jarkz.tbot.violations.ViolationList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

/**
 * Special "static" class for verifies any datatype or package, in which can be found the datatypes,
 * by contract.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class ContractVerifier {

  private record Fields(List<Field> notNullFields, List<Field> objectFields) {}

  private static final Set<Class<?>> WRAPPERS =
      Set.of(
          Integer.class,
          Long.class,
          Short.class,
          Double.class,
          Float.class,
          Boolean.class,
          Byte.class,
          Character.class);

  private static final Set<Class<?>> PRIMITIVES =
      Set.of(
          Integer.TYPE,
          Long.TYPE,
          Short.TYPE,
          Double.TYPE,
          Float.TYPE,
          Boolean.TYPE,
          Byte.TYPE,
          Character.TYPE);

  private static final String CAMEL_CASE_PATTERN = "[a-z]+((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?";

  private static final String SNAKE_CASE_PATTERN = "[a-z0-9]+(?:_[a-z0-9]+)*";

  private static final String SNAKE_CASE_DELIMITER = "_";

  private static final String TO_STRING_METHOD_NAME = "toString";

  private static final String TO_STRING_TEXT_SEPARATOR = ", ";

  private enum Groups {
    FIELDS("Fields"),
    METHODS("Methods"),
    NAMING("Naming"),
    GENERAL_INTERFACE("General Interface"),
    TO_STRING("To String");

    private String groupName;

    private Groups(String name) {
      groupName = name;
    }

    public String groupName() {
      return groupName;
    }
  }

  private ViolationList violations;

  private ContractVerifier() {
    this.violations = new ViolationList();
  }

  /**
   * Verifies the package, in which can be found a datatype.
   *
   * @param packageName the valid package name.
   * @throws ContractException a list of contract violations.
   */
  public static void verifyPackage(String packageName) throws ContractException {
    Reflections reflections = new Reflections(packageName);
    var verifier = new ContractVerifier();

    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(c -> !c.getPackage().isAnnotationPresent(Deserializer.class))
        .forEach(
            sourceClass -> {
              verifier.verify(sourceClass);
            });

    if (!verifier.violations.isEmpty()) throw new ContractException(verifier.violations);
  }

  /**
   * Verifies the class by contract.
   *
   * @param sourceClass the class to verify by contract.
   * @throws ContractException a list of contract violations.
   */
  public static void verifyClass(Class<?> sourceClass) throws ContractException {
    var verifier = new ContractVerifier();
    verifier.verify(sourceClass);
    if (!verifier.violations.isEmpty()) throw new ContractException(verifier.violations);
  }

  private void verify(Class<?> sourceClass) {
    if (sourceClass.isInterface()
        || sourceClass.isAnnotationPresent(TestContainer.class)
        || sourceClass.isAnnotationPresent(Deserializer.class)
        || sourceClass == InputFile.class) {
      return;
    }
    verifyFields(sourceClass);
    verifyNamingContract(sourceClass);
    verifyGeneralInterfacesContract(sourceClass);
    if (!violations.isEmpty()) {
      return;
    }

    verifyToStringContract(sourceClass);
  }

  /**
   * Verifies the fields from class.
   *
   * @param sourceClass the class to verify.
   * @throws FieldsContractException a list of fields contract violations.
   */
  private void verifyFields(Class<?> sourceClass) {
    Fields fields = separateFields(sourceClass.getDeclaredFields());

    verifyNotNullContract(sourceClass, fields.notNullFields());
    verifyReturnOptionalTypeContract(sourceClass, fields.objectFields());
  }

  /**
   * Seprarate all declared fields by checking {@link NotNull} annotation, which defines that
   * specific field is not null. Skips fields with modifier "static".
   *
   * <p>Also this method check modifier of each field by privacy.
   *
   * @param allFields all declared fields of a instance.
   * @param errMessage the string builder, in which will be writes any violations.
   * @return separated fields, which writes into {@link Fields}.
   */
  private Fields separateFields(Field[] allFields) {
    List<Field> notNullFields = new ArrayList<>();
    List<Field> objectFields = new ArrayList<>();

    for (Field field : allFields) {

      if (field.isAnnotationPresent(NotNull.class)) {
        notNullFields.add(field);
      } else {
        objectFields.add(field);
      }
    }

    return new Fields(notNullFields, objectFields);
  }

  /**
   * Verifies the fields, which marked by {@link NotNull} annotation, by not-null contract.
   *
   * @param sourceClass the class for gets getters and setters for verifies return types.
   * @param notNullFields the fields, which marked by {@link NotNull} annotation.
   * @throws NotNullContractException a list of not-null contract violations.
   */
  private void verifyNotNullContract(Class<?> sourceClass, List<Field> notNullFields) {

    for (Field field : notNullFields) {
      if (WRAPPERS.contains(field.getType())) {
        violations.addTo(
            Groups.FIELDS.groupName(),
            Violation.create(
                "Field with @NotNull annotation is primitive type if possible",
                "Field is not primitive",
                field.toString()));
        continue;
      }
    }
  }

  /**
   * Verifies the fields, which marked by {@link NotNull} annotation, by optional type contract.
   *
   * @param sourceClass the source class for get the getter/setter for verifies return type contract.
   * @param objectFields the list of fields, which marked by {@link NotNull} annotation.
   * @throws ObjectFieldContractException a list of object fields contract violations.
   */
  private void verifyReturnOptionalTypeContract(Class<?> sourceClass, List<Field> objectFields) {

    for (Field field : objectFields) {
      if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      if (PRIMITIVES.contains(field.getType())) {
        violations.addTo(
            Groups.FIELDS.groupName(),
            Violation.create(
                "Field with @NotNull annotation is Object type",
                "Field is not Object type",
                field.toString()));
        continue;
      }
    }
  }

  /**
   * Verifies all fields by naming contract.
   *
   * @param sourceClass the class to verify.
   * @throws NamingContractException a list of fields contract violations.
   */
  private void verifyNamingContract(Class<?> sourceClass) {
    Field[] allFields = sourceClass.getDeclaredFields();

    for (Field field : allFields) {
      if (Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      String fieldName = field.getName();
      boolean isLower = isLower(fieldName);
      boolean haveSerializedNameAnnotation = field.isAnnotationPresent(SerializedName.class);
      String nameInAnnotation =
          haveSerializedNameAnnotation ? field.getAnnotation(SerializedName.class).value() : null;

      if ((isLower && haveSerializedNameAnnotation)
          || (!isLower && !haveSerializedNameAnnotation)) {
        violations.addTo(
            Groups.NAMING.groupName(),
            Violation.create(
                "Field name and name in annotation in right formats",
                "They're not",
                "Field name is " + fieldName + "\nAnnotation name is " + nameInAnnotation));
        continue;
      }

      if (haveSerializedNameAnnotation && !nameInAnnotation.matches(SNAKE_CASE_PATTERN)) {
        violations.addTo(
            Groups.NAMING.groupName(),
            Violation.create(
                "Valid format of snake case",
                nameInAnnotation,
                "Snake case is walid when all words in lowercase and spacing only by underscore"));
        continue;
      }

      if (!isLower && haveSerializedNameAnnotation) {
        String[] parts = nameInAnnotation.split(SNAKE_CASE_DELIMITER);
        StringBuilder nameInAnnotationInCamelCase = new StringBuilder(parts[0]);

        for (int i = 1; i < parts.length; i++) {
          nameInAnnotationInCamelCase
              .append(parts[i].substring(0, 1).toUpperCase())
              .append(parts[i].substring(1));
        }

        if (!nameInAnnotationInCamelCase.toString().equals(fieldName)) {
          violations.addTo(
              Groups.NAMING.groupName(),
              Violation.create(
                  "Field name and name in annotation are conventionally equals",
                  "They're not",
                  "Field name is "
                      + fieldName
                      + "\nAnnotation name is "
                      + nameInAnnotation
                      + "\ncamelCased annotation name id "
                      + nameInAnnotationInCamelCase.toString()));
        }
      }
    }
  }

  /**
   * Verifies is every character of camelCase name in lower case.
   *
   * @param fieldName the field name to verify.
   * @return true if the field name is camelCase and all characters in lower case, otherwise -
   *     false.
   */
  private boolean isLower(String fieldName) {
    boolean isCamelCase = fieldName.matches(CAMEL_CASE_PATTERN);
    boolean isLower = true;
    for (char symbol : fieldName.toCharArray()) {
      if (Character.isUpperCase(symbol)) {
        isLower = false;
        break;
      }
    }
    return isCamelCase && isLower;
  }

  /**
   * Verifies all fields by general interface contract.
   *
   * @param sourceClass the class to verify.
   * @throws GeneralInterfacesContractException a list of fields contract violations.
   */
  private void verifyGeneralInterfacesContract(Class<?> sourceClass) {
    Field[] allFields = sourceClass.getDeclaredFields();

    for (Field field : allFields) {
      Class<?> fieldType = field.getType();
      if (PRIMITIVES.contains(fieldType)
          || WRAPPERS.contains(fieldType)
          || fieldType.equals(String.class)) {
        continue;
      }

      Class<?>[] interfaces = fieldType.getInterfaces();
      for (Class<?> type : interfaces) {
        if (type.isAnnotationPresent(GeneralInterface.class)) {
          violations.addTo(
              Groups.GENERAL_INTERFACE.groupName(),
              Violation.create(
                  type.toString(), fieldType.toString(), "Field must use general interface!"));
        }
      }
    }
  }

  /**
   * Verifies toString method contract.
   *
   * @param sourceClass the class to verify.
   * @throws ToStringContractException toString contract violations.
   */
  private void verifyToStringContract(Class<?> sourceClass) {
    Method toStringMethod;
    if (sourceClass.isAnnotationPresent(EmptyClass.class) || sourceClass.isArray()) {
      return;
    }

    try {
      toStringMethod = sourceClass.getMethod(TO_STRING_METHOD_NAME);
    } catch (NoSuchMethodException e) {
      violations.addTo(
          Groups.TO_STRING.groupName(),
          Violation.create(
              "Method toString() is present",
              "This method is not found",
              "Source class is " + sourceClass.toString()));
      return;
    }

    final int depth = 1;
    final float generateAllFields = 1f;
    Object instance = TypeFactory.generate(sourceClass, depth, generateAllFields);

    Object toStringResult;
    try {
      toStringResult = toStringMethod.invoke(instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      violations.addTo(
          Groups.TO_STRING.groupName(),
          Violation.create(
              "Method toString() successfully invocates",
              e.getMessage(),
              "Source class is " + sourceClass.toString()));
      return;
    }

    if (!(toStringResult instanceof String toStringText)) {
      violations.addTo(
          Groups.TO_STRING.groupName(),
          Violation.create(
              "Returned value is String", "It's not", "Source class is " + sourceClass.toString()));
      return;
    }

    verifyToStringText(toStringText, instance);
  }

  /**
   * Verifies the toString method template, key and values between string and object instance.
   *
   * @param text the generated text by toString method by the instance.
   * @param instance the instance with filled values, used to be compate to the text.
   * @throws ToStringContractException toString contract violations.
   */
  private void verifyToStringText(String text, Object instance) {
    String className = instance.getClass().getSimpleName();
    Class<?> instanceClass = instance.getClass();

    if (!(text.startsWith(className + "[") && text.endsWith("]"))) {
      violations.addTo(
          Groups.TO_STRING.groupName(),
          Violation.create(
              "Returned value in pattern ClassName[key=value]",
              "It's not",
              "Source object is " + instance));
      return;
    }

    final int bracketsWidth = 1;
    String contentText =
        text.substring(className.length() + bracketsWidth, text.length() - bracketsWidth);
    final int oneTime = 2;
    while (!contentText.isBlank()) {
      String[] pair = contentText.split("=", oneTime);
      String key = pair[0];
      String remainingTextPart = pair[1];

      Field referencedField;
      try {
        referencedField = instanceClass.getDeclaredField(key);
      } catch (NoSuchFieldException e) {
        violations.addTo(
            Groups.TO_STRING.groupName(),
            Violation.create(
                "Returned text contains field name",
                "It don't",
                "Source object is " + instance + "and its referenced field " + key));
        return;
      }

      try {
        if (referencedField.getType().isPrimitive()) {
          contentText = verifyAndCutTextForPrimitive(remainingTextPart, referencedField, instance);
        } else {
          contentText = verifyAndCutText(remainingTextPart, referencedField, instance);
        }
      } catch (IllegalValueToStringException e) {
        String expectedValue = e.getMessage();
        violations.addTo(
            Groups.TO_STRING.groupName(),
            Violation.create(
                expectedValue,
                text,
                "Invalid value in generated text by toString() method. Note: the actual"
                    + " text is the right remaining part after cutting the text by '='"
                    + " char."));
      } catch (ToStringContractException e) {
        violations.extendFrom(e.getViolations());
      }
    }
  }

  /**
   * If the referenced filed type is primitive, this method define a type, gets from instance and,
   * after verifying values, cut the remaining text.
   *
   * @param remainingTextPart the remaining text, which in begin generated by toString method.
   * @param referencedField the referenced field.
   * @param instance the instance, from which gets a value.
   * @return a cutted text (without verified key and value).
   * @throws IllegalValueToStringException inconsistence of values between from text and from
   *     instnace.
   * @throws ToStringContractException accessing to field value error or doesn't find matched typed.
   */
  private String verifyAndCutTextForPrimitive(
      String remainingTextPart, Field referencedField, Object instance)
      throws IllegalValueToStringException, ToStringContractException {
    Class<?> primitiveType = referencedField.getType();
    Class<?> instanceClass = instance.getClass();

    if (primitiveType.equals(Integer.TYPE)) {
      int value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getInt(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Long.TYPE)) {
      long value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getLong(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Short.TYPE)) {
      short value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getShort(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Double.TYPE)) {
      double value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getDouble(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Float.TYPE)) {
      float value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getFloat(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Boolean.TYPE)) {
      boolean value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getBoolean(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Byte.TYPE)) {
      byte value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getByte(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    if (primitiveType.equals(Character.TYPE)) {
      char value;
      referencedField.setAccessible(true);
      try {
        value = referencedField.getChar(instance);
      } catch (IllegalAccessException e) {
        var exception = generateAccessingException(primitiveType, referencedField, instanceClass);
        throw exception;
      }
      referencedField.setAccessible(false);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);
    }

    throw new ToStringContractException(
        "Not matched primitive type.\nPrimitive type: "
            + primitiveType
            + "\nSource:"
            + instanceClass);
  }

  /**
   * Creates the {@link ToStringContractException} by template.
   *
   * @param primitiveType - the referenced field type.
   * @param referencedField - the referenced field in the instance.
   * @param instanceClass - a type of the instance.
   * @return an exception by template.
   * @throws ToStringContractException toString method contract violations.
   */
  private static ToStringContractException generateAccessingException(
      Class<?> primitiveType, Field referencedField, Class<?> instanceClass) {
    return new ToStringContractException(
        new ViolationList()
            .addTo(
                Groups.TO_STRING.groupName(),
                Violation.create(
                    referencedField.toString() + " is accessible",
                    "An error occured while accesing to this field",
                    "Source type is " + instanceClass)));
  }

  /**
   * If the referenced filed type is not primitive, this method define is it wrapper or base type,
   * or complex type like datatype. Gets value from instance and verify it, and after cut the
   * remaining text, if type is wrapper or base type. Otherwise verifies inner type, and calls its
   * toString method and verify received value, and after cut the remaining text.
   *
   * @param remainingTextPart the remaining text, which in begin generated by toString method.
   * @param referencedField the referenced field.
   * @param instance the instance, from which gets a value.
   * @return a cutted text (without verified key and value).
   * @throws IllegalValueToStringException inconsistence of values between from text and from
   *     instnace.
   * @throws ToStringContractException error of accessing to field value or method toString.
   */
  private String verifyAndCutText(String remainingTextPart, Field referencedField, Object instance)
      throws IllegalValueToStringException, ToStringContractException {
    Class<?> type = referencedField.getType();

    if (type.equals(String.class) || WRAPPERS.contains(type)) {
      Object value = getObjectValue(referencedField, instance);

      String valueAsString = String.valueOf(value);
      return cutMatchedText(remainingTextPart, valueAsString);

    } else {
      Object value = getObjectValue(referencedField, instance);

      String objectToStringText = value == null ? "null" : verifyInnerTypeAndGetToStringText(value);
      return cutMatchedText(remainingTextPart, objectToStringText);
    }
  }

  /**
   * Extracts the object value from the instance by the referenced field.
   *
   * @param field the referenced field.
   * @param instance the instance, from which will extract a value.
   * @return a value from the referenced field.
   * @throws ToStringContractException error of accessing to field value.
   */
  private static Object getObjectValue(Field field, Object instance)
      throws ToStringContractException {
    Object value;
    field.setAccessible(true);
    try {
      value = field.get(instance);
    } catch (IllegalAccessException e) {
      return generateAccessingException(field.getType(), field, instance.getClass());
    }
    field.setAccessible(false);
    return value;
  }

  /**
   * Verifies inner type and return a text, generated by toString method.
   *
   * @param instance the instance to verify and uses to get a text by toString method.
   * @param a text, which generated by toString method of the instance.
   * @throws ToStringContractException errors of accessing to toString method or toString contract
   *     violations.
   */
  private String verifyInnerTypeAndGetToStringText(Object instance)
      throws ToStringContractException {
    Class<?> instanceClass = instance.getClass();

    String objectToStringText;
    if (instanceClass.isArray()) {
      objectToStringText = getArrayAsString(instance);
    } else {
      objectToStringText = invokeToStringMethodAndGetString(instance);
    }

    if (!instanceClass.isAnnotationPresent(EmptyClass.class) && !instanceClass.isArray())
      verifyToStringText(objectToStringText, instance);

    return objectToStringText;
  }

  /**
   * If the type is an array, gets toString method from {@link Arrays} class by type of instance.
   * Calls it and returns result text.
   *
   * @param instance the instance as array.
   * @return a value, which received from {@link Arrays}.toString method.
   * @throws RuntimeException accessing errors.
   */
  private static String getArrayAsString(Object instance) throws ToStringContractException {
    Method toStringMethod;
    Class<?> instanceClass = instance.getClass();

    try {
      toStringMethod = Arrays.class.getMethod(TO_STRING_METHOD_NAME, instanceClass);
    } catch (NoSuchMethodException e) {
      throw new ToStringContractException(
          new ViolationList()
              .addTo(
                  Groups.TO_STRING.groupName(),
                  Violation.create(
                      "Method Arrays.toString(T) is present for the T type " + instanceClass,
                      "This method is not found",
                      "Be sure that Arrays class may don't contain method for very different"
                          + " types")));
    }
    String objectToStringText;
    try {
      objectToStringText = (String) toStringMethod.invoke(null, instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new ToStringContractException(
          new ViolationList()
              .addTo(
                  Groups.TO_STRING.groupName(),
                  Violation.create(
                      "Method Arrays.toString(T) successfully invocates for the T type "
                          + instanceClass,
                      e.getMessage(),
                      "Source class is " + instanceClass)));
    }

    return objectToStringText;
  }

  /**
   * Invokes toString method, which get from the instance by method name. And calls it and returns
   * received result.
   *
   * @param instance the instance, which uses to find and call toString method.
   * @return a text, generated by toString method.
   * @throws ToStringContractException accessing error.
   */
  private static String invokeToStringMethodAndGetString(Object instance)
      throws ToStringContractException {
    Method toStringMethod;
    Class<?> instanceClass = instance.getClass();
    try {
      toStringMethod = instance.getClass().getMethod(TO_STRING_METHOD_NAME);
    } catch (NoSuchMethodException e) {
      throw new ToStringContractException(
          new ViolationList()
              .addTo(
                  Groups.TO_STRING.groupName(),
                  Violation.create(
                      "Method toString() is present",
                      "This method is not found",
                      "Source class is " + instanceClass.toString())));
    }

    String objectToStringText;
    try {
      objectToStringText = (String) toStringMethod.invoke(instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new ToStringContractException(
          new ViolationList()
              .addTo(
                  Groups.TO_STRING.groupName(),
                  Violation.create(
                      "Method toString() successfully invocates",
                      e.getMessage(),
                      "Source class is " + instanceClass)));
    }

    return objectToStringText;
  }

  /**
   * Verifies the matched text by chars and after this cuts the text.
   *
   * @param remainingTextPart the remaining text, which in begin generated by toString method.
   * @param value the value as String, uses to verify and cut text.
   * @return a cutted text.
   * @throws IllegalValueToStringException inconsistence of values.
   */
  private static String cutMatchedText(String remainingTextPart, String value)
      throws IllegalValueToStringException {
    for (int i = 0; i < value.length(); i++) {
      if (remainingTextPart.charAt(i) != value.charAt(i)) {
        throw new IllegalValueToStringException(value);
      }
    }

    String cuttedText = remainingTextPart.substring(value.length());
    if (!cuttedText.isBlank()) {
      if (cuttedText.startsWith(TO_STRING_TEXT_SEPARATOR)) {
        cuttedText = cuttedText.substring(TO_STRING_TEXT_SEPARATOR.length());
      } else {
        throw new IllegalValueToStringException(value);
      }
    }

    return cuttedText;
  }
}

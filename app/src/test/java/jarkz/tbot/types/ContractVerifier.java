package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.ContractException;
import jarkz.tbot.exceptions.types.FieldsContractException;
import jarkz.tbot.exceptions.types.GeneralInterfacesContractException;
import jarkz.tbot.exceptions.types.IllegalValueToStringException;
import jarkz.tbot.exceptions.types.NamingContractException;
import jarkz.tbot.exceptions.types.NotNullContractException;
import jarkz.tbot.exceptions.types.ObjectFieldContractException;
import jarkz.tbot.exceptions.types.ToStringContractException;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.annotations.EmptyClass;
import jarkz.tbot.types.annotations.GeneralInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

  private static final String NEXT_LINE = "\n";
  private static final String SKIP_LINE = "\n\n";

  private static final String WRAP_LINE =
      "------------------------------------------------------------------------------";

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

  private static final String GETTER_PREFIX_FOR_BOOLEAN = "is";

  private static final String GETTER_PREFIX = "get";

  private static final String SETTER_PREFIX = "set";

  private static final String CAMEL_CASE_PATTERN = "[a-z]+((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?";

  private static final String SNAKE_CASE_PATTERN = "[a-z0-9]+(?:_[a-z0-9]+)*";

  private static final String SNAKE_CASE_DELIMITER = "_";

  private static final String TO_STRING_METHOD_NAME = "toString";

  private static final String TO_STRING_TEXT_SEPARATOR = ", ";

  /**
   * Verifies the package, in which can be found a datatype.
   *
   * @param packageName the valid package name.
   * @throws ContractException a list of contract violations.
   */
  public static void verifyPackage(String packageName) throws ContractException {
    Reflections reflections = new Reflections(packageName);
    StringBuilder errMessage = new StringBuilder();

    reflections.get(Scanners.SubTypes.of(Object.class).asClass()).stream()
        .filter(c -> !c.getPackage().isAnnotationPresent(Deserializer.class))
        .forEach(
            clazz -> {
              try {
                verifyClass(clazz);
              } catch (ContractException e) {
                errMessage.append(e.getMessage()).append(WRAP_LINE).append(SKIP_LINE);
              }
            });

    if (!errMessage.isEmpty()) throw new ContractException(errMessage.toString());
  }

  /**
   * Verifies the class by contract.
   *
   * @param clazz the class to verify by contract.
   * @throws ContractException a list of contract violations.
   */
  public static void verifyClass(Class<?> clazz) throws ContractException {
    if (clazz.isInterface() || clazz.isAnnotationPresent(TestContainer.class)) return;
    StringBuilder errMessage = new StringBuilder();

    try {
      verifyFields(clazz);
    } catch (FieldsContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    try {
      verifyNamingContract(clazz);
    } catch (NamingContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    try {
      verifyGeneralInterfacesContract(clazz);
    } catch (GeneralInterfacesContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    if (!errMessage.isEmpty()) {
      throw new ContractException(errMessage.toString());
    }

    if (clazz.isAnnotationPresent(EmptyClass.class)
        || clazz.isAnnotationPresent(Deserializer.class)) return;

    try {
      verifyToStringContract(clazz);
    } catch (ToStringContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    if (!errMessage.isEmpty()) throw new ContractException(errMessage.toString());
  }

  /**
   * Verifies the fields from class.
   *
   * @param clazz the class to verify.
   * @throws FieldsContractException a list of fields contract violations.
   */
  private static void verifyFields(Class<?> clazz) throws FieldsContractException {
    StringBuilder errMessage = new StringBuilder();
    Fields fields = separateFields(clazz.getDeclaredFields(), errMessage);

    try {
      verifyNotNullContract(clazz, fields.notNullFields());
    } catch (NotNullContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    try {
      verifyReturnOptionalTypeContract(clazz, fields.objectFields());
    } catch (ObjectFieldContractException e) {
      errMessage.append(e.getMessage()).append(SKIP_LINE);
    }

    if (!errMessage.isEmpty()) throw new FieldsContractException(errMessage.toString());
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
  private static Fields separateFields(Field[] allFields, StringBuilder errMessage) {
    List<Field> notNullFields = new ArrayList<>();
    List<Field> objectFields = new ArrayList<>();

    for (Field field : allFields) {
      if (Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      if (Modifier.isPublic(field.getModifiers())) {
        errMessage
            .append("Field must be private or protected!\nField: ")
            .append(field)
            .append(NEXT_LINE);
        continue;
      }

      if (field.isAnnotationPresent(NotNull.class)) {
        notNullFields.add(field);
      } else {
        objectFields.add(field);
      }
    }

    if (!errMessage.isEmpty()) errMessage.append(NEXT_LINE);
    return new Fields(notNullFields, objectFields);
  }

  /**
   * Verifies the fields, which marked by {@link NotNull} annotation, by not-null contract.
   *
   * @param sourceClass the class for gets getters and setters for verifies return types.
   * @param notNullFields the fields, which marked by {@link NotNull} annotation.
   * @throws NotNullContractException a list of not-null contract violations.
   */
  private static void verifyNotNullContract(Class<?> sourceClass, List<Field> notNullFields)
      throws NotNullContractException {
    StringBuilder errMessage = new StringBuilder();

    for (Field field : notNullFields) {
      if (WRAPPERS.contains(field.getType())) {
        errMessage
            .append(
                "By contract, fields marked with the @NotNull annotation must be primitive if"
                    + " possible!\nField: ")
            .append(field)
            .append("\nSource: ")
            .append(sourceClass)
            .append(NEXT_LINE);
        continue;
      }

      Optional<Method> optionalGetter = getGetter(sourceClass, field, errMessage);
      if (optionalGetter.isEmpty()) {
        return;
      }

      Optional<Method> optionalSetter = getSetter(sourceClass, field, errMessage);
      if (optionalSetter.isEmpty()) {
        return;
      }

      Method getter = optionalGetter.get();
      Method setter = optionalSetter.get();

      verifyGettersForNotNullField(sourceClass, getter, field, errMessage);
      verifySettersForNotNullField(sourceClass, setter, field, errMessage);
    }

    if (!errMessage.isEmpty()) throw new NotNullContractException(errMessage.toString());
  }

  /**
   * Verifies availability and return type of getter for specific field.
   *
   * @param sourceClass the class for get the getter.
   * @param field the referenced field to class.
   * @param errMessage the string builder, in which will be writes any violations.
   */
  private static void verifyGettersForNotNullField(
      Class<?> sourceClass, Method getter, Field field, StringBuilder errMessage) {

    if (!getter.getReturnType().equals(field.getType())) {
      errMessage
          .append("Field type and his getter return type not equals.\nField: ")
          .append(field)
          .append("\nGetter return type: ")
          .append(getter.getReturnType())
          .append("\nSource: ")
          .append(sourceClass)
          .append(NEXT_LINE);
    }
  }

  /**
   * Verifies availability and return type of setter for specific field.
   *
   * @param sourceClass the class for get the setter.
   * @param field the referenced field to class.
   * @param errMessage the string builder, in which will be writes any violations.
   */
  private static void verifySettersForNotNullField(
      Class<?> sourceClass, Method setter, Field field, StringBuilder errMessage) {

    if (!setter.getReturnType().equals(void.class)) {
      errMessage
          .append("Setter return type is not void.\nField: ")
          .append(field)
          .append("\nSetter return type: ")
          .append(setter.getReturnType())
          .append("\nSource: ")
          .append(sourceClass)
          .append(NEXT_LINE);
    }
  }

  /**
   * Verifies the fields, which marked by {@link NotNull} annotation, by optional type contract.
   *
   * @param clazz the source class for get the getter/setter for verifies return type contract.
   * @param objectFields the list of fields, which marked by {@link NotNull} annotation.
   * @throws ObjectFieldContractException a list of object fields contract violations.
   */
  private static void verifyReturnOptionalTypeContract(Class<?> clazz, List<Field> objectFields)
      throws ObjectFieldContractException {
    StringBuilder errMessage = new StringBuilder();

    for (Field field : objectFields) {
      if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      if (PRIMITIVES.contains(field.getType())) {
        errMessage
            .append(
                "By contract, fields not marked with the @NotNull annotation must be Objects!\n")
            .append("Field: ")
            .append(field)
            .append(NEXT_LINE);
        continue;
      }

      Optional<Method> optionalGetter = getGetter(clazz, field, errMessage);
      if (optionalGetter.isEmpty()) {
        return;
      }

      Optional<Method> optionalSetter = getSetter(clazz, field, errMessage);
      if (optionalSetter.isEmpty()) {
        return;
      }

      Method getter = optionalGetter.get();
      Method setter = optionalSetter.get();

      verifyGettersForObjectiveField(clazz, getter, field, errMessage);
      verifySettersForObjectiveField(clazz, setter, field, errMessage);
      verifyActualBehaviorGetAndSetMethods(clazz, setter, getter, errMessage);
    }

    if (!errMessage.isEmpty()) {
      throw new ObjectFieldContractException(errMessage.toString());
    }
  }

  /**
   * Verifies availability and return type of getter for specific objective field.
   *
   * @param sourceClass the class for get the getter.
   * @param getter the getter for current type.
   * @param field the referenced field to class.
   * @param errMessage the string builder, in which will be writes any violations.
   */
  private static void verifyGettersForObjectiveField(
      Class<?> sourceClass, Method getter, Field field, StringBuilder errMessage) {

    Class<?> returnType = getter.getReturnType();
    Type genericReturnType;
    if (getter.getGenericReturnType() instanceof ParameterizedType) {
      genericReturnType =
          ((ParameterizedType) getter.getGenericReturnType()).getActualTypeArguments()[0];
    } else {
      appendErrorOfReturnType(errMessage, getter, field, sourceClass);
      return;
    }

    if (!returnType.equals(Optional.class) || !genericReturnType.equals(field.getGenericType())) {
      appendErrorOfReturnType(errMessage, getter, field, sourceClass);
    }
  }

  /**
   * Verifies actual behavior of setters and getters. Sets null value and gets empty Optional type,
   * otherwise writes errors.
   *
   * <p>Also check default constructor and invocation methods.
   *
   * @param sourceClass the class for creating new instance.
   * @param setter the setter for current type.
   * @param getter the getter for current type.
   * @param errMessage the string builder, in which will be writes any violations.
   */
  @SuppressWarnings("rawtypes")
  private static void verifyActualBehaviorGetAndSetMethods(
      Class<?> sourceClass, Method setter, Method getter, StringBuilder errMessage) {
    Object instance;
    try {
      instance = sourceClass.getDeclaredConstructor().newInstance();
    } catch (InvocationTargetException
        | IllegalAccessException
        | InstantiationException
        | NoSuchMethodException e) {
      errMessage
          .append("An error occured in invocation constructor!\nConstructor of ")
          .append(sourceClass)
          .append("not defined! Check modifiers, parameters. Mut be base constructor without")
          .append(" arguments!")
          .append(NEXT_LINE);
      return;
    }

    try {
      setter.invoke(instance, new Object[] {null});
    } catch (IllegalAccessException e) {
      errMessage.append("Cannot invoke setter method: ").append(setter).append(NEXT_LINE);
      return;
    } catch (InvocationTargetException e) {
      errMessage
          .append("An error occurred while invoking setter method: ")
          .append(setter)
          .append(NEXT_LINE);
      return;
    }

    Object returnValue;
    try {
      returnValue = getter.invoke(instance);
    } catch (IllegalAccessException e) {
      errMessage.append("Cannot invoke getter method: ").append(getter).append(NEXT_LINE);
      return;
    } catch (InvocationTargetException e) {
      var cause = e.getCause();
      if (cause instanceof NullPointerException) {
        errMessage
            .append("Catched NullPointerException from getter method: ")
            .append(getter)
            .append("\nCheck your implementation! Must be Optional.ofNullable() method!")
            .append(NEXT_LINE);
      } else {
        errMessage
            .append("An error occurred while invoking getter method: ")
            .append(getter)
            .append(NEXT_LINE);
      }
      return;
    }

    if (returnValue instanceof Optional) {
      var realInstance = (Optional) returnValue;
      if (realInstance.isEmpty()) {
        return;
      }

      errMessage
          .append("Returned value must be Optional.empty() when passed null value!\n")
          .append("Returned value: ")
          .append(realInstance)
          .append(NEXT_LINE);
    } else {
      errMessage
          .append("Returned value is not Optional<T> type!\n")
          .append("Returned type is: ")
          .append(returnValue.getClass())
          .append(NEXT_LINE);
    }
  }

  private static void verifySettersForObjectiveField(
      Class<?> sourceClass, Method setter, Field field, StringBuilder errMessage) {

    if (!setter.getReturnType().equals(void.class)) {
      errMessage
          .append("Setter for objective field returns non-void type.\nField: ")
          .append(field)
          .append("\nSetter return type: ")
          .append(setter.getReturnType())
          .append("\nSource: ")
          .append(sourceClass)
          .append(NEXT_LINE);
    }
  }

  /**
   * Returns the getter method by general rules.
   *
   * @param sourceClass the class for get the getter.
   * @param field the referenced field.
   * @param errMessage the string builder, in which will be writes any violations.
   * @return the getter method.
   */
  private static Optional<Method> getGetter(
      Class<?> sourceClass, Field field, StringBuilder errMessage) {
    String fieldName = field.getName();
    String getterMethodName;
    if (field.getType().equals(Boolean.TYPE) && fieldName.startsWith(GETTER_PREFIX_FOR_BOOLEAN)) {
      getterMethodName = fieldName;
    } else {
      String prefix =
          field.getType().equals(Boolean.TYPE) ? GETTER_PREFIX_FOR_BOOLEAN : GETTER_PREFIX;
      getterMethodName = prefix + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    Method getter = null;
    try {
      getter = sourceClass.getMethod(getterMethodName);
    } catch (NoSuchMethodException e) {
      errMessage
          .append("Not found getter for objective field.\nField: ")
          .append(field)
          .append("\nSource: ")
          .append(sourceClass)
          .append(NEXT_LINE);
    }

    return Optional.ofNullable(getter);
  }

  /**
   * Returns the setter method by general rules.
   *
   * @param sourceClass the class for get the setter.
   * @param field the referenced field.
   * @param errMessage the string builder, in which will be writes any violations.
   * @return the setter method.
   */
  private static Optional<Method> getSetter(
      Class<?> sourceClass, Field field, StringBuilder errMessage) {
    String fieldName = field.getName();
    String setterMethodName;
    String prefix = SETTER_PREFIX;
    if (field.getType().equals(Boolean.TYPE) && fieldName.startsWith(GETTER_PREFIX_FOR_BOOLEAN)) {
      setterMethodName = prefix + fieldName.substring(GETTER_PREFIX_FOR_BOOLEAN.length());
    } else {
      setterMethodName = prefix + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    Method setter = null;
    try {
      setter = sourceClass.getMethod(setterMethodName, field.getType());
    } catch (NoSuchMethodException e) {
      errMessage
          .append("Not found setter for objective field.\nField: ")
          .append(field)
          .append("\nSource: ")
          .append(sourceClass)
          .append(NEXT_LINE);
    }

    return Optional.ofNullable(setter);
  }

  /**
   * Appends another one error to string builder.
   *
   * @param errMessage the string builder, in which will be writes any violations.
   * @param getter the referenced method.
   * @param field the referenced field.
   * @param source the source class, in which found violation.
   */
  private static void appendErrorOfReturnType(
      StringBuilder errMessage, Method getter, Field field, Class<?> source) {
    errMessage
        .append("The returned type must be an Optional with a generic type equal to fields type!\n")
        .append("The actual return type: ")
        .append(getter.getGenericReturnType())
        .append("\nThe field type: ")
        .append(field.getType())
        .append("\nSource: ")
        .append(source)
        .append(NEXT_LINE);
  }

  /**
   * Verifies all fields by naming contract.
   *
   * @param clazz the class to verify.
   * @throws NamingContractException a list of fields contract violations.
   */
  private static void verifyNamingContract(Class<?> clazz) throws NamingContractException {
    Field[] allFields = clazz.getDeclaredFields();
    StringBuilder errMessage = new StringBuilder();

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
        errMessage
            .append("Naming conflictions!\nField name: ")
            .append(fieldName)
            .append("\nName in annotation: ")
            .append(nameInAnnotation)
            .append("\nSource: ")
            .append(clazz)
            .append(SKIP_LINE);
        continue;
      }

      if (haveSerializedNameAnnotation && !nameInAnnotation.matches(SNAKE_CASE_PATTERN)) {
        errMessage
            .append("Invalid format of snake_case!\nValue: ")
            .append(nameInAnnotation)
            .append("\nSource: ")
            .append(clazz)
            .append(SKIP_LINE);
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
          errMessage
              .append("Names is not equals by logic!\nField name in camelCase: ")
              .append(fieldName)
              .append("\nValue in annotation in snake_case: ")
              .append(nameInAnnotation)
              .append("\nValue in annotation in camelCase: ")
              .append(nameInAnnotationInCamelCase.toString())
              .append("\nSource: ")
              .append(clazz)
              .append(SKIP_LINE);
        }
      }
    }

    if (!errMessage.isEmpty()) throw new NamingContractException(errMessage.toString());
  }

  /**
   * Verifies is every character of camelCase name in lower case.
   *
   * @param fieldName the field name to verify.
   * @return true if the field name is camelCase and all characters in lower case, otherwise -
   *     false.
   */
  private static boolean isLower(String fieldName) {
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
   * @param clazz the class to verify.
   * @throws GeneralInterfacesContractException a list of fields contract violations.
   */
  private static void verifyGeneralInterfacesContract(Class<?> clazz)
      throws GeneralInterfacesContractException {
    Field[] allFields = clazz.getDeclaredFields();
    StringBuilder errMessage = new StringBuilder();

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
          errMessage
              .append("Field must use general interface!\nExpected type:")
              .append(type)
              .append("\nUsed type: ")
              .append(fieldType)
              .append(NEXT_LINE);
        }
      }
    }

    if (!errMessage.isEmpty()) throw new GeneralInterfacesContractException(errMessage.toString());
  }

  /**
   * Verifies toString method contract.
   *
   * @param clazz the class to verify.
   * @throws ToStringContractException toString contract violations.
   */
  private static void verifyToStringContract(Class<?> clazz) throws ToStringContractException {
    Method toStringMethod;
    if (clazz.isAnnotationPresent(EmptyClass.class) || clazz.isArray()) {
      return;
    }

    try {
      toStringMethod = clazz.getMethod(TO_STRING_METHOD_NAME);
    } catch (NoSuchMethodException e) {
      throw new ToStringContractException(
          "Method toString() not found!\nSource: " + clazz + NEXT_LINE);
    }

    final int depth = 1;
    final float generateAllFields = 1f;
    Object instance = TypeFactory.generate(clazz, depth, generateAllFields);

    Object toStringResult;
    try {
      toStringResult = toStringMethod.invoke(instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new ToStringContractException(
          "An error occured in invocation toString() method!\nError message: "
              + e
              + "\nSource: "
              + clazz
              + NEXT_LINE);
    }

    if (!(toStringResult instanceof String toStringText)) {
      throw new ToStringContractException(
          "Returned value of toString() method is not String. Must be a Stirng result.\nSource: "
              + clazz);
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
  private static void verifyToStringText(String text, Object instance)
      throws ToStringContractException {
    String className = instance.getClass().getSimpleName();
    Class<?> instanceClass = instance.getClass();

    if (!(text.startsWith(className + "[") && text.endsWith("]"))) {
      throw new ToStringContractException(
          "Text of toString() method not starts with \""
              + className
              + "[\"  and ends with "
              + "\"]\".\nActual: "
              + text
              + "\nSource: "
              + instanceClass
              + NEXT_LINE);
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
        e.printStackTrace();
        throw new ToStringContractException(
            "Not found the referenced field in generated toString() method with name: "
                + key
                + "\nSource: "
                + instanceClass);
      }

      try {
        if (referencedField.getType().isPrimitive()) {
          contentText = verifyAndCutTextForPrimitive(remainingTextPart, referencedField, instance);
        } else {
          contentText = verifyAndCutText(remainingTextPart, referencedField, instance);
        }
      } catch (IllegalValueToStringException e) {
        String expectedValue = e.getMessage();
        throw new ToStringContractException(
            "Invalid value in generated text by toString() method.\nField: "
                + referencedField.getName()
                + "\nExpected value: "
                + expectedValue
                + "\nActual text: "
                + text
                + NEXT_LINE);
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
  private static String verifyAndCutTextForPrimitive(
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
        var exception =
            generateToStringExceptionForPrimitiveType(
                primitiveType, referencedField, instanceClass);
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
  private static ToStringContractException generateToStringExceptionForPrimitiveType(
      Class<?> primitiveType, Field referencedField, Class<?> instanceClass) {
    return new ToStringContractException(
        "An error occurred in accessing to primitive field with type "
            + primitiveType
            + ".\nField: "
            + referencedField
            + "\nSource: "
            + instanceClass
            + NEXT_LINE);
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
  private static String verifyAndCutText(
      String remainingTextPart, Field referencedField, Object instance)
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
      throw new ToStringContractException(
          "An error occurred in accessing to field with type "
              + field.getType()
              + ".\nField: "
              + field
              + "\nSource: "
              + instance.getClass()
              + NEXT_LINE);
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
  private static String verifyInnerTypeAndGetToStringText(Object instance)
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
          "Can't find the toString method in Arrays class for specific source class.\n"
              + "Source class: "
              + instanceClass
              + "\nError message: "
              + e.getMessage());
    }
    String objectToStringText;
    try {
      objectToStringText = (String) toStringMethod.invoke(null, instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new ToStringContractException(
          "An error occurred while trying to invoke toString method from Arrays class for source"
              + " instance.\n"
              + "Source instance: "
              + instance
              + "\nError message: "
              + e.getMessage());
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
          "Method toString() not found!\nSource: " + instanceClass + NEXT_LINE);
    }

    String objectToStringText;
    try {
      objectToStringText = (String) toStringMethod.invoke(instance);
    } catch (InvocationTargetException | IllegalAccessException e) {
      throw new ToStringContractException(
          "An error occured in invocation toString() method!\nError message: "
              + e
              + "\nSource: "
              + instanceClass
              + NEXT_LINE);
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

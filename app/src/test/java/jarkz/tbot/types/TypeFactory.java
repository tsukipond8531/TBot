package jarkz.tbot.types;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.TestContainer;
import jarkz.tbot.exceptions.types.TypeGenerationException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class can generate any datatypes or another objects (like POJO) and fills random values.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class TypeFactory<T> {

  private record Fields(List<Field> nonnullFields, List<Field> nullableFields) {}

  private static final int BASE_DETPH = 1;
  private static final float BASE_CHANCE = 0.35f;

  /**
   * Generates a base type instance and fills all fields for a datatype.
   *
   * @param baseType the base type, which will be created and its fields will be filled.
   * @param depth the depth of the fields which fill.
   * @param nullableFieldsChance the chance, which used for defining whether to fill fields, which
   *     not marked by {@link NotNull} annotation.
   * @return a generated base type instance.
   */
  public static <T> T generate(Class<T> baseType, int depth, float nullableFieldsChance) {
    if (baseType == InputFile.class) {
      return null;
    }
    TypeFactory<T> factory = new TypeFactory<>(depth, nullableFieldsChance);
    return factory.generateInstance(baseType);
  }

  /**
   * Generates a base type instance and fills all fields for a datatype. With default depth and
   * nullable field chance.
   *
   * <p>DEFAULT VALUES: Base depth - 1 Nullable fields chance - 0.35f
   *
   * @param baseType the base type, which will be created and its fields will be filled.
   * @return a generated base type instance.
   */
  public static <T> T generate(Class<T> baseType) {
    if (baseType == InputFile.class) {
      return null;
    }
    TypeFactory<T> factory = new TypeFactory<>(BASE_DETPH, BASE_CHANCE);
    return factory.generateInstance(baseType);
  }

  private int depth = BASE_DETPH;

  private float nullableFieldsChance = BASE_CHANCE;

  private final int STRING_WIDTH = 15;

  private final int DEFAULT_ARRAY_SIZE = 20;

  private TypeFactory() {}

  /**
   * Creates the instance of {@link TypeFactory}.
   *
   * @param depth the depth of the fields which fill.
   * @param nullableFieldsChance the chance, which used for defining whether to fill fields, which
   *     not marked by {@link NotNull} annotation.
   */
  private TypeFactory(int depth, float nullableFieldsChance) {
    this.depth = depth;
    this.nullableFieldsChance = nullableFieldsChance;
  }

  /**
   * Generates a base type instance and fills all fields for a datatype. If you use unknow type,
   * please use static method {@link TypeFactory#generate(Class, int, float)} instead of this
   * method.
   *
   * @param baseType the base type, which will be created and its fields will be filled.
   * @return a generated base type instance.
   */
  private T generateInstance(Class<T> baseType) {
    T baseInstance = invokeBaseConstructor(baseType);
    Field[] allFields = baseType.getDeclaredFields();

    Fields separatedFields = separateFields(allFields);
    fillPrimitiveFields(baseInstance, separatedFields.nonnullFields());
    fillWrappersAndBasicTypeFields(baseInstance, separatedFields);

    if (depth > 0) {
      fillNotNullTypes(baseInstance, separatedFields.nonnullFields());
      fillNullableTypes(baseInstance, separatedFields.nullableFields());
    }

    return baseInstance;
  }

  private T invokeBaseConstructor(Class<T> baseType) {
    T baseInstance = null;
    try {
      baseInstance = baseType.getDeclaredConstructor().newInstance();
    } catch (InvocationTargetException
        | IllegalAccessException
        | InstantiationException
        | NoSuchMethodException e) {
      throw new TypeGenerationException(
          "Doesn't found the base constructor or error of invocation.\nSource class: "
              + baseType
              + "\nError message: "
              + e.getMessage());
    }

    return baseInstance;
  }

  /**
   * Seprarate all declared fields by checking {@link NotNull} annotation, which defines that
   * specific field is not null.
   *
   * @param allFields all declared fields of a instance.
   * @return separated fields, which writes into {@link Fields}.
   */
  private Fields separateFields(Field[] allFields) {
    List<Field> nonnullFields = new ArrayList<>();
    List<Field> nullableFields = new ArrayList<>();
    for (Field field : allFields) {
      if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      if (field.isAnnotationPresent(NotNull.class)) {
        nonnullFields.add(field);
      } else {
        nullableFields.add(field);
      }
    }
    return new Fields(nonnullFields, nullableFields);
  }

  /**
   * Fills primitive fields and remove filled fields from list.
   *
   * @param baseInstance the instance, for which a primitive value will be assign.
   * @param nonnullFields the fields, among which there will be primitives.
   */
  private void fillPrimitiveFields(T baseInstance, List<Field> nonnullFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : nonnullFields) {
      if (field.getType().isPrimitive()) {
        generateAndAssignPrimitiveValue(baseInstance, field);
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      nonnullFields.remove(fieldToRemove);
    }
  }

  /**
   * Generates required primitive value and assign it to instnace.
   *
   * @param baseInstance the instance, for which a primitive value will be assign.
   * @param field the fileld with primitive type.
   */
  private void generateAndAssignPrimitiveValue(T baseInstance, Field field) {
    Class<?> primitiveType = field.getType();
    var random = ThreadLocalRandom.current();
    if (primitiveType.equals(Integer.TYPE)) {
      int value = random.nextInt();
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Long.TYPE)) {
      long value = random.nextLong();
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Short.TYPE)) {
      short value = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Boolean.TYPE)) {
      boolean value = random.nextBoolean();
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Byte.TYPE)) {
      byte value = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Float.TYPE)) {
      float value = random.nextFloat();
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Double.TYPE)) {
      double value = random.nextDouble();
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }

    if (primitiveType.equals(Character.TYPE)) {
      char value = (char) random.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
      assignPrimitiveValue(baseInstance, field, value);
      return;
    }
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value int value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, int value) {
    field.setAccessible(true);
    try {
      field.setInt(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value long value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, long value) {
    field.setAccessible(true);
    try {
      field.setLong(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value short value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, short value) {
    field.setAccessible(true);
    try {
      field.setShort(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value boolean value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, boolean value) {
    field.setAccessible(true);
    try {
      field.setBoolean(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value byte value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, byte value) {
    field.setAccessible(true);
    try {
      field.setByte(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value float value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, float value) {
    field.setAccessible(true);
    try {
      field.setFloat(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value double value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, double value) {
    field.setAccessible(true);
    try {
      field.setDouble(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Assigns the primitive value into field in instance.
   *
   * @param baseInstance the instance, for which a primitive aluve will be assign.
   * @param field the associated field.
   * @param value char value, which will be assigned to instance.
   */
  private void assignPrimitiveValue(T baseInstance, Field field, char value) {
    field.setAccessible(true);
    try {
      field.setChar(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Fills wrappers and base types like String, byte[] (which requires).
   *
   * @param baseInstance the instance, for which fields will be filled.
   * @param separatedFields all fields of the instance.
   */
  private void fillWrappersAndBasicTypeFields(T baseInstance, Fields separatedFields) {
    fillBasicTypeNotNullFields(baseInstance, separatedFields.nonnullFields());
    fillWrappersAndBasicTypeObjectFields(baseInstance, separatedFields.nullableFields());
  }

  /**
   * Fills base type (String, byte[]...) for fields, which marked by {@link NotNull} annotation.
   * Also removes filled fields from list.
   *
   * @param baseInstance the instance, for which fileds will be fills.
   * @param nonnullFields all fields, which marked by {@link NotNull} annotation.
   */
  private void fillBasicTypeNotNullFields(T baseInstance, List<Field> nonnullFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : nonnullFields) {
      if (field.getType().equals(String.class)) {
        String generatedString = generateStringByWidth(STRING_WIDTH);
        assignObject(baseInstance, field, generatedString);
        fieldsToRemove.add(field);
      } else if (field.getType().equals(byte[].class)) {
        byte[] bytes = generateBytesBySize(DEFAULT_ARRAY_SIZE);
        assignObject(baseInstance, field, bytes);
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      nonnullFields.remove(fieldToRemove);
    }
  }

  /**
   * Generates a string by the specific width. String will contains any chars, which generates via
   * random value.
   *
   * @param stringWidth the specific width for string.
   * @return a string with random values.
   */
  private String generateStringByWidth(int stringWidth) {
    StringBuilder builder = new StringBuilder(stringWidth);
    for (int i = 0; i < stringWidth; i++) {
      char randomSymbol =
          (char)
              ThreadLocalRandom.current()
                  .nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
      builder.append(randomSymbol);
    }
    return builder.toString();
  }

  /**
   * Creates and fills a byte array by random bytes.
   *
   * @param size the byte array size.
   * @return a byte array with filled cells.
   */
  private byte[] generateBytesBySize(int size) {
    byte[] arr = new byte[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (byte) ThreadLocalRandom.current().nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
    }
    return arr;
  }

  /**
   * Assigns a object value to the field for the instance.
   *
   * @param baseInstance the instance, for which field will be assign.
   * @param field the referenced field in the instance.
   * @param value a object value, which will be assigned to instance.
   */
  private void assignObject(T baseInstance, Field field, Object value) {
    field.setAccessible(true);
    try {
      field.set(baseInstance, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + baseInstance.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Fills wrappers and base type object fields for the instance.
   *
   * @param baseInstance the instance, for which the fields will be fills.
   * @param nullableFields the list of fields, which not marked by {@link NotNull} annotation.
   */
  private void fillWrappersAndBasicTypeObjectFields(T baseInstance, List<Field> nullableFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : nullableFields) {
      boolean isChanged = fillBasicObjectTypeField(baseInstance, field);
      if (isChanged) {
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      nullableFields.remove(fieldToRemove);
    }
  }

  /**
   * Generantes and fill the wrappers or base types by chance. The chance is defines at calling
   * constructor.
   *
   * @param baseInstance the instance, for which the field will be fills.
   * @param nullableField the referenced field, which not marked by {@link NotNull} annotation.
   */
  private boolean fillBasicObjectTypeField(T baseInstance, Field nullableField) {
    Class<?> objectType = nullableField.getType();
    var random = ThreadLocalRandom.current();

    if (Float.compare(random.nextFloat(), nullableFieldsChance) > 0) {
      assignObject(baseInstance, nullableField, null);
      return true;
    }

    if (objectType.equals(Boolean.class)) {
      Boolean generatedValue = random.nextBoolean();
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(String.class)) {
      String generatedString = generateStringByWidth(STRING_WIDTH);
      assignObject(baseInstance, nullableField, generatedString);
      return true;
    }

    if (objectType.equals(Integer.class)) {
      Integer generatedValue = random.nextInt();
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Long.class)) {
      Long generatedValue = random.nextLong();
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Short.class)) {
      Short generatedValue = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Float.class)) {
      Float generatedValue = random.nextFloat();
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Double.class)) {
      Double generatedValue = random.nextDouble();
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Character.class)) {
      Character generatedValue =
          (char) random.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(Byte.class)) {
      Byte generatedValue = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
      assignObject(baseInstance, nullableField, generatedValue);
      return true;
    }

    if (objectType.equals(byte[].class)) {
      byte[] bytes = generateBytesBySize(DEFAULT_ARRAY_SIZE);
      assignObject(baseInstance, nullableField, bytes);
      return true;
    }

    return false;
  }

  /**
   * If the type is not wrapper and is not base type, because it is complex like datatype, then
   * calls {@link TypeFactory#generate(Class, int, float)}, which creates a instance and fills its
   * field, and after this actions assigns to the base type instance.
   *
   * @param baseInstance the instance, for which the field will be fills.
   * @param nonnullFields the field list, which marked by {@link NotNull} annotation.
   */
  private void fillNotNullTypes(T baseInstance, List<Field> nonnullFields) {
    for (Field field : nonnullFields) {
      if (field.getType().isInterface()) {
        continue;
      }

      Object instance = TypeFactory.generate(field.getType(), depth - 1, nullableFieldsChance);
      assignObject(baseInstance, field, instance);
    }
  }

  /**
   * If the type is not wrapper and is not base type, because it is complex like datatype, then
   * creates another one {@link TypeFactory} instance, which fills the field as instance. The
   * difference from method {@link TypeFactory#fillNotNullTypes(Object, List)} is checking by
   * chance, in which if pass – creates and fills a field, otherwise - do nothing.
   *
   * @param baseInstance the instance, for which the field will be fills.
   * @param nullableFields the field list, which not marked by {@link NotNull} annotation.
   */
  private void fillNullableTypes(T baseInstance, List<Field> nullableFields) {
    for (Field nullableField : nullableFields) {
      if (nullableField.getType().isInterface()) {
        continue;
      }

      if (Float.compare(ThreadLocalRandom.current().nextFloat(), nullableFieldsChance) > 0) {
        continue;
      }

      var instance = TypeFactory.generate(nullableField.getType(), depth - 1, nullableFieldsChance);
      assignObject(baseInstance, nullableField, instance);
    }
  }
}

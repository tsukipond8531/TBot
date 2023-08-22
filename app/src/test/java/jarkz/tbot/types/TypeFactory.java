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
 * This class can generate any datatypes or another objects by filling random values.
 *
 * @author Pavel Bialiauski
 */
@TestContainer
public class TypeFactory<T> {

  private record Fields(List<Field> notNullFields, List<Field> objectFields) {}

  private final int BASE_DETPH = 1;
  private int depth = BASE_DETPH;

  private final float BASE_CHANCE = 0.35f;
  private float chanceGenerationNullableFields = BASE_CHANCE;

  private final int STRING_WIDTH = 15;

  private final int DEFAULT_ARRAY_SIZE = 20;

  /**
   * Creates the instance of {@link TypeFactory}.
   *
   * @param depth the depth of the fields which fill.
   * @param chanceGenerationNullableFields the chance, which used for defining, does it need to be
   *     filled fields, which not marked by {@link NotNull} annotation.
   */
  public TypeFactory(int depth, float chanceGenerationNullableFields) {
    this.depth = depth;
    this.chanceGenerationNullableFields = chanceGenerationNullableFields;
  }

  /**
   * Fills all fields for a datatype.
   *
   * @param baseType the instance of base type, for which will be filled.
   */
  public void generate(T baseType) {
    Class<?> clazz = baseType.getClass();
    Field[] allFields = clazz.getDeclaredFields();

    Fields separatedFields = separateFields(allFields);
    mapPrimitiveFields(baseType, separatedFields.notNullFields());
    mapWrappersAndBaseTypeFields(baseType, separatedFields);

    if (depth > 0) {
      generateAndMapNotNullTypes(baseType, separatedFields.notNullFields());
      generateAndMapNullableTypes(baseType, separatedFields.objectFields());
    }
  }

  /**
   * Seprarate all declared fields by checking {@link NotNull} annotation, which defines that
   * specific field is not null.
   *
   * @param allFields all declared fields of a instance.
   * @return separated fields, which writes into {@link Fields}.
   */
  private Fields separateFields(Field[] allFields) {
    List<Field> notNullFields = new ArrayList<>();
    List<Field> objectFields = new ArrayList<>();
    for (Field field : allFields) {
      if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
        continue;
      }

      if (field.isAnnotationPresent(NotNull.class)) {
        notNullFields.add(field);
      } else {
        objectFields.add(field);
      }
    }
    return new Fields(notNullFields, objectFields);
  }

  /**
   * Fils primitive fields and remove filled fields from list.
   *
   * @param type the instance, for which a primitive value will be map.
   * @param notNullFields the fields, among which there will be primitives.
   */
  private void mapPrimitiveFields(T type, List<Field> notNullFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : notNullFields) {
      if (field.getType().isPrimitive()) {
        generateAndMapPrimitiveValue(type, field);
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      notNullFields.remove(fieldToRemove);
    }
  }

  /**
   * Generates required primitive value and map it to instnace.
   *
   * @param type the instance, for which a primitive value will be map.
   * @param field the fileld with primitive type.
   */
  private void generateAndMapPrimitiveValue(T type, Field field) {
    Class<?> primitiveType = field.getType();
    var random = ThreadLocalRandom.current();
    if (primitiveType.equals(Integer.TYPE)) {
      int value = random.nextInt();
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Long.TYPE)) {
      long value = random.nextLong();
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Short.TYPE)) {
      short value = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Boolean.TYPE)) {
      boolean value = random.nextBoolean();
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Byte.TYPE)) {
      byte value = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Float.TYPE)) {
      float value = random.nextFloat();
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Double.TYPE)) {
      double value = random.nextDouble();
      mapPrimitiveValue(type, field, value);
      return;
    }

    if (primitiveType.equals(Character.TYPE)) {
      char value = (char) random.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
      mapPrimitiveValue(type, field, value);
      return;
    }
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value int value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, int value) {
    field.setAccessible(true);
    try {
      field.setInt(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value long value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, long value) {
    field.setAccessible(true);
    try {
      field.setLong(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value short value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, short value) {
    field.setAccessible(true);
    try {
      field.setShort(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value boolean value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, boolean value) {
    field.setAccessible(true);
    try {
      field.setBoolean(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value byte value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, byte value) {
    field.setAccessible(true);
    try {
      field.setByte(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value float value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, float value) {
    field.setAccessible(true);
    try {
      field.setFloat(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value double value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, double value) {
    field.setAccessible(true);
    try {
      field.setDouble(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Maps the primitive value into field in instance.
   *
   * @param type the instance, for which a primitive aluve will be map.
   * @param field the associated field.
   * @param value char value, which will be mapped to instance.
   */
  private void mapPrimitiveValue(T type, Field field, char value) {
    field.setAccessible(true);
    try {
      field.setChar(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Fills wrappers and base types like String, byte[] (which requires).
   *
   * @param type the instance, for which fields will be filled.
   * @param separatedFields all fields of the instance.
   */
  private void mapWrappersAndBaseTypeFields(T type, Fields separatedFields) {
    mapBaseTypeNotNullFields(type, separatedFields.notNullFields());
    mapWrappersAndBaseTypeObjectFields(type, separatedFields.objectFields());
  }

  /**
   * Fills base type (String, byte[]...) for fields, which marked by {@link NotNull} annotation.
   * Also removes filled fields from list.
   *
   * @param type the instance, for which fileds will be fills.
   * @param notNullFields all fields, which marked by {@link NotNull} annotation.
   */
  private void mapBaseTypeNotNullFields(T type, List<Field> notNullFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : notNullFields) {
      if (field.getType().equals(String.class)) {
        String generatedString = generateStringByWidth(STRING_WIDTH);
        mapObject(type, field, generatedString);
        fieldsToRemove.add(field);
      } else if (field.getType().equals(byte[].class)) {
        byte[] bytes = generateBytesBySize(DEFAULT_ARRAY_SIZE);
        mapObject(type, field, bytes);
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      notNullFields.remove(fieldToRemove);
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
   * Maps a object value to the field for the instance.
   *
   * @param type the instance, for which field will be map.
   * @param field the referenced field in the instance.
   * @param value a object value, which will be mapped to instance.
   */
  private void mapObject(T type, Field field, Object value) {
    field.setAccessible(true);
    try {
      field.set(type, value);
    } catch (IllegalAccessException e) {
      throw new TypeGenerationException(
          e.getMessage() + "\nSource: " + type.getClass() + "\nField: " + field + "\n");
    }
    field.setAccessible(false);
  }

  /**
   * Fills wrappers and base type object fields for the instance.
   *
   * @param type the instance, for which the fields will be fills.
   * @param objectFields the list of fields, which not marked by {@link NotNull} annotation.
   */
  private void mapWrappersAndBaseTypeObjectFields(T type, List<Field> objectFields) {
    List<Field> fieldsToRemove = new LinkedList<>();
    for (Field field : objectFields) {
      boolean isChanged = mapBaseObjectTypeFields(type, field);
      if (isChanged) {
        fieldsToRemove.add(field);
      }
    }

    for (Field fieldToRemove : fieldsToRemove) {
      objectFields.remove(fieldToRemove);
    }
  }

  /**
   * Generantes and fill the wrappers or base types by chance. The chance is defines at calling
   * constructor.
   *
   * @param type the instance, for which the field will be fills.
   * @param objectField the referenced field, which not marked by {@link NotNull} annotation.
   */
  private boolean mapBaseObjectTypeFields(T type, Field objectField) {
    Class<?> objectType = objectField.getType();
    var random = ThreadLocalRandom.current();

    if (Float.compare(random.nextFloat(), chanceGenerationNullableFields) > 0) {
      mapObject(type, objectField, null);
      return true;
    }

    if (objectType.equals(Boolean.class)) {
      Boolean generatedValue = random.nextBoolean();
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(String.class)) {
      String generatedString = generateStringByWidth(STRING_WIDTH);
      mapObject(type, objectField, generatedString);
      return true;
    }

    if (objectType.equals(Integer.class)) {
      Integer generatedValue = random.nextInt();
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Long.class)) {
      Long generatedValue = random.nextLong();
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Short.class)) {
      Short generatedValue = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Float.class)) {
      Float generatedValue = random.nextFloat();
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Double.class)) {
      Double generatedValue = random.nextDouble();
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Character.class)) {
      Character generatedValue =
          (char) random.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(Byte.class)) {
      Byte generatedValue = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
      mapObject(type, objectField, generatedValue);
      return true;
    }

    if (objectType.equals(byte[].class)) {
      byte[] bytes = generateBytesBySize(DEFAULT_ARRAY_SIZE);
      mapObject(type, objectField, bytes);
      return true;
    }

    return false;
  }

  /**
   * If the type is not wrapper and is not base type, because it is complex like datatype, then
   * creates another one {@link TypeFactory} instance, which fills the field as instance.
   *
   * @param baseType the instance, for which the field will be fills.
   * @param notNullFields the field list, which marked by {@link NotNull} annotation.
   */
  private void generateAndMapNotNullTypes(T baseType, List<Field> notNullFields) {
    for (Field field : notNullFields) {
      if (field.getType().isInterface()) {
        continue;
      }

      try {
        Object instance = field.getType().getDeclaredConstructor().newInstance();
        TypeFactory<Object> generator =
            new TypeFactory<>(depth - 1, chanceGenerationNullableFields);
        generator.generate(instance);
        mapObject(baseType, field, instance);
      } catch (InvocationTargetException
          | IllegalAccessException
          | InstantiationException
          | NoSuchMethodException e) {
        throw new TypeGenerationException(
            e.getMessage()
                + "\nSource: "
                + baseType.getClass()
                + "\nField type: "
                + field.getType()
                + "\n");
      }
    }
  }

  /**
   * If the type is not wrapper and is not base type, because it is complex like datatype, then
   * creates another one {@link TypeFactory} instance, which fills the field as instance. The
   * difference from method {@code generateAndMapNotNullTypes} is checking by chance, in which if
   * pass – creates and fills a field, otherwise - do nothing.
   */
  private void generateAndMapNullableTypes(T baseType, List<Field> objectFields) {
    for (Field objectField : objectFields) {
      if (objectField.getType().isInterface()) {
        continue;
      }

      if (Float.compare(ThreadLocalRandom.current().nextFloat(), chanceGenerationNullableFields)
          > 0) {
        continue;
      }

      try {
        Object instance = objectField.getType().getDeclaredConstructor().newInstance();
        TypeFactory<Object> generator =
            new TypeFactory<>(depth - 1, chanceGenerationNullableFields);
        generator.generate(instance);
        mapObject(baseType, objectField, instance);
      } catch (InvocationTargetException
          | IllegalAccessException
          | InstantiationException
          | NoSuchMethodException e) {
        throw new TypeGenerationException(
            e.getMessage()
                + "\nSource: "
                + baseType.getClass()
                + "\nField type: "
                + objectField.getType()
                + "\n");
      }
    }
  }
}

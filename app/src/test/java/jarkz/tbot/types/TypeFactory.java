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

@TestContainer
public class TypeFactory<T> {

  private record Fields(List<Field> notNullFields, List<Field> objectFields) {}

  private final int BASE_DETPH = 1;
  private int depth = BASE_DETPH;

  private final float BASE_CHANCE = 0.35f;
  private float chanceGenerationNullableFields = BASE_CHANCE;

  private final int STRING_WIDTH = 15;

  private final int DEFAULT_ARRAY_SIZE = 20;

  public TypeFactory(int depth, float chanceGenerationNullableFields) {
    this.depth = depth;
    this.chanceGenerationNullableFields = chanceGenerationNullableFields;
  }

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

  private void mapWrappersAndBaseTypeFields(T type, Fields separatedFields) {
    mapBaseTypeNotNullFields(type, separatedFields.notNullFields());
    mapWrappersAndBaseTypeObjectFields(type, separatedFields.objectFields());
  }

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

  private byte[] generateBytesBySize(int size) {
    byte[] arr = new byte[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (byte) ThreadLocalRandom.current().nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE);
    }
    return arr;
  }

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

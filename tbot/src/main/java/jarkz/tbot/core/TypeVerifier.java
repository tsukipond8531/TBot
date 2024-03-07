package jarkz.tbot.core;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MessageOrBoolean;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;

public final class TypeVerifier {

  private static final Set<Class<?>> IGNORE =
      Set.of(
          Short.class,
          Integer.class,
          Long.class,
          Float.class,
          Double.class,
          Boolean.class,
          Character.class,
          Byte.class,
          String.class,
          InputFile.class,
          Id.class,
          MessageOrBoolean.class);

  public static void verify(Object instance) {
    var instanceClass = instance.getClass();
    var fields = instanceClass.getDeclaredFields();
    for (var field : fields) {
      var fieldModifiers = field.getModifiers();
      if (!Modifier.isPublic(fieldModifiers)
          || Modifier.isFinal(fieldModifiers)
          || field.getType().isPrimitive()
          || !field.isAnnotationPresent(NotNull.class)) {
        continue;
      }

      Object fieldData = null;
      try {
        fieldData = field.get(instance);
      } catch (IllegalAccessException e) {
        // Just ignore, we can't get this exception, because non-public fields are skipped, but to
        // be cautious I put the RuntimeException here.
        throw new RuntimeException(e);
      }

      if (fieldData == null) {
        throw new NullPointerException(String.format("The %s field is null!", field));
      }

      if (IGNORE.contains(field.getType())) {
        continue;
      }

      if (fieldData instanceof List list) {
        for (var listData : list) {
          TypeVerifier.verify(listData);
        }
        continue;
      }

      TypeVerifier.verify(fieldData);
    }
  }
}

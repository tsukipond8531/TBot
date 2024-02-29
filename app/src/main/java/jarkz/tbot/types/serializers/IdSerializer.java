package jarkz.tbot.types.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InputFile;
import java.lang.reflect.Type;

/**
 * JSON serializer for type {@link InputFile}.
 *
 * <p>Converts only to String.
 *
 * <p>Note: use it ONLY FOR String type! If you have File or Bytes type, then just call specific
 * method.
 */
public class IdSerializer implements JsonSerializer<Id> {

  @Override
  public JsonElement serialize(Id src, Type typeOfSrc, JsonSerializationContext context) {
    return switch (src.type()) {
      case INTEGER -> context.serialize(src.integerData());
      case STRING -> context.serialize(src.stringData());
    };
  }
}

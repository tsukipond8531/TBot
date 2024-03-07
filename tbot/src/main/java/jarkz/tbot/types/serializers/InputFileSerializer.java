package jarkz.tbot.types.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
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
public class InputFileSerializer implements JsonSerializer<InputFile> {

  @Override
  public JsonElement serialize(InputFile src, Type typeOfSrc, JsonSerializationContext context) {

    String data = null;
    switch (src.type()) {
      case FILE_ID -> data = src.fileId();
      default -> {
        data = src.attachmentName();
        if (data == null) {
          data = src.randomAttachmentName();
        }
        data = "attach://" + data;
      }
    }

    return context.serialize(data);
  }
}

package jarkz.tbot.types.inputmedia;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

/**
 * The deserializer proxy for general interface {@link InputMedia}.
 *
 * <p>Uses for the JSON deserializer adapter. Contains only one static method, which defines which
 * child type needed to map and returns the needed class.
 *
 * @author Pavel Bialiauski
 */
@Deserializer
public class DeserializerProxy {

  private static final String INPUT_MEDIA_KEY = "type";

  /**
   * Returns a implemented class from the {@link InputMedia} by specific type.
   *
   * @param jsonObject the InputMedia as json object.
   * @return a implemented class from the {@link InputMedia}.
   */
  public static Class<? extends InputMedia> getInputMediaClass(JsonObject jsonObject) {

    JsonElement element = jsonObject.get(INPUT_MEDIA_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.", INPUT_MEDIA_KEY, InputMedia.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends InputMedia> clazz = null;
    switch (value) {
      case InputMediaPhoto.TYPE -> clazz = InputMediaPhoto.class;
      case InputMediaVideo.TYPE -> clazz = InputMediaVideo.class;
      case InputMediaAudio.TYPE -> clazz = InputMediaAudio.class;
      case InputMediaAnimation.TYPE -> clazz = InputMediaAnimation.class;
      case InputMediaDocument.TYPE -> clazz = InputMediaDocument.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.", INPUT_MEDIA_KEY, InputMedia.class.getName()));
    }
    return clazz;
  }
}

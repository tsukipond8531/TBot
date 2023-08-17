package jarkz.tbot.types.inlinemode;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

@Deserializer
public class DeserializerProxy {

  private static final String INLINE_QUERY_RESULT_KEY = "type";

  public static Class<? extends InlineQueryResult> getInlineQueryResultClass(
      JsonObject jsonObject) {

    JsonElement element = jsonObject.get(INLINE_QUERY_RESULT_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.",
              INLINE_QUERY_RESULT_KEY, InlineQueryResult.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends InlineQueryResult> clazz = null;
    switch (value) {
      case InlineQueryResultArticle.TYPE -> clazz = InlineQueryResultArticle.class;
      case InlineQueryResultLocation.TYPE -> clazz = InlineQueryResultLocation.class;
      case InlineQueryResultVenue.TYPE -> clazz = InlineQueryResultVenue.class;
      case InlineQueryResultCachedSticker.TYPE -> clazz = InlineQueryResultCachedSticker.class;
      case InlineQueryResultContact.TYPE -> clazz = InlineQueryResultContact.class;
      case InlineQueryResultGame.TYPE -> clazz = InlineQueryResultGame.class;
      case InlineQueryResultAudio.TYPE -> {
        clazz =
            InlineQueryResultCachedAudio.isCached(jsonObject)
                ? InlineQueryResultCachedAudio.class
                : InlineQueryResultAudio.class;
      }
      case InlineQueryResultVideo.TYPE -> {
        clazz =
            InlineQueryResultCachedVideo.isCached(jsonObject)
                ? InlineQueryResultCachedVideo.class
                : InlineQueryResultVideo.class;
      }
      case InlineQueryResultDocument.TYPE -> {
        clazz =
            InlineQueryResultCachedDocument.isCached(jsonObject)
                ? InlineQueryResultCachedDocument.class
                : InlineQueryResultDocument.class;
      }
      case InlineQueryResultGif.TYPE -> {
        clazz =
            InlineQueryResultCachedGif.isCached(jsonObject)
                ? InlineQueryResultCachedGif.class
                : InlineQueryResultGif.class;
      }
      case InlineQueryResultMpeg4Gif.TYPE -> {
        clazz =
            InlineQueryResultCachedMpeg4Gif.isCached(jsonObject)
                ? InlineQueryResultCachedMpeg4Gif.class
                : InlineQueryResultMpeg4Gif.class;
      }
      case InlineQueryResultVoice.TYPE -> {
        clazz =
            InlineQueryResultCachedVoice.isCached(jsonObject)
                ? InlineQueryResultCachedVoice.class
                : InlineQueryResultVoice.class;
      }
      case InlineQueryResultPhoto.TYPE -> {
        clazz =
            InlineQueryResultCachedPhoto.isCached(jsonObject)
                ? InlineQueryResultCachedPhoto.class
                : InlineQueryResultPhoto.class;
      }
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.",
              INLINE_QUERY_RESULT_KEY, InlineQueryResult.class.getName()));
    }
    return clazz;
  }
}

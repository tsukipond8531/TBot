package jarkz.tbot.types.inlinemode;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object represents one result of an inline query. Telegram clients currently support results
 * of the following 20 types:
 *
 * <ul>
 *   <li>{@link InlineQueryResultCachedAudio}
 *   <li>{@link InlineQueryResultCachedDocument}
 *   <li>{@link InlineQueryResultCachedGif}
 *   <li>{@link InlineQueryResultCachedMpeg4Gif}
 *   <li>{@link InlineQueryResultCachedPhoto}
 *   <li>{@link InlineQueryResultCachedSticker}
 *   <li>{@link InlineQueryResultCachedVideo}
 *   <li>{@link InlineQueryResultCachedVoice}
 *   <li>{@link InlineQueryResultArticle}
 *   <li>{@link InlineQueryResultAudio}
 *   <li>{@link InlineQueryResultContact}
 *   <li>{@link InlineQueryResultGame}
 *   <li>{@link InlineQueryResultDocument}
 *   <li>{@link InlineQueryResultGif}
 *   <li>{@link InlineQueryResultLocation}
 *   <li>{@link InlineQueryResultMpeg4Gif}
 *   <li>{@link InlineQueryResultPhoto}
 *   <li>{@link InlineQueryResultVenue}
 *   <li>{@link InlineQueryResultVideo}
 *   <li>{@link InlineQueryResultVoice}
 * </ul>
 *
 * @apiNote All URLs passed in inline query results will be available to end users and therefore
 *     must be assumed to be <strong>public</strong>.
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface InlineQueryResult {

  /**
   * Returnsa type of {@link InlineQueryResult}.
   *
   * @return a type.
   */
  String getType();
}

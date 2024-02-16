package jarkz.tbot.types;

/**
 * This object represents one result of an inline query. Telegram clients currently support results
 * of the following 20 types:
 *
 * <p>- InlineQueryResultCachedAudio
 *
 * <p>- InlineQueryResultCachedDocument
 *
 * <p>- InlineQueryResultCachedGif
 *
 * <p>- InlineQueryResultCachedMpeg4Gif
 *
 * <p>- InlineQueryResultCachedPhoto
 *
 * <p>- InlineQueryResultCachedSticker
 *
 * <p>- InlineQueryResultCachedVideo
 *
 * <p>- InlineQueryResultCachedVoice
 *
 * <p>- InlineQueryResultArticle
 *
 * <p>- InlineQueryResultAudio
 *
 * <p>- InlineQueryResultContact
 *
 * <p>- InlineQueryResultGame
 *
 * <p>- InlineQueryResultDocument
 *
 * <p>- InlineQueryResultGif
 *
 * <p>- InlineQueryResultLocation
 *
 * <p>- InlineQueryResultMpeg4Gif
 *
 * <p>- InlineQueryResultPhoto
 *
 * <p>- InlineQueryResultVenue
 *
 * <p>- InlineQueryResultVideo
 *
 * <p>- InlineQueryResultVoice
 *
 * <p>Note: All URLs passed in inline query results will be available to end users and therefore
 * must be assumed to be public.
 */
public sealed interface InlineQueryResult
    permits InlineQueryResultCachedAudio,
        InlineQueryResultCachedDocument,
        InlineQueryResultCachedGif,
        InlineQueryResultCachedMpeg4Gif,
        InlineQueryResultCachedPhoto,
        InlineQueryResultCachedSticker,
        InlineQueryResultCachedVideo,
        InlineQueryResultCachedVoice,
        InlineQueryResultArticle,
        InlineQueryResultAudio,
        InlineQueryResultContact,
        InlineQueryResultGame,
        InlineQueryResultDocument,
        InlineQueryResultGif,
        InlineQueryResultLocation,
        InlineQueryResultMpeg4Gif,
        InlineQueryResultPhoto,
        InlineQueryResultVenue,
        InlineQueryResultVideo,
        InlineQueryResultVoice {}

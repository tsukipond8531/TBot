package jarkz.tbot.types;

/**
 * This object represents the content of a media message to be sent. It should be one of
 *
 * <p>- InputMediaAnimation
 *
 * <p>- InputMediaDocument
 *
 * <p>- InputMediaAudio
 *
 * <p>- InputMediaPhoto
 *
 * <p>- InputMediaVideo
 */
public sealed interface InputMedia
    permits InputMediaAnimation,
        InputMediaDocument,
        InputMediaAudio,
        InputMediaPhoto,
        InputMediaVideo {}

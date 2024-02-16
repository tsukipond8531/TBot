package jarkz.tbot.types;

/**
 * This object describes the origin of a message. It can be one of
 *
 * <p>- MessageOriginUser
 *
 * <p>- MessageOriginHiddenUser
 *
 * <p>- MessageOriginChat
 *
 * <p>- MessageOriginChannel
 */
public sealed interface MessageOrigin
    permits MessageOriginUser, MessageOriginHiddenUser, MessageOriginChat, MessageOriginChannel {}

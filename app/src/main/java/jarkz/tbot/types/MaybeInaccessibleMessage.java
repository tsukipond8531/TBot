package jarkz.tbot.types;

/**
 * This object describes a message that can be inaccessible to the bot. It can be one of
 *
 * <p>- Message
 *
 * <p>- InaccessibleMessage
 */
public sealed interface MaybeInaccessibleMessage permits Message, InaccessibleMessage {}

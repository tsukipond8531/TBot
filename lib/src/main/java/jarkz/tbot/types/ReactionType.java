package jarkz.tbot.types;

/**
 * This object describes the type of a reaction. Currently, it can be one of
 *
 * <p>- ReactionTypeEmoji
 *
 * <p>- ReactionTypeCustomEmoji
 */
public sealed interface ReactionType permits ReactionTypeEmoji, ReactionTypeCustomEmoji {}

package jarkz.tbot.types;

/**
 * This object describes the source of a chat boost. It can be one of
 *
 * <p>- ChatBoostSourcePremium
 *
 * <p>- ChatBoostSourceGiftCode
 *
 * <p>- ChatBoostSourceGiveaway
 */
public sealed interface ChatBoostSource
    permits ChatBoostSourcePremium, ChatBoostSourceGiftCode, ChatBoostSourceGiveaway {}

package jarkz.tbot.types;

/** */
public sealed interface ReplyMarkup
    permits InlineKeyboardMarkup, ReplyKeyboardMarkup, ReplyKeyboardRemove, ForceReply {}

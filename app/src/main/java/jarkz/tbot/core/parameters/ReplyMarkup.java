package jarkz.tbot.core.parameters;

import jarkz.tbot.types.ForceReply;
import jarkz.tbot.types.InlineKeyboardMarkup;
import jarkz.tbot.types.ReplyKeyboardMarkup;
import jarkz.tbot.types.ReplyKeyboardRemove;

/** */
public sealed interface ReplyMarkup
    permits InlineKeyboardMarkup, ReplyKeyboardMarkup, ReplyKeyboardRemove, ForceReply {}

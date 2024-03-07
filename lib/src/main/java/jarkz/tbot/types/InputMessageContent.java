package jarkz.tbot.types;

/**
 * This object represents the content of a message to be sent as a result of an inline query.
 * Telegram clients currently support the following 5 types:
 *
 * <p>- InputTextMessageContent
 *
 * <p>- InputLocationMessageContent
 *
 * <p>- InputVenueMessageContent
 *
 * <p>- InputContactMessageContent
 *
 * <p>- InputInvoiceMessageContent
 */
public sealed interface InputMessageContent
    permits InputTextMessageContent,
        InputLocationMessageContent,
        InputVenueMessageContent,
        InputContactMessageContent,
        InputInvoiceMessageContent {}

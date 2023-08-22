package jarkz.tbot.types.inlinemode;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object represents the content of a message to be sent as a result of an inline query.
 * Telegram clients currently support the following 5 types:
 *
 * <ul>
 *   <li>{@link InputTextMessageContent}
 *   <li>{@link InputLocationMessageContent}
 *   <li>{@link InputVenueMessageContent}
 *   <li>{@link InputContactMessageContent}
 *   <li>{@link InputInvoiceMessageContent}
 * </ul>
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface InputMessageContent {}

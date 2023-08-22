package jarkz.tbot.types.inputmedia;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object represents the content of a media message to be sent. It should be one of
 *
 * <ul>
 *   <li>{@link InputMediaAnimation}
 *   <li>{@link InputMediaDocument}
 *   <li>{@link InputMediaAudio}
 *   <li>{@link InputMediaPhoto}
 *   <li>{@link InputMediaVideo}
 * </ul>
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface InputMedia {

  /**
   * Returns a type of {@link InputMedia}.
   *
   * @return a type.
   */
  String getType();
}

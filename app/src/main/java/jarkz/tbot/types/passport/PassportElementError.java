package jarkz.tbot.types.passport;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object represents an error in the Telegram Passport element which was submitted that should
 * be resolved by the user. It should be one of:
 *
 * <ul>
 *   <li>{@link PassportElementErrorDataField}
 *   <li>{@link PassportElementErrorFrontSide}
 *   <li>{@link PassportElementErrorReverseSide}
 *   <li>{@link PassportElementErrorSelfie}
 *   <li>{@link PassportElementErrorFile}
 *   <li>{@link PassportElementErrorFiles}
 *   <li>{@link PassportElementErrorTranslationFile}
 *   <li>{@link PassportElementErrorTranslationFiles}
 *   <li>{@link PassportElementErrorUnspecified}
 * </ul>
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface PassportElementError {

  /**
   * Returns a source of {@link PassportElementError}.
   *
   * @return a source.
   */
  String getSource();
}

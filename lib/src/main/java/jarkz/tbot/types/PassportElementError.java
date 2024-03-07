package jarkz.tbot.types;

/**
 * This object represents an error in the Telegram Passport element which was submitted that should
 * be resolved by the user. It should be one of:
 *
 * <p>- PassportElementErrorDataField
 *
 * <p>- PassportElementErrorFrontSide
 *
 * <p>- PassportElementErrorReverseSide
 *
 * <p>- PassportElementErrorSelfie
 *
 * <p>- PassportElementErrorFile
 *
 * <p>- PassportElementErrorFiles
 *
 * <p>- PassportElementErrorTranslationFile
 *
 * <p>- PassportElementErrorTranslationFiles
 *
 * <p>- PassportElementErrorUnspecified
 */
public sealed interface PassportElementError
    permits PassportElementErrorDataField,
        PassportElementErrorFrontSide,
        PassportElementErrorReverseSide,
        PassportElementErrorSelfie,
        PassportElementErrorFile,
        PassportElementErrorFiles,
        PassportElementErrorTranslationFile,
        PassportElementErrorTranslationFiles,
        PassportElementErrorUnspecified {}

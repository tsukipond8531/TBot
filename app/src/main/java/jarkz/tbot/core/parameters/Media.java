package jarkz.tbot.core.parameters;

import jarkz.tbot.types.InputMediaAudio;
import jarkz.tbot.types.InputMediaDocument;
import jarkz.tbot.types.InputMediaPhoto;
import jarkz.tbot.types.InputMediaVideo;

/** */
public sealed interface Media
    permits InputMediaAudio, InputMediaDocument, InputMediaPhoto, InputMediaVideo {}

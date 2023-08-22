package jarkz.tbot.types.videochat;

import jarkz.tbot.types.annotations.EmptyClass;

/**
 * This object represents a service message about a video chat started in the chat. Currently holds
 * no information.
 *
 * @author Pavel Bialiauski
 */
@EmptyClass
public class VideoChatStarted {

  /** Default constructor. */
  public VideoChatStarted() {}

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof VideoChatStarted other)) {
      return false;
    }

    return true;
  }
}

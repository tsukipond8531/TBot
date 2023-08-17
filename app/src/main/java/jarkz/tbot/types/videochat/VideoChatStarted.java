package jarkz.tbot.types.videochat;

import jarkz.tbot.types.annotations.EmptyClass;

@EmptyClass
public class VideoChatStarted {

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

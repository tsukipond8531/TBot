package jarkz.tbot.types.videochat;

import jarkz.tbot.types.annotations.EmptyClass;

@EmptyClass
public class VideoChatStarted {

	public VideoChatStarted(){
	}

  @Override
  final public int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  final public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof VideoChatStarted other)) {
      return false;
    }

    return true;
  }
}

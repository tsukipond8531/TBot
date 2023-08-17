package jarkz.tbot.types.forum;

import jarkz.tbot.types.annotations.EmptyClass;

@EmptyClass
public class ForumTopicReopened {

	public ForumTopicReopened(){
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

    if (!(obj instanceof ForumTopicReopened other)) {
      return false;
    }

    return true;
  }
}

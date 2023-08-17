package jarkz.tbot.types.forum;

import jarkz.tbot.types.annotations.EmptyClass;

@EmptyClass
public class ForumTopicClosed {

	public ForumTopicClosed(){}

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

    if (!(obj instanceof ForumTopicClosed other)) {
      return false;
    }

    return true;
  }
}

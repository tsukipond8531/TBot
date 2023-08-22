package jarkz.tbot.types.forum;

import jarkz.tbot.types.annotations.EmptyClass;

/**
 * This object represents a service message about a forum topic closed in the chat. Currently holds
 * no information.
 *
 * @author Pavel Bialiauski
 */
@EmptyClass
public class ForumTopicClosed {

  /** Default constructor. */
  public ForumTopicClosed() {}

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

    if (!(obj instanceof ForumTopicClosed other)) {
      return false;
    }

    return true;
  }
}

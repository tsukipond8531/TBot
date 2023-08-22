package jarkz.tbot.types.document;

import jarkz.tbot.types.annotations.EmptyClass;

/**
 * This object represents a message about a forwarded story in the chat. Currently holds no
 * information.
 *
 * @author Pavel Bialiauski
 */
@EmptyClass
public class Story {

  /** Default constructor. */
  public Story() {}

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

    if (!(obj instanceof Story other)) {
      return false;
    }

    return true;
  }
}

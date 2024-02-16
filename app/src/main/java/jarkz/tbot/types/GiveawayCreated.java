package jarkz.tbot.types;

/**
 * This object represents a service message about the creation of a scheduled giveaway. Currently
 * holds no information.
 */
public final class GiveawayCreated {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GiveawayCreated other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "GiveawayCreated[]";
  }
}

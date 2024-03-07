package jarkz.tbot.types;

/**
 * This object represents a service message about the creation of a scheduled giveaway. Currently
 * holds no information.
 */
public final class GiveawayCreated {

  public static final class Builder {

    private GiveawayCreated buildingType;

    public Builder() {
      buildingType = new GiveawayCreated();
    }

    public GiveawayCreated build() {
      return buildingType;
    }
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GiveawayCreated)) return false;
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

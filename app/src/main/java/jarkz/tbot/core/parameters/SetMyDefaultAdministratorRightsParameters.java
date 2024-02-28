package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to change the default administrator rights requested by the bot when it's added
 * as an administrator to groups or channels. These rights will be suggested to users, but they are
 * free to modify the list before adding the bot. Returns True on success.
 */
public final class SetMyDefaultAdministratorRightsParameters {

  /**
   * A JSON-serialized object describing new default administrator rights. If not specified, the
   * default administrator rights will be cleared.
   */
  public ChatAdministratorRights rights;

  /**
   * Pass True to change the default administrator rights of the bot in channels. Otherwise, the
   * default administrator rights of the bot for groups and supergroups will be changed.
   */
  @SerializedName("for_channels")
  public Boolean forChannels;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetMyDefaultAdministratorRightsParameters other)) return false;
    return Objects.equals(rights, other.rights) && Objects.equals(forChannels, other.forChannels);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(rights, forChannels);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetMyDefaultAdministratorRightsParameters[rights=")
        .append(rights)
        .append(", forChannels=")
        .append(forChannels)
        .append("]");
    return builder.toString();
  }
}

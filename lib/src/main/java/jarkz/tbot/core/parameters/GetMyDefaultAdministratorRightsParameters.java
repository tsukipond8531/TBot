package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Use this method to get the current default administrator rights of the bot. Returns
 * ChatAdministratorRights on success.
 */
public final class GetMyDefaultAdministratorRightsParameters {

  /**
   * Pass True to get default administrator rights of the bot in channels. Otherwise, default
   * administrator rights of the bot for groups and supergroups will be returned.
   */
  @SerializedName("for_channels")
  public Boolean forChannels;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GetMyDefaultAdministratorRightsParameters other)) return false;
    return Objects.equals(forChannels, other.forChannels);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(forChannels);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("GetMyDefaultAdministratorRightsParameters[forChannels=")
        .append(forChannels)
        .append("]");
    return builder.toString();
  }
}

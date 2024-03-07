package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a chat photo. */
public final class ChatPhoto {

  public static final class Builder {

    private ChatPhoto buildingType;

    public Builder() {
      buildingType = new ChatPhoto();
    }

    public Builder setSmallFileId(String smallFileId) {
      buildingType.smallFileId = smallFileId;
      return this;
    }

    public Builder setSmallFileUniqueId(String smallFileUniqueId) {
      buildingType.smallFileUniqueId = smallFileUniqueId;
      return this;
    }

    public Builder setBigFileId(String bigFileId) {
      buildingType.bigFileId = bigFileId;
      return this;
    }

    public Builder setBigFileUniqueId(String bigFileUniqueId) {
      buildingType.bigFileUniqueId = bigFileUniqueId;
      return this;
    }

    public ChatPhoto build() {
      return buildingType;
    }
  }

  /**
   * File identifier of small (160x160) chat photo. This file_id can be used only for photo download
   * and only for as long as the photo is not changed.
   */
  @NotNull
  @SerializedName("small_file_id")
  public String smallFileId;

  /**
   * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over
   * time and for different bots. Can't be used to download or reuse the file.
   */
  @NotNull
  @SerializedName("small_file_unique_id")
  public String smallFileUniqueId;

  /**
   * File identifier of big (640x640) chat photo. This file_id can be used only for photo download
   * and only for as long as the photo is not changed.
   */
  @NotNull
  @SerializedName("big_file_id")
  public String bigFileId;

  /**
   * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time
   * and for different bots. Can't be used to download or reuse the file.
   */
  @NotNull
  @SerializedName("big_file_unique_id")
  public String bigFileUniqueId;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatPhoto other)) return false;
    return Objects.equals(smallFileId, other.smallFileId)
        && Objects.equals(smallFileUniqueId, other.smallFileUniqueId)
        && Objects.equals(bigFileId, other.bigFileId)
        && Objects.equals(bigFileUniqueId, other.bigFileUniqueId);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(smallFileId, smallFileUniqueId, bigFileId, bigFileUniqueId);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("ChatPhoto[smallFileId=")
        .append(smallFileId)
        .append(", smallFileUniqueId=")
        .append(smallFileUniqueId)
        .append(", bigFileId=")
        .append(bigFileId)
        .append(", bigFileUniqueId=")
        .append(bigFileUniqueId)
        .append("]");
    return builder.toString();
  }
}

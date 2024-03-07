package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/** This object represents a Telegram user or bot. */
public final class User {

  public static final class Builder {

    private User buildingType;

    public Builder() {
      buildingType = new User();
    }

    public Builder setId(long id) {
      buildingType.id = id;
      return this;
    }

    public Builder setBot(boolean isBot) {
      buildingType.isBot = isBot;
      return this;
    }

    public Builder setFirstName(String firstName) {
      buildingType.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      buildingType.lastName = lastName;
      return this;
    }

    public Builder setUsername(String username) {
      buildingType.username = username;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      buildingType.languageCode = languageCode;
      return this;
    }

    public Builder setIsPremium(Boolean isPremium) {
      buildingType.isPremium = isPremium;
      return this;
    }

    public Builder setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
      buildingType.addedToAttachmentMenu = addedToAttachmentMenu;
      return this;
    }

    public Builder setCanJoinGroups(Boolean canJoinGroups) {
      buildingType.canJoinGroups = canJoinGroups;
      return this;
    }

    public Builder setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
      buildingType.canReadAllGroupMessages = canReadAllGroupMessages;
      return this;
    }

    public Builder setSupportsInlineQueries(Boolean supportsInlineQueries) {
      buildingType.supportsInlineQueries = supportsInlineQueries;
      return this;
    }

    public User build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for this user or bot. This number may have more than 32 significant bits and
   * some programming languages may have difficulty/silent defects in interpreting it. But it has at
   * most 52 significant bits, so a 64-bit integer or double-precision float type are safe for
   * storing this identifier.
   */
  @NotNull public long id;

  /** True, if this user is a bot */
  @NotNull
  @SerializedName("is_bot")
  public boolean isBot;

  /** User's or bot's first name */
  @NotNull
  @SerializedName("first_name")
  public String firstName;

  /** Optional. User's or bot's last name */
  @SerializedName("last_name")
  public String lastName;

  /** Optional. User's or bot's username */
  public String username;

  /** Optional. IETF language tag of the user's language */
  @SerializedName("language_code")
  public String languageCode;

  /** Optional. True, if this user is a Telegram Premium user */
  @SerializedName("is_premium")
  public Boolean isPremium;

  /** Optional. True, if this user added the bot to the attachment menu */
  @SerializedName("added_to_attachment_menu")
  public Boolean addedToAttachmentMenu;

  /** Optional. True, if the bot can be invited to groups. Returned only in getMe. */
  @SerializedName("can_join_groups")
  public Boolean canJoinGroups;

  /** Optional. True, if privacy mode is disabled for the bot. Returned only in getMe. */
  @SerializedName("can_read_all_group_messages")
  public Boolean canReadAllGroupMessages;

  /** Optional. True, if the bot supports inline queries. Returned only in getMe. */
  @SerializedName("supports_inline_queries")
  public Boolean supportsInlineQueries;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof User other)) return false;
    return id == other.id
        && isBot == other.isBot
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(username, other.username)
        && Objects.equals(languageCode, other.languageCode)
        && Objects.equals(isPremium, other.isPremium)
        && Objects.equals(addedToAttachmentMenu, other.addedToAttachmentMenu)
        && Objects.equals(canJoinGroups, other.canJoinGroups)
        && Objects.equals(canReadAllGroupMessages, other.canReadAllGroupMessages)
        && Objects.equals(supportsInlineQueries, other.supportsInlineQueries);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        id,
        isBot,
        firstName,
        lastName,
        username,
        languageCode,
        isPremium,
        addedToAttachmentMenu,
        canJoinGroups,
        canReadAllGroupMessages,
        supportsInlineQueries);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("User[id=")
        .append(id)
        .append(", isBot=")
        .append(isBot)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", username=")
        .append(username)
        .append(", languageCode=")
        .append(languageCode)
        .append(", isPremium=")
        .append(isPremium)
        .append(", addedToAttachmentMenu=")
        .append(addedToAttachmentMenu)
        .append(", canJoinGroups=")
        .append(canJoinGroups)
        .append(", canReadAllGroupMessages=")
        .append(canReadAllGroupMessages)
        .append(", supportsInlineQueries=")
        .append(supportsInlineQueries)
        .append("]");
    return builder.toString();
  }
}

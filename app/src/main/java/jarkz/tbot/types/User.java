package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents a Telegram user or bot in Telegram API.
 *
 * @author Pavel Bialiauski
 */
public class User {

  @NotNull private long id;

  @SerializedName("is_bot")
  @NotNull
  private boolean isBot;

  @SerializedName("first_name")
  @NotNull
  private String firstName;

  @SerializedName("last_name")
  private String lastName;

  private String username;

  @SerializedName("language_code")
  private String languageCode;

  @SerializedName("is_premium")
  private Boolean isPremium;

  @SerializedName("added_to_attachment_menu")
  private Boolean addedToAttachmentMenu;

  @SerializedName("can_join_groups")
  private Boolean canJoinGroups;

  @SerializedName("can_read_all_group_messages")
  private Boolean canReadAllGroupMessages;

  @SerializedName("support_inline_queries")
  private Boolean supportInlineQueries;

  /** Default constructor. */
  public User() {}

  /**
   * Unique identifier for this user or bot.
   *
   * @return id as int.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the unique identifier for user or bot.
   *
   * @param id the unique identifier for user or bot as a long value
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * <i>True</i> if this user is a bot.
   *
   * @return is_bot as boolean.
   */
  public boolean isBot() {
    return isBot;
  }

  /**
   * Sets whether this user is a bot.
   *
   * @param isBot true if this user is a bot, otherwise - null.
   */
  public void setBot(boolean isBot) {
    this.isBot = isBot;
  }

  /**
   * User's or bot's first name.
   *
   * @return first_name as String.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the user's or bot's first name.
   *
   * @param firstName the user's or bot's first name as String.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * <i>Optional.</i> User's or bot's last name.
   *
   * @return an optional value of last_name String.
   */
  public Optional<String> getLastName() {
    return Optional.of(lastName);
  }

  /**
   * Sets the user's or bot's last name.
   *
   * @param lastName the user's or bot's last name as String value or null if user or bot doesn't
   *     contains it.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * <i>Optional.</i> User's or bot's username.
   *
   * @return an optional value of username String.
   */
  public Optional<String> getUsername() {
    return Optional.of(username);
  }

  /**
   * Sets the user's or bot's username.
   *
   * @param username the user's or bot's username as String or null if user or bot doesn't contains
   *     it.
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * <i>Optional.</i> <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language
   * tag</a> of the user's language.
   *
   * @return an optional value of language_code String.
   */
  public Optional<String> getLanguageCode() {
    return Optional.of(languageCode);
  }

  /**
   * Sets the <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a> of the
   * user's language.
   *
   * @param languageCode the IETF language tag of the user's language as String or null if unknown
   *     user language.
   */
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  /**
   * <i>Optional.</i> True if this user is a Telegram Premium user.
   *
   * @return an optional value of is_premium as Boolean.
   */
  public Optional<Boolean> getIsPremium() {
    return Optional.of(isPremium);
  }

  /**
   * True if this user is a Telegram Premium user.
   *
   * @param isPremium true if this user is a Telegram Premium user, otherwise - false or null.
   */
  public void setIsPremium(Boolean isPremium) {
    this.isPremium = isPremium;
  }

  /**
   * <i>Optional.</i> True if this user added the bot to the attachment menu.
   *
   * @return an optional value of added_to_attachment_menu as Boolean.
   */
  public Optional<Boolean> getAddedToAttachmentMenu() {
    return Optional.of(addedToAttachmentMenu);
  }

  /**
   * True if this user added the bot to the attachment menu.
   *
   * @param addedToAttachmentMenu true if this user added the bot to attachment menu, otherwise -
   *     false or null.
   */
  public void setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
    this.addedToAttachmentMenu = addedToAttachmentMenu;
  }

  /**
   * <i>Optional.</i> True if the bot can be invited to groups. Returned only in getMe.
   *
   * @return an optional value of can_join_groups as Boolean.
   */
  public Optional<Boolean> getCanJoinGroups() {
    return Optional.of(canJoinGroups);
  }

  /**
   * True if the bot can be invited to groups. Returned only in getMe.
   *
   * @param canJoinGroups true if the bot can be invited to groups, otherwise - false or null.
   */
  public void setCanJoinGroups(Boolean canJoinGroups) {
    this.canJoinGroups = canJoinGroups;
  }

  /**
   * <i>Optional.</i> True if <a href="https://core.telegram.org/bots/features#privacy-mode">privacy
   * mode</a> is disabled for the bot. Returned only in getMe.
   *
   * @return an optional value of can_read_all_group_messages as Boolean.
   */
  public Optional<Boolean> getCanReadAllGroupMessages() {
    return Optional.of(canReadAllGroupMessages);
  }

  /**
   * True if <a href="https://core.telegram.org/bots/features#privacy-mode">privacy mode</a> is
   * disabled for the bot. Returned only in getMe.
   *
   * @param canReadAllGroupMessages true if the privacy mode is disabled for the bot, otherwise -
   *     false or null.
   */
  public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
    this.canReadAllGroupMessages = canReadAllGroupMessages;
  }

  /**
   * <i>Optional.</i> True if the bot supports inline queries. Returned only in getMe.
   *
   * @return an optional value of support_inline_queries as Boolean.
   */
  public Optional<Boolean> getSupportInlineQueries() {
    return Optional.of(supportInlineQueries);
  }

  /**
   * True if the bot supports inline queries. Returned only in getMe.
   *
   * @param supportInlineQueries true if the bot supports inline queries, otherwise - false or null.
   */
  public void setSupportInlineQueries(Boolean supportInlineQueries) {
    this.supportInlineQueries = supportInlineQueries;
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
        supportInlineQueries);
  }

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
        && Objects.equals(supportInlineQueries, other.supportInlineQueries);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
        .append(", supportInlineQueries=")
        .append(supportInlineQueries)
        .append("]");
    return builder.toString();
  }
}

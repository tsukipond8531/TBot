package jarkz.tbot.types.chatmember;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#chatmember">chat member</a> that owns
 * the chat and has all administrator privileges.
 *
 * @author Pavel Bialiauski
 */
public class ChatMemberOwner implements ChatMember {

  /** Status of {@link ChatMember}. Always "creator". */
  protected static final String STATUS = "creator";

  private final String status = ChatMemberOwner.STATUS;

  @NotNull private User user;

  @SerializedName("is_anonymous")
  @NotNull
  private boolean isAnonymous;

  @SerializedName("custom_title")
  private String customTitle;

  /** Default constructor. */
  public ChatMemberOwner() {}

  /**
   * The member's status in the chat, always “creator”.
   *
   * @return status as String.
   */
  public String getStatus() {
    return status;
  }

  /**
   * Information about the user.
   *
   * @return user as {@link User}.
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the information about the user.
   *
   * @param user the information about the user as {@link User}.
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * <i>True</i>, if the user's presence in the chat is hidden.
   *
   * @return is_anonymous as boolean.
   */
  public boolean isAnonymous() {
    return isAnonymous;
  }

  /**
   * Sets whether the user's presence in the chat is hidden.
   *
   * @param isAnonymous true if the user's presence in the chat is hidden, otherwise - false.
   */
  public void setAnonymous(boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }

  /**
   * <i>Optional.</i> Custom title for this user.
   *
   * @return an optional value of custom_title as String.
   */
  public Optional<String> getCustomTitle() {
    return Optional.ofNullable(customTitle);
  }

  /**
   * Sets the custom title for this user.
   *
   * @param customTitle the custom title for this user as String or null if it doesn't exists.
   */
  public void setCustomTitle(String customTitle) {
    this.customTitle = customTitle;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(status, user, isAnonymous, customTitle);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ChatMemberOwner other)) return false;
    return Objects.equals(status, other.status)
        && Objects.equals(user, other.user)
        && isAnonymous == other.isAnonymous
        && Objects.equals(customTitle, other.customTitle);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ChatMemberOwner[status=")
        .append(status)
        .append(", user=")
        .append(user)
        .append(", isAnonymous=")
        .append(isAnonymous)
        .append(", customTitle=")
        .append(customTitle)
        .append("]");
    return builder.toString();
  }
}

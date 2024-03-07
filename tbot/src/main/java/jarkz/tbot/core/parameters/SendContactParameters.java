package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.ReplyMarkup;
import jarkz.tbot.types.ReplyParameters;
import java.util.Objects;

/** Use this method to send phone contacts. On success, the sent Message is returned. */
public final class SendContactParameters {

  public static final class Builder {

    private SendContactParameters buildingType;

    public Builder() {
      buildingType = new SendContactParameters();
    }

    public Builder setChatId(Id chatId) {
      buildingType.chatId = chatId;
      return this;
    }

    public Builder setMessageThreadId(Integer messageThreadId) {
      buildingType.messageThreadId = messageThreadId;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
      buildingType.phoneNumber = phoneNumber;
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

    public Builder setVcard(String vcard) {
      buildingType.vcard = vcard;
      return this;
    }

    public Builder setDisableNotification(Boolean disableNotification) {
      buildingType.disableNotification = disableNotification;
      return this;
    }

    public Builder setProtectContent(Boolean protectContent) {
      buildingType.protectContent = protectContent;
      return this;
    }

    public Builder setReplyParameters(ReplyParameters replyParameters) {
      buildingType.replyParameters = replyParameters;
      return this;
    }

    public Builder setReplyMarkup(ReplyMarkup replyMarkup) {
      buildingType.replyMarkup = replyMarkup;
      return this;
    }

    public SendContactParameters build() {
      return buildingType;
    }
  }

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public Id chatId;

  /**
   * Unique identifier for the target message thread (topic) of the forum; for forum supergroups
   * only
   */
  @SerializedName("message_thread_id")
  public Integer messageThreadId;

  /** Contact's phone number */
  @NotNull
  @SerializedName("phone_number")
  public String phoneNumber;

  /** Contact's first name */
  @NotNull
  @SerializedName("first_name")
  public String firstName;

  /** Contact's last name */
  @SerializedName("last_name")
  public String lastName;

  /** Additional data about the contact in the form of a vCard, 0-2048 bytes */
  public String vcard;

  /** Sends the message silently. Users will receive a notification with no sound. */
  @SerializedName("disable_notification")
  public Boolean disableNotification;

  /** Protects the contents of the sent message from forwarding and saving */
  @SerializedName("protect_content")
  public Boolean protectContent;

  /** Description of the message to reply to */
  @SerializedName("reply_parameters")
  public ReplyParameters replyParameters;

  /**
   * Additional interface options. A JSON-serialized object for an inline keyboard, custom reply
   * keyboard, instructions to remove reply keyboard or to force a reply from the user.
   */
  @SerializedName("reply_markup")
  public ReplyMarkup replyMarkup;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SendContactParameters other)) return false;
    return Objects.equals(chatId, other.chatId)
        && Objects.equals(messageThreadId, other.messageThreadId)
        && Objects.equals(phoneNumber, other.phoneNumber)
        && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName)
        && Objects.equals(vcard, other.vcard)
        && Objects.equals(disableNotification, other.disableNotification)
        && Objects.equals(protectContent, other.protectContent)
        && Objects.equals(replyParameters, other.replyParameters)
        && Objects.equals(replyMarkup, other.replyMarkup);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        chatId,
        messageThreadId,
        phoneNumber,
        firstName,
        lastName,
        vcard,
        disableNotification,
        protectContent,
        replyParameters,
        replyMarkup);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SendContactParameters[chatId=")
        .append(chatId)
        .append(", messageThreadId=")
        .append(messageThreadId)
        .append(", phoneNumber=")
        .append(phoneNumber)
        .append(", firstName=")
        .append(firstName)
        .append(", lastName=")
        .append(lastName)
        .append(", vcard=")
        .append(vcard)
        .append(", disableNotification=")
        .append(disableNotification)
        .append(", protectContent=")
        .append(protectContent)
        .append(", replyParameters=")
        .append(replyParameters)
        .append(", replyMarkup=")
        .append(replyMarkup)
        .append("]");
    return builder.toString();
  }
}

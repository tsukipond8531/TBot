package jarkz.tbot.core.parameters;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.InputFile;
import java.util.Objects;

/**
 * Use this method to set a new profile photo for the chat. Photos can't be changed for private
 * chats. The bot must be an administrator in the chat for this to work and must have the
 * appropriate administrator rights. Returns True on success.
 */
public final class SetChatPhotoParameters {

  /**
   * Unique identifier for the target chat or username of the target channel (in the
   * format @channelusername)
   */
  @NotNull
  @SerializedName("chat_id")
  public String chatId;

  /** New chat photo, uploaded using multipart/form-data */
  @NotNull public InputFile photo;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof SetChatPhotoParameters other)) return false;
    return Objects.equals(chatId, other.chatId) && Objects.equals(photo, other.photo);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(chatId, photo);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("SetChatPhotoParameters[chatId=")
        .append(chatId)
        .append(", photo=")
        .append(photo)
        .append("]");
    return builder.toString();
  }
}

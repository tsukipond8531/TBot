package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents an incoming update.
 *
 * <p>At most one of the optional parameters can be present in any given update.
 */
public final class Update {

  /**
   * The update's unique identifier. Update identifiers start from a certain positive number and
   * increase sequentially. This identifier becomes especially handy if you're using webhooks, since
   * it allows you to ignore repeated updates or to restore the correct update sequence, should they
   * get out of order. If there are no new updates for at least a week, then identifier of the next
   * update will be chosen randomly instead of sequentially.
   */
  @NotNull
  @SerializedName("update_id")
  public int updateId;

  /** Optional. New incoming message of any kind - text, photo, sticker, etc. */
  public Message message;

  /**
   * Optional. New version of a message that is known to the bot and was edited. This update may at
   * times be triggered by changes to message fields that are either unavailable or not actively
   * used by your bot.
   */
  @SerializedName("edited_message")
  public Message editedMessage;

  /** Optional. New incoming channel post of any kind - text, photo, sticker, etc. */
  @SerializedName("channel_post")
  public Message channelPost;

  /**
   * Optional. New version of a channel post that is known to the bot and was edited. This update
   * may at times be triggered by changes to message fields that are either unavailable or not
   * actively used by your bot.
   */
  @SerializedName("edited_channel_post")
  public Message editedChannelPost;

  /**
   * Optional. A reaction to a message was changed by a user. The bot must be an administrator in
   * the chat and must explicitly specify "message_reaction" in the list of allowed_updates to
   * receive these updates. The update isn't received for reactions set by bots.
   */
  @SerializedName("message_reaction")
  public MessageReactionUpdated messageReaction;

  /**
   * Optional. Reactions to a message with anonymous reactions were changed. The bot must be an
   * administrator in the chat and must explicitly specify "message_reaction_count" in the list of
   * allowed_updates to receive these updates. The updates are grouped and can be sent with delay up
   * to a few minutes.
   */
  @SerializedName("message_reaction_count")
  public MessageReactionCountUpdated messageReactionCount;

  /** Optional. New incoming inline query */
  @SerializedName("inline_query")
  public InlineQuery inlineQuery;

  /**
   * Optional. The result of an inline query that was chosen by a user and sent to their chat
   * partner. Please see our documentation on the feedback collecting for details on how to enable
   * these updates for your bot.
   */
  @SerializedName("chosen_inline_result")
  public ChosenInlineResult chosenInlineResult;

  /** Optional. New incoming callback query */
  @SerializedName("callback_query")
  public CallbackQuery callbackQuery;

  /** Optional. New incoming shipping query. Only for invoices with flexible price */
  @SerializedName("shipping_query")
  public ShippingQuery shippingQuery;

  /** Optional. New incoming pre-checkout query. Contains full information about checkout */
  @SerializedName("pre_checkout_query")
  public PreCheckoutQuery preCheckoutQuery;

  /**
   * Optional. New poll state. Bots receive only updates about manually stopped polls and polls,
   * which are sent by the bot
   */
  public Poll poll;

  /**
   * Optional. A user changed their answer in a non-anonymous poll. Bots receive new votes only in
   * polls that were sent by the bot itself.
   */
  @SerializedName("poll_answer")
  public PollAnswer pollAnswer;

  /**
   * Optional. The bot's chat member status was updated in a chat. For private chats, this update is
   * received only when the bot is blocked or unblocked by the user.
   */
  @SerializedName("my_chat_member")
  public ChatMemberUpdated myChatMember;

  /**
   * Optional. A chat member's status was updated in a chat. The bot must be an administrator in the
   * chat and must explicitly specify "chat_member" in the list of allowed_updates to receive these
   * updates.
   */
  @SerializedName("chat_member")
  public ChatMemberUpdated chatMember;

  /**
   * Optional. A request to join the chat has been sent. The bot must have the can_invite_users
   * administrator right in the chat to receive these updates.
   */
  @SerializedName("chat_join_request")
  public ChatJoinRequest chatJoinRequest;

  /**
   * Optional. A chat boost was added or changed. The bot must be an administrator in the chat to
   * receive these updates.
   */
  @SerializedName("chat_boost")
  public ChatBoostUpdated chatBoost;

  /**
   * Optional. A boost was removed from a chat. The bot must be an administrator in the chat to
   * receive these updates.
   */
  @SerializedName("removed_chat_boost")
  public ChatBoostRemoved removedChatBoost;

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Update other)) return false;
    return updateId == other.updateId
        && Objects.equals(message, other.message)
        && Objects.equals(editedMessage, other.editedMessage)
        && Objects.equals(channelPost, other.channelPost)
        && Objects.equals(editedChannelPost, other.editedChannelPost)
        && Objects.equals(messageReaction, other.messageReaction)
        && Objects.equals(messageReactionCount, other.messageReactionCount)
        && Objects.equals(inlineQuery, other.inlineQuery)
        && Objects.equals(chosenInlineResult, other.chosenInlineResult)
        && Objects.equals(callbackQuery, other.callbackQuery)
        && Objects.equals(shippingQuery, other.shippingQuery)
        && Objects.equals(preCheckoutQuery, other.preCheckoutQuery)
        && Objects.equals(poll, other.poll)
        && Objects.equals(pollAnswer, other.pollAnswer)
        && Objects.equals(myChatMember, other.myChatMember)
        && Objects.equals(chatMember, other.chatMember)
        && Objects.equals(chatJoinRequest, other.chatJoinRequest)
        && Objects.equals(chatBoost, other.chatBoost)
        && Objects.equals(removedChatBoost, other.removedChatBoost);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        updateId,
        message,
        editedMessage,
        channelPost,
        editedChannelPost,
        messageReaction,
        messageReactionCount,
        inlineQuery,
        chosenInlineResult,
        callbackQuery,
        shippingQuery,
        preCheckoutQuery,
        poll,
        pollAnswer,
        myChatMember,
        chatMember,
        chatJoinRequest,
        chatBoost,
        removedChatBoost);
  }

  @Override
  public final String toString() {
    var builder = new StringBuilder();
    builder
        .append("Update[updateId=")
        .append(updateId)
        .append(", message=")
        .append(message)
        .append(", editedMessage=")
        .append(editedMessage)
        .append(", channelPost=")
        .append(channelPost)
        .append(", editedChannelPost=")
        .append(editedChannelPost)
        .append(", messageReaction=")
        .append(messageReaction)
        .append(", messageReactionCount=")
        .append(messageReactionCount)
        .append(", inlineQuery=")
        .append(inlineQuery)
        .append(", chosenInlineResult=")
        .append(chosenInlineResult)
        .append(", callbackQuery=")
        .append(callbackQuery)
        .append(", shippingQuery=")
        .append(shippingQuery)
        .append(", preCheckoutQuery=")
        .append(preCheckoutQuery)
        .append(", poll=")
        .append(poll)
        .append(", pollAnswer=")
        .append(pollAnswer)
        .append(", myChatMember=")
        .append(myChatMember)
        .append(", chatMember=")
        .append(chatMember)
        .append(", chatJoinRequest=")
        .append(chatJoinRequest)
        .append(", chatBoost=")
        .append(chatBoost)
        .append(", removedChatBoost=")
        .append(removedChatBoost)
        .append("]");
    return builder.toString();
  }
}

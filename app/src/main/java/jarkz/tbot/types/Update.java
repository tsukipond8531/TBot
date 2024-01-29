package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.chat.ChatJoinRequest;
import jarkz.tbot.types.chatmember.ChatMemberUpdated;
import jarkz.tbot.types.inlinemode.ChosenInlineResult;
import jarkz.tbot.types.inlinemode.InlineQuery;
import jarkz.tbot.types.payment.PreCheckoutQuery;
import jarkz.tbot.types.payment.ShippingQuery;
import jarkz.tbot.types.poll.Poll;
import jarkz.tbot.types.poll.PollAnswer;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents an incoming update in Telegram API. This <a
 * href="https://core.telegram.org/bots/api#available-types">object</a> represents an incoming
 * update.
 *
 * <p>At most <strong>one</strong> of the optional parameters can be present in any given update.
 *
 * @author Pavel Bialiauski
 */
public class Update {

  @SerializedName("update_id")
  @NotNull
  private long updateId;

  private Message message;

  @SerializedName("edited_message")
  private Message editedMessage;

  @SerializedName("channel_post")
  private Message channelPost;

  @SerializedName("edited_channel_post")
  private Message editedChannelPost;

  @SerializedName("inline_query")
  private InlineQuery inlineQuery;

  @SerializedName("chosen_inline_result")
  private ChosenInlineResult chosenInlineResult;

  @SerializedName("callback_query")
  private CallbackQuery callbackQuery;

  @SerializedName("shipping_query")
  private ShippingQuery shippingQuery;

  @SerializedName("pre_checkout_query")
  private PreCheckoutQuery preCheckoutQuery;

  private Poll poll;

  @SerializedName("poll_answer")
  private PollAnswer pollAnswer;

  @SerializedName("my_chat_member")
  private ChatMemberUpdated myChatMember;

  @SerializedName("chat_member")
  private ChatMemberUpdated chatMember;

  @SerializedName("chat_join_request")
  private ChatJoinRequest chatJoinRequest;

  /** Default constructor. */
  public Update() {}

  /**
   * The update's unique identifier. Update identifiers start from a certain positive number and
   * increase sequentially.
   *
   * <p>This ID becomes especially handy if you're using <a
   * href="https://core.telegram.org/bots/api#setwebhook">webhooks</a>, since it allows you to
   * ignore repeated updates or to restore the correct update sequence, should they get out of
   * order.
   *
   * <p>If there are no new updates for at least a week, then identifier of the next update will be
   * chosen randomly instead of sequentially.
   *
   * @return update unique identifier.
   */
  public long getUpdateId() {
    return updateId;
  }

  /**
   * Sets the update unique identifier.
   *
   * @param updateId the update unique identifier as long value.
   */
  public void setUpdateId(long updateId) {
    this.updateId = updateId;
  }

  /**
   * <i>Optional.</i> New incoming message of any kind - text, photo, sticker, etc.
   *
   * @return an optional value of message as {@link Message}.
   */
  public Optional<Message> getMessage() {
    return Optional.ofNullable(message);
  }

  /**
   * <i>Optional.</i> New incoming message of any kind - text, photo, sticker, etc.
   *
   * @param message the new incoming message as {@link Message} or null if the update present
   *     another parameter.
   */
  public void setMessage(Message message) {
    this.message = message;
  }

  /**
   * <i>Optional.</i> New version of a message that is known to the bot and was edited.
   *
   * @return an optional value of edited message as {@link Message}.
   */
  public Optional<Message> getEditedMessage() {
    return Optional.ofNullable(editedMessage);
  }

  /**
   * Sets the new version of a message that is known to the bot and was edited.
   *
   * @param editedMessage the new version of a message that is known to the bot and was edited as
   *     {@link Message} or null if the update present another parameter.
   */
  public void setEditedMessage(Message editedMessage) {
    this.editedMessage = editedMessage;
  }

  /**
   * <i>Optional.</i> New incoming channel post of any kind - text, photo, sticker, etc.
   *
   * @return an optional value of channel_post as {@link Message}.
   */
  public Optional<Message> getChannelPost() {
    return Optional.ofNullable(channelPost);
  }

  /**
   * Sets the new incoming channel post of any kind - text, photo, sticker, etc.
   *
   * @param channelPost the new incoming channel post as {@link Message} or null if the update
   *     present another parameter.
   */
  public void setChannelPost(Message channelPost) {
    this.channelPost = channelPost;
  }

  /**
   * <i>Optional.</i> New version of a channel post that is known to the bot and was edited.
   *
   * @return an optional value of edited_channel_post as {@link Message}.
   */
  public Optional<Message> getEditedChannelPost() {
    return Optional.ofNullable(editedChannelPost);
  }

  /**
   * Sets the new version of a channel post that is known to the bot and was edited.
   *
   * @param editedChannelPost the new version of a channel post that is known to the bot and was
   *     edited as {@link Message} or null if the update present another parameter.
   */
  public void setEditedChannelPost(Message editedChannelPost) {
    this.editedChannelPost = editedChannelPost;
  }

  /**
   * <i>Optional.</i> New incoming inline query.
   *
   * @return an optional value of inline_query as {@link InlineQuery}.
   */
  public Optional<InlineQuery> getInlineQuery() {
    return Optional.ofNullable(inlineQuery);
  }

  /**
   * Sets the new incoming inline query.
   *
   * @param inlineQuery the new incoming inline query as {@link InlineQuery} or null if the update
   *     present another parameter.
   */
  public void setInlineQuery(InlineQuery inlineQuery) {
    this.inlineQuery = inlineQuery;
  }

  /**
   * <i>Optional.</i> The result of an inline query that was chosen by a user and sent to their chat
   * partner.
   *
   * <p>Please see our documentation on the <a
   * href="https://core.telegram.org/bots/inline#collecting-feedback">feedback collecting</a> for
   * details on how to enable these updates for your bot.
   *
   * @return an optional value of chosen_inline_query as {@link ChosenInlineResult}.
   */
  public Optional<ChosenInlineResult> getChosenInlineResult() {
    return Optional.ofNullable(chosenInlineResult);
  }

  /**
   * Sets the result of an inline query that was chosen by a user and sent to their chat partner.
   *
   * <p>Please see our documentation on the <a
   * href="https://core.telegram.org/bots/inline#collecting-feedback">feedback collecting</a> for
   * details on how to enable these updates for your bot.
   *
   * @param chosenInlineResult the result of an inline query that was chosen by a user and sent to
   *     their chat partner as {@link ChosenInlineResult} or null if the update present another
   *     parameter.
   */
  public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
    this.chosenInlineResult = chosenInlineResult;
  }

  /**
   * <i>Optional.</i> New incoming callback query.
   *
   * @return an optional value of callback_query as {@link CallbackQuery}.
   */
  public Optional<CallbackQuery> getCallbackQuery() {
    return Optional.ofNullable(callbackQuery);
  }

  /**
   * Sets the new incoming callback query.
   *
   * @param callbackQuery the new incoming callback query as {@link CallbackQuery} or null if the
   *     update present another parameter.
   */
  public void setCallbackQuery(CallbackQuery callbackQuery) {
    this.callbackQuery = callbackQuery;
  }

  /**
   * <i>Optional.</i> New incoming shipping query. Only for invoices with flexible price.
   *
   * @return an optional value of shipping_query as {@link ShippingQuery}.
   */
  public Optional<ShippingQuery> getShippingQuery() {
    return Optional.ofNullable(shippingQuery);
  }

  /**
   * Sets the new incoming shipping query. Only for invoices with flexible price.
   *
   * @param shippingQuery the new incoming shipping query as {@link ShippingQuery} or null if the
   *     update present another parameter.
   */
  public void setShippingQuery(ShippingQuery shippingQuery) {
    this.shippingQuery = shippingQuery;
  }

  /**
   * <i>Optional.</i> New incoming pre-checkout query. Contains full information about checkout.
   *
   * @return an optional value of pre_checkout_query as {@link PreCheckoutQuery}.
   */
  public Optional<PreCheckoutQuery> getPreCheckoutQuery() {
    return Optional.ofNullable(preCheckoutQuery);
  }

  /**
   * Sets the new incoming pre-checkout query. Contains full information about checkout.
   *
   * @param preCheckoutQuery the new incoming pre-checkout query as {@link PreCheckoutQuery} or null
   *     if the update present another parameter.
   */
  public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
    this.preCheckoutQuery = preCheckoutQuery;
  }

  /**
   * <i>Optional.</i> New poll state. Bots receive only updates about stopped polls and polls, which
   * are sent by the bot
   *
   * @return an optional value of poll as {@link Poll}.
   */
  public Optional<Poll> getPoll() {
    return Optional.ofNullable(poll);
  }

  /**
   * Sets the new poll state. Bots receive only updates about stopped polls and polls, which are
   * sent by the bot
   *
   * @param poll the new poll state as {@link Poll} or null if the update present another parameter.
   */
  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  /**
   * <i>Optional.</i> A user changed their answer in a non-anonymous poll. Bots receive new votes
   * only in polls that were sent by the bot itself.
   *
   * @return an optional value of poll_answer as {@link PollAnswer}.
   */
  public Optional<PollAnswer> getPollAnswer() {
    return Optional.ofNullable(pollAnswer);
  }

  /**
   * Sets the user changed their answer in a non-anonymous poll. Bots receive new votes only in
   * polls that were sent by the bot itself.
   *
   * @param pollAnswer the user changed their answer in a non-anonymous poll as {@link PollAnswer}
   *     or null if the update present another parameter.
   */
  public void setPollAnswer(PollAnswer pollAnswer) {
    this.pollAnswer = pollAnswer;
  }

  /**
   * <i>Optional.</i> The bot's chat member status was updated in a chat. For private chats, this
   * update is received only when the bot is blocked or unblocked by the user.
   *
   * @return an optional value of my_chat_member as {@link ChatMemberUpdated}.
   */
  public Optional<ChatMemberUpdated> getMyChatMember() {
    return Optional.ofNullable(myChatMember);
  }

  /**
   * Sets the bot's chat member status was updated in a chat. For private chats, this update is
   * received only when the bot is blocked or unblocked by the user.
   *
   * @param myChatMember the bot's chat member status was updated in a chat as {@link
   *     ChatMemberUpdated} or null if the update present another parameter.
   */
  public void setMyChatMember(ChatMemberUpdated myChatMember) {
    this.myChatMember = myChatMember;
  }

  /**
   * <i>Optional.</i> A chat member's status was updated in a chat. The bot must be an administrator
   * in the chat and must explicitly specify “chat_member” in the list of allowed_updates to receive
   * these updates.
   *
   * @return an optional value of chat_member as {@link ChatMemberUpdated}.
   */
  public Optional<ChatMemberUpdated> getChatMember() {
    return Optional.ofNullable(chatMember);
  }

  /**
   * Sets the chat member's status was updated in a chat. The bot must be an administrator in the
   * chat and must explicitly specify “chat_member” in the list of allowed_updates to receive these
   * updates.
   *
   * @param chatMember chat member's status was updated in a chat as {@link ChatMemberUpdated} or
   *     null if the update present another parameter.
   */
  public void setChatMember(ChatMemberUpdated chatMember) {
    this.chatMember = chatMember;
  }

  /**
   * <i>Optional.</i> A request to join the chat has been sent. The bot must have the
   * can_invite_users administrator right in the chat to receive these updates.
   *
   * @return an optional value of chat_join_request as {@link ChatJoinRequest}.
   */
  public Optional<ChatJoinRequest> getChatJoinRequest() {
    return Optional.ofNullable(chatJoinRequest);
  }

  /**
   * Sets the request to join the chat has been sent. The bot must have the can_invite_users
   * administrator right in the chat to receive these updates.
   *
   * @param chatJoinRequest the request to join the chat has been sent as {@link ChatJoinRequest} or
   *     null if the update present another parameter.
   */
  public void setChatJoinRequest(ChatJoinRequest chatJoinRequest) {
    this.chatJoinRequest = chatJoinRequest;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        updateId,
        message,
        editedMessage,
        channelPost,
        editedChannelPost,
        inlineQuery,
        chosenInlineResult,
        callbackQuery,
        shippingQuery,
        preCheckoutQuery,
        poll,
        pollAnswer,
        myChatMember,
        chatMember,
        chatJoinRequest);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Update other)) return false;
    return updateId == other.updateId
        && Objects.equals(message, other.message)
        && Objects.equals(editedMessage, other.editedMessage)
        && Objects.equals(channelPost, other.channelPost)
        && Objects.equals(editedChannelPost, other.editedChannelPost)
        && Objects.equals(inlineQuery, other.inlineQuery)
        && Objects.equals(chosenInlineResult, other.chosenInlineResult)
        && Objects.equals(callbackQuery, other.callbackQuery)
        && Objects.equals(shippingQuery, other.shippingQuery)
        && Objects.equals(preCheckoutQuery, other.preCheckoutQuery)
        && Objects.equals(poll, other.poll)
        && Objects.equals(pollAnswer, other.pollAnswer)
        && Objects.equals(myChatMember, other.myChatMember)
        && Objects.equals(chatMember, other.chatMember)
        && Objects.equals(chatJoinRequest, other.chatJoinRequest);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
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
        .append("]");
    return builder.toString();
  }
}

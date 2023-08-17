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

  public Update() {}

  public long getUpdateId() {
    return updateId;
  }

  public void setUpdateId(long updateId) {
    this.updateId = updateId;
  }

  public Optional<Message> getMessage() {
    return Optional.of(message);
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Optional<Message> getEditedMessage() {
    return Optional.of(editedMessage);
  }

  public void setEditedMessage(Message editedMessage) {
    this.editedMessage = editedMessage;
  }

  public Optional<Message> getChannelPost() {
    return Optional.of(channelPost);
  }

  public void setChannelPost(Message channelPost) {
    this.channelPost = channelPost;
  }

  public Optional<Message> getEditedChannelPost() {
    return Optional.of(editedChannelPost);
  }

  public void setEditedChannelPost(Message editedChannelPost) {
    this.editedChannelPost = editedChannelPost;
  }

  public Optional<InlineQuery> getInlineQuery() {
    return Optional.of(inlineQuery);
  }

  public void setInlineQuery(InlineQuery inlineQuery) {
    this.inlineQuery = inlineQuery;
  }

  public Optional<ChosenInlineResult> getChosenInlineResult() {
    return Optional.of(chosenInlineResult);
  }

  public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
    this.chosenInlineResult = chosenInlineResult;
  }

  public Optional<CallbackQuery> getCallbackQuery() {
    return Optional.of(callbackQuery);
  }

  public void setCallbackQuery(CallbackQuery callbackQuery) {
    this.callbackQuery = callbackQuery;
  }

  public Optional<ShippingQuery> getShippingQuery() {
    return Optional.of(shippingQuery);
  }

  public void setShippingQuery(ShippingQuery shippingQuery) {
    this.shippingQuery = shippingQuery;
  }

  public Optional<PreCheckoutQuery> getPreCheckoutQuery() {
    return Optional.of(preCheckoutQuery);
  }

  public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
    this.preCheckoutQuery = preCheckoutQuery;
  }

  public Optional<Poll> getPoll() {
    return Optional.of(poll);
  }

  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  public Optional<PollAnswer> getPollAnswer() {
    return Optional.of(pollAnswer);
  }

  public void setPollAnswer(PollAnswer pollAnswer) {
    this.pollAnswer = pollAnswer;
  }

  public Optional<ChatMemberUpdated> getMyChatMember() {
    return Optional.of(myChatMember);
  }

  public void setMyChatMember(ChatMemberUpdated myChatMember) {
    this.myChatMember = myChatMember;
  }

  public Optional<ChatMemberUpdated> getChatMember() {
    return Optional.of(chatMember);
  }

  public void setChatMember(ChatMemberUpdated chatMember) {
    this.chatMember = chatMember;
  }

  public Optional<ChatJoinRequest> getChatJoinRequest() {
    return Optional.of(chatJoinRequest);
  }

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

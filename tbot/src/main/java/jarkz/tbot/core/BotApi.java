package jarkz.tbot.core;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import jarkz.tbot.core.parameters.AddStickerToSetParameters;
import jarkz.tbot.core.parameters.AnswerCallbackQueryParameters;
import jarkz.tbot.core.parameters.AnswerInlineQueryParameters;
import jarkz.tbot.core.parameters.AnswerPreCheckoutQueryParameters;
import jarkz.tbot.core.parameters.AnswerShippingQueryParameters;
import jarkz.tbot.core.parameters.AnswerWebAppQueryParameters;
import jarkz.tbot.core.parameters.ApproveChatJoinRequestParameters;
import jarkz.tbot.core.parameters.BanChatMemberParameters;
import jarkz.tbot.core.parameters.BanChatSenderChatParameters;
import jarkz.tbot.core.parameters.CloseForumTopicParameters;
import jarkz.tbot.core.parameters.CloseGeneralForumTopicParameters;
import jarkz.tbot.core.parameters.CopyMessageParameters;
import jarkz.tbot.core.parameters.CopyMessagesParameters;
import jarkz.tbot.core.parameters.CreateChatInviteLinkParameters;
import jarkz.tbot.core.parameters.CreateForumTopicParameters;
import jarkz.tbot.core.parameters.CreateInvoiceLinkParameters;
import jarkz.tbot.core.parameters.CreateNewStickerSetParameters;
import jarkz.tbot.core.parameters.DeclineChatJoinRequestParameters;
import jarkz.tbot.core.parameters.DeleteChatPhotoParameters;
import jarkz.tbot.core.parameters.DeleteChatStickerSetParameters;
import jarkz.tbot.core.parameters.DeleteForumTopicParameters;
import jarkz.tbot.core.parameters.DeleteMessageParameters;
import jarkz.tbot.core.parameters.DeleteMessagesParameters;
import jarkz.tbot.core.parameters.DeleteMyCommandsParameters;
import jarkz.tbot.core.parameters.DeleteStickerFromSetParameters;
import jarkz.tbot.core.parameters.DeleteStickerSetParameters;
import jarkz.tbot.core.parameters.DeleteWebhookParameters;
import jarkz.tbot.core.parameters.EditChatInviteLinkParameters;
import jarkz.tbot.core.parameters.EditForumTopicParameters;
import jarkz.tbot.core.parameters.EditGeneralForumTopicParameters;
import jarkz.tbot.core.parameters.EditMessageCaptionParameters;
import jarkz.tbot.core.parameters.EditMessageLiveLocationParameters;
import jarkz.tbot.core.parameters.EditMessageMediaParameters;
import jarkz.tbot.core.parameters.EditMessageReplyMarkupParameters;
import jarkz.tbot.core.parameters.EditMessageTextParameters;
import jarkz.tbot.core.parameters.ExportChatInviteLinkParameters;
import jarkz.tbot.core.parameters.ForwardMessageParameters;
import jarkz.tbot.core.parameters.ForwardMessagesParameters;
import jarkz.tbot.core.parameters.GetChatAdministratorsParameters;
import jarkz.tbot.core.parameters.GetChatMemberCountParameters;
import jarkz.tbot.core.parameters.GetChatMemberParameters;
import jarkz.tbot.core.parameters.GetChatMenuButtonParameters;
import jarkz.tbot.core.parameters.GetChatParameters;
import jarkz.tbot.core.parameters.GetCustomEmojiStickersParameters;
import jarkz.tbot.core.parameters.GetFileParameters;
import jarkz.tbot.core.parameters.GetGameHighScoresParameters;
import jarkz.tbot.core.parameters.GetMyCommandsParameters;
import jarkz.tbot.core.parameters.GetMyDefaultAdministratorRightsParameters;
import jarkz.tbot.core.parameters.GetMyDescriptionParameters;
import jarkz.tbot.core.parameters.GetMyNameParameters;
import jarkz.tbot.core.parameters.GetMyShortDescriptionParameters;
import jarkz.tbot.core.parameters.GetStickerSetParameters;
import jarkz.tbot.core.parameters.GetUpdatesParameters;
import jarkz.tbot.core.parameters.GetUserChatBoostsParameters;
import jarkz.tbot.core.parameters.GetUserProfilePhotosParameters;
import jarkz.tbot.core.parameters.HideGeneralForumTopicParameters;
import jarkz.tbot.core.parameters.LeaveChatParameters;
import jarkz.tbot.core.parameters.PinChatMessageParameters;
import jarkz.tbot.core.parameters.PromoteChatMemberParameters;
import jarkz.tbot.core.parameters.ReopenForumTopicParameters;
import jarkz.tbot.core.parameters.ReopenGeneralForumTopicParameters;
import jarkz.tbot.core.parameters.RestrictChatMemberParameters;
import jarkz.tbot.core.parameters.RevokeChatInviteLinkParameters;
import jarkz.tbot.core.parameters.SendAnimationParameters;
import jarkz.tbot.core.parameters.SendAudioParameters;
import jarkz.tbot.core.parameters.SendChatActionParameters;
import jarkz.tbot.core.parameters.SendContactParameters;
import jarkz.tbot.core.parameters.SendDiceParameters;
import jarkz.tbot.core.parameters.SendDocumentParameters;
import jarkz.tbot.core.parameters.SendGameParameters;
import jarkz.tbot.core.parameters.SendInvoiceParameters;
import jarkz.tbot.core.parameters.SendLocationParameters;
import jarkz.tbot.core.parameters.SendMediaGroupParameters;
import jarkz.tbot.core.parameters.SendMessageParameters;
import jarkz.tbot.core.parameters.SendPhotoParameters;
import jarkz.tbot.core.parameters.SendPollParameters;
import jarkz.tbot.core.parameters.SendStickerParameters;
import jarkz.tbot.core.parameters.SendVenueParameters;
import jarkz.tbot.core.parameters.SendVideoNoteParameters;
import jarkz.tbot.core.parameters.SendVideoParameters;
import jarkz.tbot.core.parameters.SendVoiceParameters;
import jarkz.tbot.core.parameters.SetChatAdministratorCustomTitleParameters;
import jarkz.tbot.core.parameters.SetChatDescriptionParameters;
import jarkz.tbot.core.parameters.SetChatMenuButtonParameters;
import jarkz.tbot.core.parameters.SetChatPermissionsParameters;
import jarkz.tbot.core.parameters.SetChatPhotoParameters;
import jarkz.tbot.core.parameters.SetChatStickerSetParameters;
import jarkz.tbot.core.parameters.SetChatTitleParameters;
import jarkz.tbot.core.parameters.SetCustomEmojiStickerSetThumbnailParameters;
import jarkz.tbot.core.parameters.SetGameScoreParameters;
import jarkz.tbot.core.parameters.SetMessageReactionParameters;
import jarkz.tbot.core.parameters.SetMyCommandsParameters;
import jarkz.tbot.core.parameters.SetMyDefaultAdministratorRightsParameters;
import jarkz.tbot.core.parameters.SetMyDescriptionParameters;
import jarkz.tbot.core.parameters.SetMyNameParameters;
import jarkz.tbot.core.parameters.SetMyShortDescriptionParameters;
import jarkz.tbot.core.parameters.SetPassportDataErrorsParameters;
import jarkz.tbot.core.parameters.SetStickerEmojiListParameters;
import jarkz.tbot.core.parameters.SetStickerKeywordsParameters;
import jarkz.tbot.core.parameters.SetStickerMaskPositionParameters;
import jarkz.tbot.core.parameters.SetStickerPositionInSetParameters;
import jarkz.tbot.core.parameters.SetStickerSetThumbnailParameters;
import jarkz.tbot.core.parameters.SetStickerSetTitleParameters;
import jarkz.tbot.core.parameters.SetWebhookParameters;
import jarkz.tbot.core.parameters.StopMessageLiveLocationParameters;
import jarkz.tbot.core.parameters.StopPollParameters;
import jarkz.tbot.core.parameters.UnbanChatMemberParameters;
import jarkz.tbot.core.parameters.UnbanChatSenderChatParameters;
import jarkz.tbot.core.parameters.UnhideGeneralForumTopicParameters;
import jarkz.tbot.core.parameters.UnpinAllChatMessagesParameters;
import jarkz.tbot.core.parameters.UnpinAllForumTopicMessagesParameters;
import jarkz.tbot.core.parameters.UnpinAllGeneralForumTopicMessagesParameters;
import jarkz.tbot.core.parameters.UnpinChatMessageParameters;
import jarkz.tbot.core.parameters.UploadStickerFileParameters;
import jarkz.tbot.types.BotCommand;
import jarkz.tbot.types.BotDescription;
import jarkz.tbot.types.BotName;
import jarkz.tbot.types.BotShortDescription;
import jarkz.tbot.types.Chat;
import jarkz.tbot.types.ChatAdministratorRights;
import jarkz.tbot.types.ChatInviteLink;
import jarkz.tbot.types.ChatMember;
import jarkz.tbot.types.File;
import jarkz.tbot.types.ForumTopic;
import jarkz.tbot.types.GameHighScore;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.InputFile;
import jarkz.tbot.types.MenuButton;
import jarkz.tbot.types.Message;
import jarkz.tbot.types.MessageId;
import jarkz.tbot.types.MessageOrBoolean;
import jarkz.tbot.types.Poll;
import jarkz.tbot.types.SentWebAppMessage;
import jarkz.tbot.types.Sticker;
import jarkz.tbot.types.StickerSet;
import jarkz.tbot.types.Update;
import jarkz.tbot.types.User;
import jarkz.tbot.types.UserChatBoosts;
import jarkz.tbot.types.UserProfilePhotos;
import jarkz.tbot.types.WebhookInfo;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * General implementation of data exchanging between Appication and Telegram API using HTTP
 * requests.
 *
 * <p>This class contains several methods of Telegram API. For passing parameters to method use
 * specific type, which creates from method name in PascalCase + "Parameters" word (e.g.
 * "getUpdates" method -> "GetUpdatesParameters"). Theses parameters contains required fields and
 * optional fields, which can sets by setters. <strong>Note:</strong> exception will be thrown if
 * one of required fields is not set.
 *
 * <p>Usage:
 *
 * <pre><code>
 * var token = "your_token";
 * var api = new BotApi(token);
 * var params = new GetUpdatesParameters();
 * {@link Update}[] updates = api.getUpdates(params);
 * </code></pre>
 */
public final class BotApi {

  private static final Gson gson;

  static {
    gson = registerAllAdapters();
  }

  private static final Set<Class<?>> DEFAULT_TYPES =
      Set.of(
          String.class,
          Short.class,
          Integer.class,
          Long.class,
          Float.class,
          Double.class,
          Character.class,
          Boolean.class,
          Byte.class,
          Short.TYPE,
          Integer.TYPE,
          Long.TYPE,
          Float.TYPE,
          Double.TYPE,
          Character.TYPE,
          Boolean.TYPE,
          Byte.TYPE);

  private static final Set<Class<?>> SPECIFIC_TYPES = Set.of(Id.class, MessageOrBoolean.class);

  private static Gson registerAllAdapters() {
    return new GsonBuilder()
        .registerTypeAdapter(
            jarkz.tbot.types.BotCommandScope.class,
            new jarkz.tbot.types.deserializers.BotCommandScopeDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.ChatMember.class,
            new jarkz.tbot.types.deserializers.ChatMemberDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.MenuButton.class,
            new jarkz.tbot.types.deserializers.MenuButtonDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.MessageOrigin.class,
            new jarkz.tbot.types.deserializers.MessageOriginDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.ReactionType.class,
            new jarkz.tbot.types.deserializers.ReactionTypeDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.MaybeInaccessibleMessage.class,
            new jarkz.tbot.types.deserializers.MaybeInaccessibleMessageDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.ChatBoostSource.class,
            new jarkz.tbot.types.deserializers.ChatBoostSourceDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.PassportElementError.class,
            new jarkz.tbot.types.deserializers.PassportElementErrorDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.MessageOrBoolean.class,
            new jarkz.tbot.types.deserializers.MessageOrBooleanDeserializer())
        .registerTypeAdapter(
            jarkz.tbot.types.Id.class, new jarkz.tbot.types.serializers.IdSerializer())
        .registerTypeAdapter(
            jarkz.tbot.types.InputFile.class,
            new jarkz.tbot.types.serializers.InputFileSerializer())
        .create();
  }

  private final String botToken;

  private final String urlTemplate = "https://api.telegram.org/bot%s/%s";

  public BotApi(String botToken) {
    this.botToken = botToken;
  }

  /**
   * Use this method to receive incoming updates using long polling (wiki). Returns an Array of
   * Update objects.
   *
   * <p><a href=https://core.telegram.org/bots/api#getupdates>Source</a>
   */
  public List<Update> getUpdates(GetUpdatesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getUpdates";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<Update>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to specify a URL and receive incoming updates via an outgoing webhook. Whenever
   * there is an update for the bot, we will send an HTTPS POST request to the specified URL,
   * containing a JSON-serialized Update. In case of an unsuccessful request, we will give up after
   * a reasonable amount of attempts. Returns True on success.
   *
   * <p>If you'd like to make sure that the webhook was set by you, you can specify secret data in
   * the parameter secret_token. If specified, the request will contain a header
   * "X-Telegram-Bot-Api-Secret-Token" with the secret token as content.
   *
   * <p><a href=https://core.telegram.org/bots/api#setwebhook>Source</a>
   */
  public Boolean setWebhook(SetWebhookParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setWebhook";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to remove webhook integration if you decide to switch back to getUpdates.
   * Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletewebhook>Source</a>
   */
  public Boolean deleteWebhook(DeleteWebhookParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteWebhook";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get current webhook status. Requires no parameters. On success, returns a
   * WebhookInfo object. If the bot is using getUpdates, will return an object with the url field
   * empty.
   *
   * <p><a href=https://core.telegram.org/bots/api#getwebhookinfo>Source</a>
   */
  public WebhookInfo getWebhookInfo() {
    final var methodName = "getWebhookInfo";

    final var entity = new StringEntity("", Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<WebhookInfo>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * A simple method for testing your bot's authentication token. Requires no parameters. Returns
   * basic information about the bot in form of a User object.
   *
   * <p><a href=https://core.telegram.org/bots/api#getme>Source</a>
   */
  public User getMe() {
    final var methodName = "getMe";

    final var entity = new StringEntity("", Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<User>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to log out from the cloud Bot API server before launching the bot locally. You
   * must log out the bot before running it locally, otherwise there is no guarantee that the bot
   * will receive updates. After a successful call, you can immediately log in on a local server,
   * but will not be able to log in back to the cloud Bot API server for 10 minutes. Returns True on
   * success. Requires no parameters.
   *
   * <p><a href=https://core.telegram.org/bots/api#logout>Source</a>
   */
  public Boolean logOut() {
    final var methodName = "logOut";

    final var entity = new StringEntity("", Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to close the bot instance before moving it from one local server to another.
   * You need to delete the webhook before calling this method to ensure that the bot isn't launched
   * again after server restart. The method will return error 429 in the first 10 minutes after the
   * bot is launched. Returns True on success. Requires no parameters.
   *
   * <p><a href=https://core.telegram.org/bots/api#close>Source</a>
   */
  public Boolean close() {
    final var methodName = "close";

    final var entity = new StringEntity("", Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send text messages. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendmessage>Source</a>
   */
  public Message sendMessage(SendMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to forward messages of any kind. Service messages and messages with protected
   * content can't be forwarded. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#forwardmessage>Source</a>
   */
  public Message forwardMessage(ForwardMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "forwardMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to forward multiple messages of any kind. If some of the specified messages
   * can't be found or forwarded, they are skipped. Service messages and messages with protected
   * content can't be forwarded. Album grouping is kept for forwarded messages. On success, an array
   * of MessageId of the sent messages is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#forwardmessages>Source</a>
   */
  public List<MessageId> forwardMessages(ForwardMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "forwardMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<MessageId>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to copy messages of any kind. Service messages, giveaway messages, giveaway
   * winners messages, and invoice messages can't be copied. A quiz poll can be copied only if the
   * value of the field correct_option_id is known to the bot. The method is analogous to the method
   * forwardMessage, but the copied message doesn't have a link to the original message. Returns the
   * MessageId of the sent message on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#copymessage>Source</a>
   */
  public MessageId copyMessage(CopyMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "copyMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageId>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to copy messages of any kind. If some of the specified messages can't be found
   * or copied, they are skipped. Service messages, giveaway messages, giveaway winners messages,
   * and invoice messages can't be copied. A quiz poll can be copied only if the value of the field
   * correct_option_id is known to the bot. The method is analogous to the method forwardMessages,
   * but the copied messages don't have a link to the original message. Album grouping is kept for
   * copied messages. On success, an array of MessageId of the sent messages is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#copymessages>Source</a>
   */
  public List<MessageId> copyMessages(CopyMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "copyMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<MessageId>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send photos. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendphoto>Source</a>
   */
  public Message sendPhoto(SendPhotoParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendPhoto";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send audio files, if you want Telegram clients to display them in the music
   * player. Your audio must be in the .MP3 or .M4A format. On success, the sent Message is
   * returned. Bots can currently send audio files of up to 50 MB in size, this limit may be changed
   * in the future.
   *
   * <p>For sending voice messages, use the sendVoice method instead.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendaudio>Source</a>
   */
  public Message sendAudio(SendAudioParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendAudio";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send general files. On success, the sent Message is returned. Bots can
   * currently send files of any type of up to 50 MB in size, this limit may be changed in the
   * future.
   *
   * <p><a href=https://core.telegram.org/bots/api#senddocument>Source</a>
   */
  public Message sendDocument(SendDocumentParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendDocument";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send video files, Telegram clients support MPEG4 videos (other formats may
   * be sent as Document). On success, the sent Message is returned. Bots can currently send video
   * files of up to 50 MB in size, this limit may be changed in the future.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendvideo>Source</a>
   */
  public Message sendVideo(SendVideoParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendVideo";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound). On
   * success, the sent Message is returned. Bots can currently send animation files of up to 50 MB
   * in size, this limit may be changed in the future.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendanimation>Source</a>
   */
  public Message sendAnimation(SendAnimationParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendAnimation";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send audio files, if you want Telegram clients to display the file as a
   * playable voice message. For this to work, your audio must be in an .OGG file encoded with OPUS
   * (other formats may be sent as Audio or Document). On success, the sent Message is returned.
   * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the
   * future.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendvoice>Source</a>
   */
  public Message sendVoice(SendVoiceParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendVoice";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * As of v.4.0, Telegram clients support rounded square MPEG4 videos of up to 1 minute long. Use
   * this method to send video messages. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendvideonote>Source</a>
   */
  public Message sendVideoNote(SendVideoNoteParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendVideoNote";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send a group of photos, videos, documents or audios as an album. Documents
   * and audio files can be only grouped in an album with messages of the same type. On success, an
   * array of Messages that were sent is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendmediagroup>Source</a>
   */
  public List<Message> sendMediaGroup(SendMediaGroupParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendMediaGroup";

    final var entity = buildExtendedMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<Message>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send point on the map. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendlocation>Source</a>
   */
  public Message sendLocation(SendLocationParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendLocation";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send information about a venue. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendvenue>Source</a>
   */
  public Message sendVenue(SendVenueParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendVenue";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send phone contacts. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendcontact>Source</a>
   */
  public Message sendContact(SendContactParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendContact";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send a native poll. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendpoll>Source</a>
   */
  public Message sendPoll(SendPollParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendPoll";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send an animated emoji that will display a random value. On success, the
   * sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#senddice>Source</a>
   */
  public Message sendDice(SendDiceParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendDice";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method when you need to tell the user that something is happening on the bot's side.
   * The status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients
   * clear its typing status). Returns True on success.
   *
   * <p>We only recommend using this method when a response from the bot will take a noticeable
   * amount of time to arrive.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendchataction>Source</a>
   */
  public Boolean sendChatAction(SendChatActionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendChatAction";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the chosen reactions on a message. Service messages can't be reacted
   * to. Automatically forwarded messages from a channel to its discussion group have the same
   * available reactions as messages in the channel. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmessagereaction>Source</a>
   */
  public Boolean setMessageReaction(SetMessageReactionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMessageReaction";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get a list of profile pictures for a user. Returns a UserProfilePhotos
   * object.
   *
   * <p><a href=https://core.telegram.org/bots/api#getuserprofilephotos>Source</a>
   */
  public UserProfilePhotos getUserProfilePhotos(GetUserProfilePhotosParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getUserProfilePhotos";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<UserProfilePhotos>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get basic information about a file and prepare it for downloading. For the
   * moment, bots can download files of up to 20MB in size. On success, a File object is returned.
   * The file can then be downloaded via the link
   * https://api.telegram.org/file/bot<token>/<file_path>, where <file_path> is taken from the
   * response. It is guaranteed that the link will be valid for at least 1 hour. When the link
   * expires, a new one can be requested by calling getFile again.
   *
   * <p>Note: This function may not preserve the original file name and MIME type. You should save
   * the file's MIME type and name (if available) when the File object is received.
   *
   * <p><a href=https://core.telegram.org/bots/api#getfile>Source</a>
   */
  public File getFile(GetFileParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getFile";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<File>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to ban a user in a group, a supergroup or a channel. In the case of supergroups
   * and channels, the user will not be able to return to the chat on their own using invite links,
   * etc., unless unbanned first. The bot must be an administrator in the chat for this to work and
   * must have the appropriate administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#banchatmember>Source</a>
   */
  public Boolean banChatMember(BanChatMemberParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "banChatMember";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to unban a previously banned user in a supergroup or channel. The user will not
   * return to the group or channel automatically, but will be able to join via link, etc. The bot
   * must be an administrator for this to work. By default, this method guarantees that after the
   * call the user is not a member of the chat, but will be able to join it. So if the user is a
   * member of the chat they will also be removed from the chat. If you don't want this, use the
   * parameter only_if_banned. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unbanchatmember>Source</a>
   */
  public Boolean unbanChatMember(UnbanChatMemberParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unbanChatMember";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to restrict a user in a supergroup. The bot must be an administrator in the
   * supergroup for this to work and must have the appropriate administrator rights. Pass True for
   * all permissions to lift restrictions from a user. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#restrictchatmember>Source</a>
   */
  public Boolean restrictChatMember(RestrictChatMemberParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "restrictChatMember";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to promote or demote a user in a supergroup or a channel. The bot must be an
   * administrator in the chat for this to work and must have the appropriate administrator rights.
   * Pass False for all boolean parameters to demote a user. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#promotechatmember>Source</a>
   */
  public Boolean promoteChatMember(PromoteChatMemberParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "promoteChatMember";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set a custom title for an administrator in a supergroup promoted by the bot.
   * Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatadministratorcustomtitle>Source</a>
   */
  public Boolean setChatAdministratorCustomTitle(SetChatAdministratorCustomTitleParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatAdministratorCustomTitle";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to ban a channel chat in a supergroup or a channel. Until the chat is unbanned,
   * the owner of the banned chat won't be able to send messages on behalf of any of their channels.
   * The bot must be an administrator in the supergroup or channel for this to work and must have
   * the appropriate administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#banchatsenderchat>Source</a>
   */
  public Boolean banChatSenderChat(BanChatSenderChatParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "banChatSenderChat";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to unban a previously banned channel chat in a supergroup or channel. The bot
   * must be an administrator for this to work and must have the appropriate administrator rights.
   * Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unbanchatsenderchat>Source</a>
   */
  public Boolean unbanChatSenderChat(UnbanChatSenderChatParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unbanChatSenderChat";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set default chat permissions for all members. The bot must be an
   * administrator in the group or a supergroup for this to work and must have the
   * can_restrict_members administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatpermissions>Source</a>
   */
  public Boolean setChatPermissions(SetChatPermissionsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatPermissions";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to generate a new primary invite link for a chat; any previously generated
   * primary link is revoked. The bot must be an administrator in the chat for this to work and must
   * have the appropriate administrator rights. Returns the new invite link as String on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#exportchatinvitelink>Source</a>
   */
  public String exportChatInviteLink(ExportChatInviteLinkParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "exportChatInviteLink";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<String>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to create an additional invite link for a chat. The bot must be an
   * administrator in the chat for this to work and must have the appropriate administrator rights.
   * The link can be revoked using the method revokeChatInviteLink. Returns the new invite link as
   * ChatInviteLink object.
   *
   * <p><a href=https://core.telegram.org/bots/api#createchatinvitelink>Source</a>
   */
  public ChatInviteLink createChatInviteLink(CreateChatInviteLinkParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "createChatInviteLink";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ChatInviteLink>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit a non-primary invite link created by the bot. The bot must be an
   * administrator in the chat for this to work and must have the appropriate administrator rights.
   * Returns the edited invite link as a ChatInviteLink object.
   *
   * <p><a href=https://core.telegram.org/bots/api#editchatinvitelink>Source</a>
   */
  public ChatInviteLink editChatInviteLink(EditChatInviteLinkParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editChatInviteLink";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ChatInviteLink>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to revoke an invite link created by the bot. If the primary link is revoked, a
   * new link is automatically generated. The bot must be an administrator in the chat for this to
   * work and must have the appropriate administrator rights. Returns the revoked invite link as
   * ChatInviteLink object.
   *
   * <p><a href=https://core.telegram.org/bots/api#revokechatinvitelink>Source</a>
   */
  public ChatInviteLink revokeChatInviteLink(RevokeChatInviteLinkParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "revokeChatInviteLink";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ChatInviteLink>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to approve a chat join request. The bot must be an administrator in the chat
   * for this to work and must have the can_invite_users administrator right. Returns True on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#approvechatjoinrequest>Source</a>
   */
  public Boolean approveChatJoinRequest(ApproveChatJoinRequestParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "approveChatJoinRequest";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to decline a chat join request. The bot must be an administrator in the chat
   * for this to work and must have the can_invite_users administrator right. Returns True on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#declinechatjoinrequest>Source</a>
   */
  public Boolean declineChatJoinRequest(DeclineChatJoinRequestParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "declineChatJoinRequest";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set a new profile photo for the chat. Photos can't be changed for private
   * chats. The bot must be an administrator in the chat for this to work and must have the
   * appropriate administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatphoto>Source</a>
   */
  public Boolean setChatPhoto(SetChatPhotoParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatPhoto";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a chat photo. Photos can't be changed for private chats. The bot must
   * be an administrator in the chat for this to work and must have the appropriate administrator
   * rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletechatphoto>Source</a>
   */
  public Boolean deleteChatPhoto(DeleteChatPhotoParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteChatPhoto";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the title of a chat. Titles can't be changed for private chats. The
   * bot must be an administrator in the chat for this to work and must have the appropriate
   * administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchattitle>Source</a>
   */
  public Boolean setChatTitle(SetChatTitleParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatTitle";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the description of a group, a supergroup or a channel. The bot must
   * be an administrator in the chat for this to work and must have the appropriate administrator
   * rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatdescription>Source</a>
   */
  public Boolean setChatDescription(SetChatDescriptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatDescription";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to add a message to the list of pinned messages in a chat. If the chat is not a
   * private chat, the bot must be an administrator in the chat for this to work and must have the
   * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator
   * right in a channel. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#pinchatmessage>Source</a>
   */
  public Boolean pinChatMessage(PinChatMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "pinChatMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to remove a message from the list of pinned messages in a chat. If the chat is
   * not a private chat, the bot must be an administrator in the chat for this to work and must have
   * the 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator
   * right in a channel. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unpinchatmessage>Source</a>
   */
  public Boolean unpinChatMessage(UnpinChatMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unpinChatMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to clear the list of pinned messages in a chat. If the chat is not a private
   * chat, the bot must be an administrator in the chat for this to work and must have the
   * 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator
   * right in a channel. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unpinallchatmessages>Source</a>
   */
  public Boolean unpinAllChatMessages(UnpinAllChatMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unpinAllChatMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method for your bot to leave a group, supergroup or channel. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#leavechat>Source</a>
   */
  public Boolean leaveChat(LeaveChatParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "leaveChat";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get up to date information about the chat. Returns a Chat object on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getchat>Source</a>
   */
  public Chat getChat(GetChatParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getChat";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Chat>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get a list of administrators in a chat, which aren't bots. Returns an Array
   * of ChatMember objects.
   *
   * <p><a href=https://core.telegram.org/bots/api#getchatadministrators>Source</a>
   */
  public List<ChatMember> getChatAdministrators(GetChatAdministratorsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getChatAdministrators";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<ChatMember>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the number of members in a chat. Returns Int on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getchatmembercount>Source</a>
   */
  public Integer getChatMemberCount(GetChatMemberCountParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getChatMemberCount";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Integer>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get information about a member of a chat. The method is only guaranteed to
   * work for other users if the bot is an administrator in the chat. Returns a ChatMember object on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getchatmember>Source</a>
   */
  public ChatMember getChatMember(GetChatMemberParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getChatMember";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ChatMember>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set a new group sticker set for a supergroup. The bot must be an
   * administrator in the chat for this to work and must have the appropriate administrator rights.
   * Use the field can_set_sticker_set optionally returned in getChat requests to check if the bot
   * can use this method. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatstickerset>Source</a>
   */
  public Boolean setChatStickerSet(SetChatStickerSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatStickerSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a group sticker set from a supergroup. The bot must be an
   * administrator in the chat for this to work and must have the appropriate administrator rights.
   * Use the field can_set_sticker_set optionally returned in getChat requests to check if the bot
   * can use this method. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletechatstickerset>Source</a>
   */
  public Boolean deleteChatStickerSet(DeleteChatStickerSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteChatStickerSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get custom emoji stickers, which can be used as a forum topic icon by any
   * user. Requires no parameters. Returns an Array of Sticker objects.
   *
   * <p><a href=https://core.telegram.org/bots/api#getforumtopiciconstickers>Source</a>
   */
  public List<Sticker> getForumTopicIconStickers() {
    final var methodName = "getForumTopicIconStickers";

    final var entity = new StringEntity("", Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<Sticker>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to create a topic in a forum supergroup chat. The bot must be an administrator
   * in the chat for this to work and must have the can_manage_topics administrator rights. Returns
   * information about the created topic as a ForumTopic object.
   *
   * <p><a href=https://core.telegram.org/bots/api#createforumtopic>Source</a>
   */
  public ForumTopic createForumTopic(CreateForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "createForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ForumTopic>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit name and icon of a topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have can_manage_topics administrator
   * rights, unless it is the creator of the topic. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#editforumtopic>Source</a>
   */
  public Boolean editForumTopic(EditForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to close an open topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights, unless it is the creator of the topic. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#closeforumtopic>Source</a>
   */
  public Boolean closeForumTopic(CloseForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "closeForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to reopen a closed topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights, unless it is the creator of the topic. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#reopenforumtopic>Source</a>
   */
  public Boolean reopenForumTopic(ReopenForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "reopenForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a forum topic along with all its messages in a forum supergroup chat.
   * The bot must be an administrator in the chat for this to work and must have the
   * can_delete_messages administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deleteforumtopic>Source</a>
   */
  public Boolean deleteForumTopic(DeleteForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to clear the list of pinned messages in a forum topic. The bot must be an
   * administrator in the chat for this to work and must have the can_pin_messages administrator
   * right in the supergroup. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unpinallforumtopicmessages>Source</a>
   */
  public Boolean unpinAllForumTopicMessages(UnpinAllForumTopicMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unpinAllForumTopicMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit the name of the 'General' topic in a forum supergroup chat. The bot
   * must be an administrator in the chat for this to work and must have can_manage_topics
   * administrator rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#editgeneralforumtopic>Source</a>
   */
  public Boolean editGeneralForumTopic(EditGeneralForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editGeneralForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to close an open 'General' topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#closegeneralforumtopic>Source</a>
   */
  public Boolean closeGeneralForumTopic(CloseGeneralForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "closeGeneralForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to reopen a closed 'General' topic in a forum supergroup chat. The bot must be
   * an administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights. The topic will be automatically unhidden if it was hidden. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#reopengeneralforumtopic>Source</a>
   */
  public Boolean reopenGeneralForumTopic(ReopenGeneralForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "reopenGeneralForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to hide the 'General' topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights. The topic will be automatically closed if it was open. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#hidegeneralforumtopic>Source</a>
   */
  public Boolean hideGeneralForumTopic(HideGeneralForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "hideGeneralForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to unhide the 'General' topic in a forum supergroup chat. The bot must be an
   * administrator in the chat for this to work and must have the can_manage_topics administrator
   * rights. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unhidegeneralforumtopic>Source</a>
   */
  public Boolean unhideGeneralForumTopic(UnhideGeneralForumTopicParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unhideGeneralForumTopic";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to clear the list of pinned messages in a General forum topic. The bot must be
   * an administrator in the chat for this to work and must have the can_pin_messages administrator
   * right in the supergroup. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#unpinallgeneralforumtopicmessages>Source</a>
   */
  public Boolean unpinAllGeneralForumTopicMessages(
      UnpinAllGeneralForumTopicMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "unpinAllGeneralForumTopicMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send answers to callback queries sent from inline keyboards. The answer will
   * be displayed to the user as a notification at the top of the chat screen or as an alert. On
   * success, True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#answercallbackquery>Source</a>
   */
  public Boolean answerCallbackQuery(AnswerCallbackQueryParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "answerCallbackQuery";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the list of boosts added to a chat by a user. Requires administrator
   * rights in the chat. Returns a UserChatBoosts object.
   *
   * <p><a href=https://core.telegram.org/bots/api#getuserchatboosts>Source</a>
   */
  public UserChatBoosts getUserChatBoosts(GetUserChatBoostsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getUserChatBoosts";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<UserChatBoosts>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the list of the bot's commands. See this manual for more details
   * about bot commands. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmycommands>Source</a>
   */
  public Boolean setMyCommands(SetMyCommandsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMyCommands";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete the list of the bot's commands for the given scope and user language.
   * After deletion, higher level commands will be shown to affected users. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletemycommands>Source</a>
   */
  public Boolean deleteMyCommands(DeleteMyCommandsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteMyCommands";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current list of the bot's commands for the given scope and user
   * language. Returns an Array of BotCommand objects. If commands aren't set, an empty list is
   * returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#getmycommands>Source</a>
   */
  public List<BotCommand> getMyCommands(GetMyCommandsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getMyCommands";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<BotCommand>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the bot's name. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmyname>Source</a>
   */
  public Boolean setMyName(SetMyNameParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMyName";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current bot name for the given user language. Returns BotName on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getmyname>Source</a>
   */
  public BotName getMyName(GetMyNameParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getMyName";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<BotName>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the bot's description, which is shown in the chat with the bot if the
   * chat is empty. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmydescription>Source</a>
   */
  public Boolean setMyDescription(SetMyDescriptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMyDescription";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current bot description for the given user language. Returns
   * BotDescription on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getmydescription>Source</a>
   */
  public BotDescription getMyDescription(GetMyDescriptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getMyDescription";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<BotDescription>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the bot's short description, which is shown on the bot's profile page
   * and is sent together with the link when users share the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmyshortdescription>Source</a>
   */
  public Boolean setMyShortDescription(SetMyShortDescriptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMyShortDescription";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current bot short description for the given user language. Returns
   * BotShortDescription on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getmyshortdescription>Source</a>
   */
  public BotShortDescription getMyShortDescription(GetMyShortDescriptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getMyShortDescription";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<BotShortDescription>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the bot's menu button in a private chat, or the default menu button.
   * Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setchatmenubutton>Source</a>
   */
  public Boolean setChatMenuButton(SetChatMenuButtonParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setChatMenuButton";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current value of the bot's menu button in a private chat, or the
   * default menu button. Returns MenuButton on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getchatmenubutton>Source</a>
   */
  public MenuButton getChatMenuButton(GetChatMenuButtonParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getChatMenuButton";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MenuButton>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the default administrator rights requested by the bot when it's added
   * as an administrator to groups or channels. These rights will be suggested to users, but they
   * are free to modify the list before adding the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setmydefaultadministratorrights>Source</a>
   */
  public Boolean setMyDefaultAdministratorRights(SetMyDefaultAdministratorRightsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setMyDefaultAdministratorRights";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get the current default administrator rights of the bot. Returns
   * ChatAdministratorRights on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#getmydefaultadministratorrights>Source</a>
   */
  public ChatAdministratorRights getMyDefaultAdministratorRights(
      GetMyDefaultAdministratorRightsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getMyDefaultAdministratorRights";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<ChatAdministratorRights>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit text and game messages. On success, if the edited message is not an
   * inline message, the edited Message is returned, otherwise True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#editmessagetext>Source</a>
   */
  public MessageOrBoolean editMessageText(EditMessageTextParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editMessageText";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit captions of messages. On success, if the edited message is not an
   * inline message, the edited Message is returned, otherwise True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#editmessagecaption>Source</a>
   */
  public MessageOrBoolean editMessageCaption(EditMessageCaptionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editMessageCaption";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit animation, audio, document, photo, or video messages. If a message is
   * part of a message album, then it can be edited only to an audio for audio albums, only to a
   * document for document albums and to a photo or a video otherwise. When an inline message is
   * edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify
   * a URL. On success, if the edited message is not an inline message, the edited Message is
   * returned, otherwise True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#editmessagemedia>Source</a>
   */
  public MessageOrBoolean editMessageMedia(EditMessageMediaParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editMessageMedia";

    final var entity = buildExtendedMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit live location messages. A location can be edited until its live_period
   * expires or editing is explicitly disabled by a call to stopMessageLiveLocation. On success, if
   * the edited message is not an inline message, the edited Message is returned, otherwise True is
   * returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#editmessagelivelocation>Source</a>
   */
  public MessageOrBoolean editMessageLiveLocation(EditMessageLiveLocationParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editMessageLiveLocation";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to stop updating a live location message before live_period expires. On
   * success, if the message is not an inline message, the edited Message is returned, otherwise
   * True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#stopmessagelivelocation>Source</a>
   */
  public MessageOrBoolean stopMessageLiveLocation(StopMessageLiveLocationParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "stopMessageLiveLocation";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to edit only the reply markup of messages. On success, if the edited message is
   * not an inline message, the edited Message is returned, otherwise True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#editmessagereplymarkup>Source</a>
   */
  public MessageOrBoolean editMessageReplyMarkup(EditMessageReplyMarkupParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "editMessageReplyMarkup";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to stop a poll which was sent by the bot. On success, the stopped Poll is
   * returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#stoppoll>Source</a>
   */
  public Poll stopPoll(StopPollParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "stopPoll";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Poll>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a message, including service messages, with the following
   * limitations:
   *
   * <p>- A message can only be deleted if it was sent less than 48 hours ago.
   *
   * <p>- Service messages about a supergroup, channel, or forum topic creation can't be deleted.
   *
   * <p>- A dice message in a private chat can only be deleted if it was sent more than 24 hours
   * ago.
   *
   * <p>- Bots can delete outgoing messages in private chats, groups, and supergroups.
   *
   * <p>- Bots can delete incoming messages in private chats.
   *
   * <p>- Bots granted can_post_messages permissions can delete outgoing messages in channels.
   *
   * <p>- If the bot is an administrator of a group, it can delete any message there.
   *
   * <p>- If the bot has can_delete_messages permission in a supergroup or a channel, it can delete
   * any message there.
   *
   * <p>Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletemessage>Source</a>
   */
  public Boolean deleteMessage(DeleteMessageParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteMessage";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete multiple messages simultaneously. If some of the specified messages
   * can't be found, they are skipped. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletemessages>Source</a>
   */
  public Boolean deleteMessages(DeleteMessagesParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteMessages";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send static .WEBP, animated .TGS, or video .WEBM stickers. On success, the
   * sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendsticker>Source</a>
   */
  public Message sendSticker(SendStickerParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendSticker";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get a sticker set. On success, a StickerSet object is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#getstickerset>Source</a>
   */
  public StickerSet getStickerSet(GetStickerSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getStickerSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<StickerSet>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get information about custom emoji stickers by their identifiers. Returns an
   * Array of Sticker objects.
   *
   * <p><a href=https://core.telegram.org/bots/api#getcustomemojistickers>Source</a>
   */
  public List<Sticker> getCustomEmojiStickers(GetCustomEmojiStickersParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getCustomEmojiStickers";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<Sticker>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to upload a file with a sticker for later use in the createNewStickerSet and
   * addStickerToSet methods (the file can be used multiple times). Returns the uploaded File on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#uploadstickerfile>Source</a>
   */
  public File uploadStickerFile(UploadStickerFileParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "uploadStickerFile";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<File>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to create a new sticker set owned by a user. The bot will be able to edit the
   * sticker set thus created. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#createnewstickerset>Source</a>
   */
  public Boolean createNewStickerSet(CreateNewStickerSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "createNewStickerSet";

    final var entity = buildExtendedMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to add a new sticker to a set created by the bot. The format of the added
   * sticker must match the format of the other stickers in the set. Emoji sticker sets can have up
   * to 200 stickers. Animated and video sticker sets can have up to 50 stickers. Static sticker
   * sets can have up to 120 stickers. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#addstickertoset>Source</a>
   */
  public Boolean addStickerToSet(AddStickerToSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "addStickerToSet";

    final var entity = buildExtendedMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to move a sticker in a set created by the bot to a specific position. Returns
   * True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickerpositioninset>Source</a>
   */
  public Boolean setStickerPositionInSet(SetStickerPositionInSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerPositionInSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a sticker from a set created by the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletestickerfromset>Source</a>
   */
  public Boolean deleteStickerFromSet(DeleteStickerFromSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteStickerFromSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the list of emoji assigned to a regular or custom emoji sticker. The
   * sticker must belong to a sticker set created by the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickeremojilist>Source</a>
   */
  public Boolean setStickerEmojiList(SetStickerEmojiListParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerEmojiList";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change search keywords assigned to a regular or custom emoji sticker. The
   * sticker must belong to a sticker set created by the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickerkeywords>Source</a>
   */
  public Boolean setStickerKeywords(SetStickerKeywordsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerKeywords";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to change the mask position of a mask sticker. The sticker must belong to a
   * sticker set that was created by the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickermaskposition>Source</a>
   */
  public Boolean setStickerMaskPosition(SetStickerMaskPositionParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerMaskPosition";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set the title of a created sticker set. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickersettitle>Source</a>
   */
  public Boolean setStickerSetTitle(SetStickerSetTitleParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerSetTitle";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set the thumbnail of a regular or mask sticker set. The format of the
   * thumbnail file must match the format of the stickers in the set. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setstickersetthumbnail>Source</a>
   */
  public Boolean setStickerSetThumbnail(SetStickerSetThumbnailParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setStickerSetThumbnail";

    final var entity = buildMultipartEntity(params);
    var response = makeMultipartFormRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set the thumbnail of a custom emoji sticker set. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#setcustomemojistickersetthumbnail>Source</a>
   */
  public Boolean setCustomEmojiStickerSetThumbnail(
      SetCustomEmojiStickerSetThumbnailParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setCustomEmojiStickerSetThumbnail";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to delete a sticker set that was created by the bot. Returns True on success.
   *
   * <p><a href=https://core.telegram.org/bots/api#deletestickerset>Source</a>
   */
  public Boolean deleteStickerSet(DeleteStickerSetParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "deleteStickerSet";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send answers to an inline query. On success, True is returned.
   *
   * <p>No more than 50 results per query are allowed.
   *
   * <p><a href=https://core.telegram.org/bots/api#answerinlinequery>Source</a>
   */
  public Boolean answerInlineQuery(AnswerInlineQueryParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "answerInlineQuery";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set the result of an interaction with a Web App and send a corresponding
   * message on behalf of the user to the chat from which the query originated. On success, a
   * SentWebAppMessage object is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#answerwebappquery>Source</a>
   */
  public SentWebAppMessage answerWebAppQuery(AnswerWebAppQueryParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "answerWebAppQuery";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<SentWebAppMessage>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send invoices. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendinvoice>Source</a>
   */
  public Message sendInvoice(SendInvoiceParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendInvoice";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to create a link for an invoice. Returns the created invoice link as String on
   * success.
   *
   * <p><a href=https://core.telegram.org/bots/api#createinvoicelink>Source</a>
   */
  public String createInvoiceLink(CreateInvoiceLinkParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "createInvoiceLink";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<String>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * If you sent an invoice requesting a shipping address and the parameter is_flexible was
   * specified, the Bot API will send an Update with a shipping_query field to the bot. Use this
   * method to reply to shipping queries. On success, True is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#answershippingquery>Source</a>
   */
  public Boolean answerShippingQuery(AnswerShippingQueryParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "answerShippingQuery";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Once the user has confirmed their payment and shipping details, the Bot API sends the final
   * confirmation in the form of an Update with the field pre_checkout_query. Use this method to
   * respond to such pre-checkout queries. On success, True is returned. Note: The Bot API must
   * receive an answer within 10 seconds after the pre-checkout query was sent.
   *
   * <p><a href=https://core.telegram.org/bots/api#answerprecheckoutquery>Source</a>
   */
  public Boolean answerPreCheckoutQuery(AnswerPreCheckoutQueryParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "answerPreCheckoutQuery";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Informs a user that some of the Telegram Passport elements they provided contains errors. The
   * user will not be able to re-submit their Passport to you until the errors are fixed (the
   * contents of the field for which you returned the error must change). Returns True on success.
   *
   * <p>Use this if the data submitted by the user doesn't satisfy the standards your service
   * requires for any reason. For example, if a birthday date seems invalid, a submitted document is
   * blurry, a scan shows evidence of tampering, etc. Supply some details in the error message to
   * make sure the user knows how to correct the issues.
   *
   * <p><a href=https://core.telegram.org/bots/api#setpassportdataerrors>Source</a>
   */
  public Boolean setPassportDataErrors(SetPassportDataErrorsParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setPassportDataErrors";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Boolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to send a game. On success, the sent Message is returned.
   *
   * <p><a href=https://core.telegram.org/bots/api#sendgame>Source</a>
   */
  public Message sendGame(SendGameParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "sendGame";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<Message>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to set the score of the specified user in a game message. On success, if the
   * message is not an inline message, the Message is returned, otherwise True is returned. Returns
   * an error, if the new score is not greater than the user's current score in the chat and force
   * is False.
   *
   * <p><a href=https://core.telegram.org/bots/api#setgamescore>Source</a>
   */
  public MessageOrBoolean setGameScore(SetGameScoreParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "setGameScore";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<MessageOrBoolean>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  /**
   * Use this method to get data for high score tables. Will return the score of the specified user
   * and several of their neighbors in a game. Returns an Array of GameHighScore objects.
   *
   * <p><a href=https://core.telegram.org/bots/api#getgamehighscores>Source</a>
   */
  public List<GameHighScore> getGameHighScores(GetGameHighScoresParameters params) {
    TypeVerifier.verify(params);

    final var methodName = "getGameHighScores";

    final var entity = new StringEntity(gson.toJson(params), Charset.forName("UTF-8"));
    var response = makeRequest(methodName, entity);

    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<GameHighScore>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));

    return gson.fromJson(jsonElement, type);
  }

  private Response makeRequest(String methodName, StringEntity paramsAsEntity) {
    HttpPost request = new HttpPost(getUri(methodName));
    request.setEntity(paramsAsEntity);
    request.setHeader("Accept", "application/json");
    request.setHeader("Content-Type", "application/json");

    try (CloseableHttpClient client = HttpClients.createDefault()) {
      HttpResponse httpResponse = client.execute(request);
      return gson.fromJson(
          new String(httpResponse.getEntity().getContent().readAllBytes()), Response.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private Response makeMultipartFormRequest(String methodName, HttpEntity paramsAsEntity) {
    HttpPost request = new HttpPost(getUri(methodName));
    request.setEntity(paramsAsEntity);

    try (CloseableHttpClient client = HttpClients.createDefault()) {
      HttpResponse httpResponse = client.execute(request);
      return gson.fromJson(
          new String(httpResponse.getEntity().getContent().readAllBytes()), Response.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private HttpEntity buildMultipartEntity(Object params) {
    final var type = params.getClass();
    final var fields = type.getDeclaredFields();
    final var form = MultipartEntityBuilder.create();

    for (final var field : fields) {
      var name = field.getName();
      if (field.isAnnotationPresent(SerializedName.class)) {
        var annotation = field.getAnnotation(SerializedName.class);
        name = annotation.value();
      }

      Object data = null;
      try {
        data = field.get(params);
      } catch (IllegalAccessException e) {
        throw new RuntimeException("Fields in Parameters type must be public!");
      }

      if (data instanceof InputFile inputFile) {
        switch (inputFile.type()) {
          case FILE_ID -> form.addTextBody(name, inputFile.fileId());
          case BYTES -> form.addBinaryBody(name, inputFile.bytes());
          case FILE -> form.addBinaryBody(name, inputFile.file());
        }
      } else {
        form.addTextBody(name, gson.toJson(data), ContentType.APPLICATION_JSON);
      }
    }

    return form.build();
  }

  private HttpEntity buildExtendedMultipartEntity(Object params) {
    final var type = params.getClass();
    final var fields = type.getDeclaredFields();
    final var form = MultipartEntityBuilder.create();
    final var inputFiles = new LinkedList<InputFile>();

    for (final var field : fields) {
      var name = field.getName();
      if (field.isAnnotationPresent(SerializedName.class)) {
        var annotation = field.getAnnotation(SerializedName.class);
        name = annotation.value();
      }

      Object data = null;
      try {
        data = field.get(params);
      } catch (IllegalAccessException e) {
        throw new RuntimeException("Fields in Parameters type must be public!");
      }

      // This code is valid, even when type contains InputFile type, because serializer puts file
      // attachment name or file_id and I can get it, when needs.
      form.addTextBody(name, gson.toJson(data), ContentType.APPLICATION_JSON);
      getAllInputFiles(field, params, inputFiles);
    }

    for (var inputFile : inputFiles) {
      switch (inputFile.type()) {
        case FILE_ID -> {
          /* Do nothing */
        }
        case BYTES -> form.addBinaryBody(inputFile.attachmentName(), inputFile.bytes());
        case FILE -> form.addBinaryBody(inputFile.attachmentName(), inputFile.file());
      }
    }

    return form.build();
  }

  private void getAllInputFiles(Field field, Object object, List<InputFile> inputFiles) {
    final var type = field.getType();
    if (DEFAULT_TYPES.contains(type) || SPECIFIC_TYPES.contains(type)) {
      return;
    }
    Consumer<Object> findRecursive =
        (otherObject) -> {
          for (var otherField : otherObject.getClass().getDeclaredFields()) {
            getAllInputFiles(otherField, otherObject, inputFiles);
          }
        };

    Object data = null;
    try {
      data = field.get(object);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("Fields in Parameters type must be public!");
    }
    if (data == null) {
      return;
    }

    if (data instanceof List list) {
      for (var otherObject : list) {
        findRecursive.accept(otherObject);
      }
      return;
    }

    if (data instanceof InputFile inputFile) {
      inputFiles.add(inputFile);
      return;
    }

    findRecursive.accept(data);
  }

  private void raiseRuntimeException(Response response) {
    throw new RuntimeException(
        response.getDescription().isPresent()
            ? response.getDescription().orElseThrow()
            : String.valueOf(response.getErrorCode().orElseThrow()));
  }

  private URI getUri(String methodName) {
    return URI.create(String.format(urlTemplate, botToken, methodName));
  }
}

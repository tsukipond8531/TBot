package jarkz.tbot.core;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jarkz.tbot.core.parameters.GetUpdatesParameters;
import jarkz.tbot.types.Update;
import jarkz.tbot.types.User;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
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
 * String token = "your_token";
 * BotApi api = new BotApi(token);
 * {@link Update}[] updates = api.getUpdates(GetUpdatesParameters.DEFAULT);
 * </code></pre>
 *
 * @author Pavel Bialiauski
 */
public class BotApi {

  private static final Gson gson;

  static {
    gson = registerAllAdapters();
  }

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
        .create();
  }

  private final String botToken;

  private final String urlTemplate = "https://api.telegram.org/bot%s/%s";

  public BotApi(String botToken) {
    this.botToken = botToken;
  }

  /**
   * Use this method to receive incoming updates using long polling (<a
   * href="https://en.wikipedia.org/wiki/Push_technology#Long_polling">wiki</a>). Returns an list of
   * Update objects.
   *
   * <p><strong>Notes:</strong>
   *
   * <ol>
   *   <li>This method will not work if an outgoing webhook is set up.
   *   <li>In order to avoid getting duplicate updates, recalculate <i>offset</i> after each server
   *       response.
   * </ol>
   *
   * @param parameters the parameters of method <a
   *     href="https://core.telegram.org/bots/api#getUpdates">getUpdates</a> as {@link
   *     GetUpdatesParameters}.
   * @return a list of Updates.
   */
  public List<Update> getUpdates(GetUpdatesParameters parameters) {
    final String methodName = "getUpdates";
    StringEntity paramsAsEntity =
        new StringEntity(gson.toJson(parameters), Charset.forName("UTF-8"));

    Response response = makeRequest(methodName, paramsAsEntity);
    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var type = new TypeToken<List<Update>>() {}.getType();
    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));
    return gson.fromJson(jsonElement, type);
  }

  /**
   * A simple method for testing your bot's authentication token. Requires no parameters. Returns
   * basic information about the bot in form of a User object.
   *
   * @return the bot as {@link User}
   */
  public User getMe() {
    final String methodName = "getMe";

    var response = makeRequest(methodName, new StringEntity("", Charset.forName("UTF-8")));
    if (!response.isOk()) {
      raiseRuntimeException(response);
    }

    var jsonElement =
        response.getResult().orElseThrow(() -> new RuntimeException("Invalid result of response."));
    return gson.fromJson(jsonElement, User.class);
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

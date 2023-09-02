package jarkz.tbot.core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import jarkz.tbot.core.parameters.GetUpdatesParameters;
import jarkz.tbot.types.Update;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class BotApi {

  private final String botToken;
  private final String urlTemplate = "https://api.telegram.org/bot%s/%s";

  public BotApi(String botToken) {
    this.botToken = botToken;
  }

  public List<Update> getUpdates(GetUpdatesParameters parameters) {
    final String methodName = "getUpdates";
    Gson gson = getGson();
    StringEntity paramsAsEntity =
        new StringEntity(gson.toJson(parameters), Charset.forName("UTF-8"));

    Response response = makeRequest(methodName, paramsAsEntity, gson);
    if (!response.isOk()) {
      throw new RuntimeException(
          response.getDescription().isPresent()
              ? response.getDescription().orElseThrow()
              : String.valueOf(response.getErrorCode().orElseThrow()));
    }

    List<Update> updates = new LinkedList<>();
    for (JsonElement element :
        response
            .getResult()
            .orElseThrow(() -> new RuntimeException("Invalid result of response."))
            .getAsJsonArray()) {
      updates.add(gson.fromJson(element, Update.class));
    }
    return updates;
  }

  private Response makeRequest(String methodName, StringEntity paramsAsEntity, Gson gson) {
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

  private URI getUri(String methodName) {
    return URI.create(String.format(urlTemplate, botToken, methodName));
  }

  private Gson getGson() {
    Gson gson =
        new GsonBuilder()
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
    return gson;
  }
}

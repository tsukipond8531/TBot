package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.MenuButton;
import jarkz.tbot.types.MenuButtonCommands;
import jarkz.tbot.types.MenuButtonDefault;
import jarkz.tbot.types.MenuButtonWebApp;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link MenuButton}.
 *
 * @author Pavel Bialiauski
 */
public class MenuButtonDeserializer implements JsonDeserializer<MenuButton> {

  private final String MENU_BUTTON_KEY = "type";

  @Override
  public MenuButton deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();

    JsonElement element = jsonObject.get(MENU_BUTTON_KEY);
    if (element == null) {
      throw new JsonNotFoundKey(
          String.format(
              "Not found the key \"%s\" in %s.", MENU_BUTTON_KEY, MenuButton.class.getName()));
    }
    String value = element.getAsString();

    Class<? extends MenuButton> clazz = null;
    switch (value) {
      case "commands" -> clazz = MenuButtonCommands.class;
      case "web_app" -> clazz = MenuButtonWebApp.class;
      case "default" -> clazz = MenuButtonDefault.class;
      default -> throw new JsonTypeNotDefined(
          String.format(
              "Given \"%s\" in %s is not defined.", MENU_BUTTON_KEY, MenuButton.class.getName()));
    }
    return context.deserialize(json, clazz);
  }
}

package jarkz.tbot.types.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import jarkz.tbot.types.menubutton.DeserializerProxy;
import jarkz.tbot.types.menubutton.MenuButton;
import java.lang.reflect.Type;

/**
 * The JSON deserializer for general interface {@link MenuButton}.
 *
 * @author Pavel Bialiauski
 */
public class MenuButtonDeserializer implements JsonDeserializer<MenuButton> {

  @Override
  public MenuButton deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    Class<? extends MenuButton> clazz = DeserializerProxy.getMenuButtonClass(jsonObject);
    return context.deserialize(json, clazz);
  }
}

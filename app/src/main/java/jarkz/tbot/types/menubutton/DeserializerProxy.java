package jarkz.tbot.types.menubutton;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import jarkz.tbot.types.annotations.Deserializer;
import jarkz.tbot.types.deserializers.JsonNotFoundKey;
import jarkz.tbot.types.deserializers.JsonTypeNotDefined;

@Deserializer
public class DeserializerProxy {

	private static final String MENU_BUTTON_KEY = "type";

	public static Class<? extends MenuButton> getMenuButtonClass(JsonObject jsonObject) {

		JsonElement element = jsonObject.get(MENU_BUTTON_KEY);
		if (element == null) {
			throw new JsonNotFoundKey(
					String.format("Not found the key \"%s\" in %s.", MENU_BUTTON_KEY, MenuButton.class.getName()));
		}
		String value = element.getAsString();

		Class<? extends MenuButton> clazz = null;
		switch (value) {
			case MenuButtonCommands.TYPE -> clazz = MenuButtonCommands.class;
			case MenuButtonWebApp.TYPE -> clazz = MenuButtonWebApp.class;
			case MenuButtonDefault.TYPE -> clazz = MenuButtonDefault.class;
			default -> throw new JsonTypeNotDefined(
					String.format("Given \"%s\" in %s is not defined.", MENU_BUTTON_KEY, MenuButton.class.getName()));
		}
		return clazz;
	}
}

package jarkz.tbot.types.deserializers;

public class JsonNotFoundKey extends NullPointerException {

	public JsonNotFoundKey(String message) {
		super(message);
	}
}

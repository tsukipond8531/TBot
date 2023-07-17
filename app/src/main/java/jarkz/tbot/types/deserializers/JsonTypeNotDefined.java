package jarkz.tbot.types.deserializers;

public class JsonTypeNotDefined extends IllegalStateException {

	public JsonTypeNotDefined(String message) {
		super(message);
	}

	public JsonTypeNotDefined(Throwable cause) {
		super(cause);
	}

	public JsonTypeNotDefined(String message, Throwable cause) {
		super(message, cause);
	}
}

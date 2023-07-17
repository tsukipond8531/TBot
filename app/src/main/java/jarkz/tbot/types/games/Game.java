package jarkz.tbot.types.games;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.MessageEntity;
import jarkz.tbot.types.document.Animation;
import jarkz.tbot.types.document.PhotoSize;

public class Game {

	@NotNull
	private String title;

	@NotNull
	private String description;

	@NotNull
	private List<PhotoSize> photo;

	private String text;

	@SerializedName("text_entities")
	private List<MessageEntity> textEntities;

	private Animation animation;

	public Game() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PhotoSize> getPhoto() {
		return photo;
	}

	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	public Optional<String> getText() {
		return Optional.of(text);
	}

	public void setText(String text) {
		this.text = text;
	}

	public Optional<List<MessageEntity>> getTextEntities() {
		return Optional.of(textEntities);
	}

	public void setTextEntities(List<MessageEntity> textEntities) {
		this.textEntities = textEntities;
	}

	public Optional<Animation> getAnimation() {
		return Optional.of(animation);
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, description, photo, text, textEntities, animation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Game other))
			return false;
		return Objects.equals(title, other.title)
				&& Objects.equals(description, other.description)
				&& Objects.equals(photo, other.photo)
				&& Objects.equals(text, other.text)
				&& Objects.equals(textEntities, other.textEntities)
				&& Objects.equals(animation, other.animation);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Game[title=").append(title)
				.append(", description=").append(description)
				.append(", photo=").append(photo)
				.append(", text=").append(text)
				.append(", textEntities=").append(textEntities)
				.append(", animation=").append(animation).append("]");
		return builder.toString();
	}
}

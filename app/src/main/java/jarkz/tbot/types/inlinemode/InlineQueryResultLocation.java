package jarkz.tbot.types.inlinemode;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class InlineQueryResultLocation implements InlineQueryResult {

	protected static final String TYPE = "locatioin";

	private final String type = InlineQueryResultLocation.TYPE;

	@NotNull
	private String id;

	@NotNull
	private float latitude;

	@NotNull
	private float longitude;

	@NotNull
	private String title;

	@SerializedName("horizontal_accuracy")
	private Float horizontalAccuracy;

	@SerializedName("live_period")
	private Integer livePeriod;

	private Integer heading;

	@SerializedName("proximity_alert_radius")
	private Integer proximityAlertRadius;

	@SerializedName("reply_markup")
	private InlineKeyboardMarkup replyMarkup;

	@SerializedName("input_message_content")
	private InputMessageContent inputMessageContent;

	@SerializedName("thumbnail_url")
	private String thumbnailUrl;

	@SerializedName("thumbnail_width")
	private Integer thumbnailWidth;

	@SerializedName("thumbnail_height")
	private Integer thumbnailHeight;

	public InlineQueryResultLocation() {
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Optional<Float> getHorizontalAccuracy() {
		return Optional.of(horizontalAccuracy);
	}

	public void setHorizontalAccuracy(Float horizontalAccuracy) {
		this.horizontalAccuracy = horizontalAccuracy;
	}

	public Optional<Integer> getLivePeriod() {
		return Optional.of(livePeriod);
	}

	public void setLivePeriod(Integer livePeriod) {
		this.livePeriod = livePeriod;
	}

	public Optional<Integer> getHeading() {
		return Optional.of(heading);
	}

	public void setHeading(Integer heading) {
		this.heading = heading;
	}

	public Optional<Integer> getProximityAlertRadius() {
		return Optional.of(proximityAlertRadius);
	}

	public void setProximityAlertRadius(Integer proximityAlertRadius) {
		this.proximityAlertRadius = proximityAlertRadius;
	}

	public Optional<InlineKeyboardMarkup> getReplyMarkup() {
		return Optional.of(replyMarkup);
	}

	public void setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

	public Optional<InputMessageContent> getInputMessageContent() {
		return Optional.of(inputMessageContent);
	}

	public void setInputMessageContent(InputMessageContent inputMessageContent) {
		this.inputMessageContent = inputMessageContent;
	}

	public Optional<String> getThumbnailUrl() {
		return Optional.of(thumbnailUrl);
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public Optional<Integer> getThumbnailWidth() {
		return Optional.of(thumbnailWidth);
	}

	public void setThumbnailWidth(Integer thumbnailWidth) {
		this.thumbnailWidth = thumbnailWidth;
	}

	public Optional<Integer> getThumbnailHeight() {
		return Optional.of(thumbnailHeight);
	}

	public void setThumbnailHeight(Integer thumbnailHeight) {
		this.thumbnailHeight = thumbnailHeight;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(type,
				id,
				latitude,
				longitude,
				title,
				horizontalAccuracy,
				livePeriod,
				heading,
				proximityAlertRadius,
				replyMarkup,
				inputMessageContent,
				thumbnailUrl,
				thumbnailWidth,
				thumbnailHeight);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InlineQueryResultLocation other))
			return false;
		return Objects.equals(type, other.type)
				&& Objects.equals(id, other.id)
				&& Objects.equals(latitude, other.latitude)
				&& Objects.equals(longitude, other.longitude)
				&& Objects.equals(title, other.title)
				&& Objects.equals(horizontalAccuracy, other.horizontalAccuracy)
				&& Objects.equals(livePeriod, other.livePeriod)
				&& Objects.equals(heading, other.heading)
				&& Objects.equals(proximityAlertRadius, other.proximityAlertRadius)
				&& Objects.equals(replyMarkup, other.replyMarkup)
				&& Objects.equals(inputMessageContent, other.inputMessageContent)
				&& Objects.equals(thumbnailUrl, other.thumbnailUrl)
				&& Objects.equals(thumbnailWidth, other.thumbnailWidth)
				&& Objects.equals(thumbnailHeight, other.thumbnailHeight);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InlineQueryResultLocation[type=").append(type)
				.append(", id=").append(id)
				.append(", latitude=").append(latitude)
				.append(", longitude=").append(longitude)
				.append(", title=").append(title)
				.append(", horizontalAccuracy=").append(horizontalAccuracy)
				.append(", livePeriod=").append(livePeriod)
				.append(", heading=").append(heading)
				.append(", proximityAlertRadius=").append(proximityAlertRadius)
				.append(", replyMarkup=").append(replyMarkup)
				.append(", inputMessageContent=").append(inputMessageContent)
				.append(", thumbnailUrl=").append(thumbnailUrl)
				.append(", thumbnailWidth=").append(thumbnailWidth)
				.append(", thumbnailHeight=").append(thumbnailHeight).append("]");
		return builder.toString();
	}
}

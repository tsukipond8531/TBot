package jarkz.tbot.types;

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.document.PhotoSize;

public class UserProfilePhotos {

	@SerializedName("total_count")
	@NotNull
	private int totalCount;

	@NotNull
	private List<List<PhotoSize>> photos;

	public UserProfilePhotos() {
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<List<PhotoSize>> getPhotos() {
		return photos;
	}

	public void setPhotos(List<List<PhotoSize>> photos) {
		this.photos = photos;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(totalCount, photos);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserProfilePhotos other))
			return false;
		return totalCount == other.totalCount && Objects.equals(photos, other.photos);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserProfilePhotos[totalCount=").append(totalCount)
				.append(", photos=").append(photos).append("]");
		return builder.toString();
	}
}

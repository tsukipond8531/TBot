package jarkz.tbot.types.chat;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class ChatPhoto {

	@SerializedName("small_file_id")
	@NotNull
	private String smallFileId;

	@SerializedName("small_file_unique_id")
	@NotNull
	private String smallFileUniqueId;

	@SerializedName("big_file_id")
	@NotNull
	private String bigFileId;

	@SerializedName("big_file_unique_id")
	@NotNull
	private String bigFileUniqueId;

	public ChatPhoto() {
	}

	public String getSmallFileId() {
		return smallFileId;
	}

	public void setSmallFileId(String smallFileId) {
		this.smallFileId = smallFileId;
	}

	public String getSmallFileUniqueId() {
		return smallFileUniqueId;
	}

	public void setSmallFileUniqueId(String smallFileUniqueId) {
		this.smallFileUniqueId = smallFileUniqueId;
	}

	public String getBigFileId() {
		return bigFileId;
	}

	public void setBigFileId(String bigFileId) {
		this.bigFileId = bigFileId;
	}

	public String getBigFileUniqueId() {
		return bigFileUniqueId;
	}

	public void setBigFileUniqueId(String bigFileUniqueId) {
		this.bigFileUniqueId = bigFileUniqueId;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(smallFileId, smallFileUniqueId, bigFileId, bigFileUniqueId);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ChatPhoto other))
			return false;
		return Objects.equals(smallFileId, other.smallFileId)
				&& Objects.equals(smallFileUniqueId, other.smallFileUniqueId)
				&& Objects.equals(bigFileId, other.bigFileId)
				&& Objects.equals(bigFileUniqueId, other.bigFileUniqueId);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatPhoto[smallFileId=").append(smallFileId)
				.append(", smallFileUniqueId=").append(smallFileUniqueId)
				.append(", bigFileId=").append(bigFileId)
				.append(", bigFileUniqueId=").append(bigFileUniqueId).append("]");
		return builder.toString();
	}
}

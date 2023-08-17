package jarkz.tbot.types.document;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class Audio {

	@SerializedName("file_id")
	@NotNull
	private String fileId;

	@SerializedName("file_unique_id")
	@NotNull
	private String fileUniqueId;

	@NotNull
	private int duration;

	private String performer;

	private String title;

	@SerializedName("file_name")
	private String fileName;

	@SerializedName("mime_type")
	private String mimeType;

	@SerializedName("file_size")
	private Long fileSize;

	public Audio() {
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUniqueId() {
		return fileUniqueId;
	}

	public void setFileUniqueId(String fileUniqueId) {
		this.fileUniqueId = fileUniqueId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Optional<String> getPerformer() {
		return Optional.of(performer);
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public Optional<String> getTitle() {
		return Optional.of(title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Optional<String> getFileName() {
		return Optional.of(fileName);
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Optional<String> getMimeType() {
		return Optional.of(mimeType);
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Optional<Long> getFileSize() {
		return Optional.of(fileSize);
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	final public int hashCode() {
		return Objects.hash(fileId, fileUniqueId, duration, performer, title, fileName, mimeType, fileSize);
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Audio other))
			return false;
		return Objects.equals(fileId, other.fileId)
				&& Objects.equals(fileUniqueId, other.fileUniqueId)
				&& duration == other.duration
				&& Objects.equals(performer, other.performer)
				&& Objects.equals(title, other.title)
				&& Objects.equals(fileName, other.fileName)
				&& Objects.equals(mimeType, other.mimeType)
				&& Objects.equals(fileSize, other.fileSize);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Audio[fileId=").append(fileId)
				.append(", fileUniqueId=").append(fileUniqueId)
				.append(", duration=").append(duration)
				.append(", performer=").append(performer)
				.append(", title=").append(title)
				.append(", fileName=").append(fileName)
				.append(", mimeType=").append(mimeType)
				.append(", fileSize=").append(fileSize).append("]");
		return builder.toString();
	}
}

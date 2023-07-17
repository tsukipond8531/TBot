package jarkz.tbot.types.document;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class Document {

	@SerializedName("file_id")
	@NotNull
	private String fileId;

	@SerializedName("file_unique_id")
	@NotNull
	private String fileUniqueId;

	private PhotoSize thumbnail;

	@SerializedName("file_name")
	private String fileName;

	@SerializedName("mime_type")
	private String mimeType;

	@SerializedName("file_size")
	private Long fileSize;

	public Document() {
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

	public Optional<PhotoSize> getThumbnail() {
		return Optional.of(thumbnail);
	}

	public void setThumbnail(PhotoSize thumbnail) {
		this.thumbnail = thumbnail;
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
	public int hashCode() {
		return Objects.hash(fileId, fileUniqueId, thumbnail, fileName, mimeType, fileSize);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Document other))
			return false;
		return Objects.equals(fileId, other.fileId)
				&& Objects.equals(fileUniqueId, other.fileUniqueId)
				&& Objects.equals(thumbnail, other.thumbnail)
				&& Objects.equals(fileName, other.fileName)
				&& Objects.equals(mimeType, other.mimeType)
				&& Objects.equals(fileSize, other.fileSize);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document[fileId=").append(fileId)
				.append(", fileUniqueId=").append(fileUniqueId)
				.append(", thumbnail=").append(thumbnail)
				.append(", fileName=").append(fileName)
				.append(", mimeType=").append(mimeType)
				.append(", fileSize=").append(fileSize).append("]");
		return builder.toString();
	}
}

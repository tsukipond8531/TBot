package jarkz.tbot.types;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class InputFile {

	private byte[] data;

  //It is not necessary, but I'll follow the contract
  @SerializedName("file_attach_name")
	private String fileAttachName;

	public InputFile() {
	}

	public InputFile(byte[] data) {
		this.data = data;
	}

	public InputFile(String fileAttachName) {
		setFileAttachName(fileAttachName);
	}

	public Optional<byte[]> getData() {
		return Optional.of(data);
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Optional<String> getFileAttachName() {
		return Optional.of(fileAttachName);
	}

	public void setFileAttachName(String fileAttachName) {
		String prefix = "attach://";
		if (!fileAttachName.startsWith(prefix)) {
			fileAttachName = prefix + fileAttachName;
		}
		this.fileAttachName = fileAttachName;
	}

	@Override
	final public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		result = prime * result + Objects.hash(fileAttachName);
		return result;
	}

	@Override
	final public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InputFile other))
			return false;
		return Arrays.equals(data, other.data) && Objects.equals(fileAttachName, other.fileAttachName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputFile[data=").append(Arrays.toString(data))
				.append(", fileAttachName=").append(fileAttachName).append("]");
		return builder.toString();
	}
}

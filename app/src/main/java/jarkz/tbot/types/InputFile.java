package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * This object represents the contents of a file to be uploaded. Must be posted using
 * multipart/form-data in the usual way that files are uploaded via the browser.
 *
 * <p>InputFile can accept only one parameter of both:<br>
 * 1. data as byte[];<br>
 * 2. fileAttachName as String;<br>
 * If you provide both, framework will use only data as byte[].
 *
 * @author Pavel Bialiauski
 */
public class InputFile {

  private byte[] data;

  // It is not necessary, but I'll follow the contract
  @SerializedName("file_attach_name")
  private String fileAttachName;

  /** Default constructor. */
  public InputFile() {}

  /**
   * Creates InputFile with data.
   *
   * @param data the file as byte array.
   */
  public InputFile(byte[] data) {
    this.data = data;
  }

  /**
   * Creates InputFile with file_attach_name.
   *
   * @param fileAttachName the reference to cached file on Telegram's server.
   */
  public InputFile(String fileAttachName) {
    setFileAttachName(fileAttachName);
  }

  /**
   * A data of file in byte array.
   *
   * @return the data of file.
   */
  public Optional<byte[]> getData() {
    return Optional.of(data);
  }

  /**
   * Sets the data of file in bytes.
   *
   * @param data the data of file in bytes.
   */
  public void setData(byte[] data) {
    this.data = data;
  }

  /**
   * A file attach name with the preifx "attach://".
   *
   * @return a file attach name.
   */
  public Optional<String> getFileAttachName() {
    return Optional.of(fileAttachName);
  }

  /**
   * Sets the file attach name, which starts with "attach://" prefix. If you don't provide prefix,
   * method will authomatic set it.
   *
   * @param fileAttachName the file attach name, with or without the prefix "attach://", as String.
   */
  public void setFileAttachName(String fileAttachName) {
    String prefix = "attach://";
    if (!fileAttachName.startsWith(prefix)) {
      fileAttachName = prefix + fileAttachName;
    }
    this.fileAttachName = fileAttachName;
  }

  @Override
  public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(data);
    result = prime * result + Objects.hash(fileAttachName);
    return result;
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputFile other)) return false;
    return Arrays.equals(data, other.data) && Objects.equals(fileAttachName, other.fileAttachName);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputFile[data=")
        .append(Arrays.toString(data))
        .append(", fileAttachName=")
        .append(fileAttachName)
        .append("]");
    return builder.toString();
  }
}

package jarkz.tbot.types;

import java.util.Arrays;
import java.util.Objects;
import java.io.File;

/**
 * This object represents the contents of a file to be uploaded. Must be posted using
 * multipart/form-data in the usual way that files are uploaded via the browser.
 */
public final class InputFile {

  public enum Type {
    FILE,
    BYTES,
    FILE_ID
  }

  private File file;
  private byte[] bytes;
  private String attachmentName;

  private String fileId;

  private String name;
  private String mimeType;
  private Type type;

  public InputFile(File file, String name, String contentType) {
    this.file = file;
    this.name = name;
    this.mimeType = contentType;
    type = Type.FILE;
  }

  public InputFile(byte[] bytes, String name, String contentType) {
    this.bytes = bytes;
    this.name = name;
    this.mimeType = contentType;
    type = Type.BYTES;
  }

  public InputFile(String fileId) {
    this.fileId = fileId;
    type = Type.FILE_ID;
  }

  public File file() {
    return file;
  }

  public byte[] bytes() {
    return bytes;
  }

  public String attachmentName() {
    return attachmentName;
  }

  public String randomAttachmentName() {
    // attachmentName
    throw new UnsupportedOperationException("Unimplemented method");
  }

  /**
   * The attachment name, which uses to puth attach://<attachmentName>.
   *
   * DO NOT USE "attach://", SERIALIZER AUTHOMATICALLY PUTS IT!
   */
  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }

  public String fileId() {
    return fileId;
  }

  public Type type() {
    return type;
  }

  public String contentType() {
    return mimeType;
  }

  public void setMimeType(String contentType) {
    this.mimeType = contentType;
  }

  public String name() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(bytes);
    result = prime * result + Objects.hash(file, name, mimeType);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputFile)) return false;
    InputFile other = (InputFile) obj;
    return Objects.equals(file, other.file)
        && Arrays.equals(bytes, other.bytes)
        && Objects.equals(name, other.name)
        && Objects.equals(mimeType, other.mimeType);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputFile[file=")
        .append(file)
        .append(", bytes=")
        .append(Arrays.toString(bytes))
        .append(", name=")
        .append(name)
        .append(", contentType=")
        .append(mimeType)
        .append("]");
    return builder.toString();
  }
}

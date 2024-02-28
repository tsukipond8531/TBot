package jarkz.tbot.types;

import java.util.Arrays;
import java.util.Objects;

/**
 * This object represents the contents of a file to be uploaded. Must be posted using
 * multipart/form-data in the usual way that files are uploaded via the browser.
 */
public final class InputFile {

  private File file;
  private byte[] bytes;
  private String name;
  private String contentType;

  public InputFile(File file, String name, String contentType) {
    this.file = file;
    this.name = name;
    this.contentType = contentType;
  }

  public InputFile(byte[] bytes, String name, String contentType) {
    this.bytes = bytes;
    this.name = name;
    this.contentType = contentType;
  }

  public File file() {
    return file;
  }

  public byte[] bytes() {
    return bytes;
  }

  public String contentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
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
    result = prime * result + Objects.hash(file, name, contentType);
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
        && Objects.equals(contentType, other.contentType);
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
        .append(contentType)
        .append("]");
    return builder.toString();
  }
}

package jarkz.tbot.types;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

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

  private Type type;

  private record Range(int start, int end) {
    public char random(ThreadLocalRandom rng) {
      return (char) rng.nextInt(this.start, this.end + 1);
    }
  }

  private static final int MAX_NAME_LENGTH = 20;
  private static final Range[] RANGES = {
    new Range((int) 'a', (int) 'z'),
    new Range((int) 'A', (int) 'Z'),
    new Range((int) '0', (int) '9'),
  };

  public InputFile(File file) {
    this.file = file;
    type = Type.FILE;
  }

  public InputFile(byte[] bytes) {
    this.bytes = bytes;
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
    final var builder = new StringBuilder();
    final var rng = ThreadLocalRandom.current();
    final int lowercaseLetterRange = 0;

    var index = lowercaseLetterRange;

    while (builder.length() <= MAX_NAME_LENGTH) {
      var nextChar = RANGES[index].random(rng);
      builder.append(nextChar);
      index = rng.nextInt(RANGES.length);
    }

    attachmentName = builder.toString();
    return attachmentName;
  }

  /**
   * The attachment name, which uses to puth attach://<attachmentName>.
   *
   * <p>DO NOT USE "attach://", SERIALIZER AUTHOMATICALLY PUTS IT!
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(bytes);
    result = prime * result + Objects.hash(file, attachmentName, fileId, type);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputFile)) return false;
    InputFile other = (InputFile) obj;
    return Objects.equals(file, other.file)
        && Arrays.equals(bytes, other.bytes)
        && Objects.equals(attachmentName, other.attachmentName)
        && Objects.equals(fileId, other.fileId)
        && type == other.type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("InputFile[file=")
        .append(file)
        .append(", bytes=")
        .append(Arrays.toString(bytes))
        .append(", attachmentName=")
        .append(attachmentName)
        .append(", fileId=")
        .append(fileId)
        .append(", type=")
        .append(type)
        .append("]");
    return builder.toString();
  }
}

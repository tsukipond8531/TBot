package jarkz.tbot.types;

/**
 * This object represents the contents of a file to be uploaded. Must be posted using
 * multipart/form-data in the usual way that files are uploaded via the browser.
 */
public final class InputFile {

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof InputFile other)) return false;
    return true;
  }

  @Override
  public final int hashCode() {
    int prime = 31;
    return prime;
  }

  @Override
  public final String toString() {
    return "InputFile[]";
  }
}

package jarkz.tbot.violations;

public class Violation {

  private String expected;
  private String actual;
  private String commentary;

  @SuppressWarnings("unused")
  private Violation() {}

  public Violation(String expected, String actual, String commentary) {
    this.expected = expected;
    this.actual = actual;
    this.commentary = commentary;
  }

  public static Violation create(String expected, String actual, String commentary) {
    return new Violation(expected, actual, commentary);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("Expected: ")
        .append(expected)
        .append("\nActual: ")
        .append(actual)
        .append("\nCommentary: ")
        .append(commentary);
    return builder.toString();
  }
}

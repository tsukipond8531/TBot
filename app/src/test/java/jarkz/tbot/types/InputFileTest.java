package jarkz.tbot.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jarkz.tbot.TestContainer;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

@TestContainer
public class InputFileTest {

  private record Range(int start, int end) {
    public boolean within(char ch) {
      return start <= ch && ch <= end;
    }
  }

  @Test
  public void checkFirstLetter() {
    var file = new InputFile(new byte[10], "Name", "Type");
    for (var i = 0; i < 1_000; i++) {
      var attachmentName = file.randomAttachmentName();
      var ch = attachmentName.charAt(0);
      assertEquals(Character.toLowerCase(ch), ch);
    }
  }

  @Test
  public void isRandom() {
    var set = new HashSet<String>();
    var repeatCount = 0;

    var file = new InputFile(new byte[10], "Name", "Type");
    for (var i = 0; i < 1_000; i++) {
      var attachmentName = file.randomAttachmentName();
      if (!set.add(attachmentName)) {
        repeatCount += 1;
      }
    }

    assertEquals(true, repeatCount < 10);
  }

  private static final Range NUMBER_RANGE = new Range('0', '9');
  private static final Range UPPERCASE_LETTER_RANGE = new Range('A', 'Z');
  private static final Range LOWERCASE_LETTER_RANGE = new Range('a', 'z');

  @Test
  public void onlyNumbersAndLetters() {
    var file = new InputFile(new byte[10], "Name", "Type");

    for (var i = 0; i < 1_000; i++) {
      var attachmentName = file.randomAttachmentName();

      for (char ch : attachmentName.toCharArray()) {
        assertEquals(
            true,
            NUMBER_RANGE.within(ch)
                || UPPERCASE_LETTER_RANGE.within(ch)
                || LOWERCASE_LETTER_RANGE.within(ch));
      }
    }
  }
}

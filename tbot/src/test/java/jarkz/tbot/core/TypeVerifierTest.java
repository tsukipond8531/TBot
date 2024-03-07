package jarkz.tbot.core;

import static org.junit.jupiter.api.Assertions.assertThrows;

import jarkz.tbot.TestContainer;
import jarkz.tbot.core.parameters.GetUpdatesParameters;
import jarkz.tbot.core.parameters.SendMessageParameters;
import jarkz.tbot.types.Id;
import jarkz.tbot.types.Message;
import org.junit.jupiter.api.Test;

@TestContainer
public class TypeVerifierTest {

  @Test
  public void testNullable() {
    var params = new GetUpdatesParameters();
    TypeVerifier.verify(params);
  }

  @Test
  public void testNullTrhow() {
    var params = new SendMessageParameters();
    assertThrows(NullPointerException.class, () -> TypeVerifier.verify(params));
  }

  @Test
  public void correctType() {
    var params =
        new SendMessageParameters.Builder().setChatId(new Id(0)).setText("Something").build();
    TypeVerifier.verify(params);
  }

  @Test
  public void incorrectDataType() {
    var message = new Message();
    assertThrows(NullPointerException.class, () -> TypeVerifier.verify(message));
  }
}

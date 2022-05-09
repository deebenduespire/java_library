package org.espire.library.constructor;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.espire.library.constructor.argument.ArgsConstructor;
import org.espire.library.constructor.noargument.NoArgsConstructor;
import org.junit.jupiter.api.Test;


public class TestConstructor {

  ArgsConstructor obj = new ArgsConstructor(1,"lavi");

  NoArgsConstructor object = new NoArgsConstructor();

  @Test
  public void argsConstructor() {
    assertEquals(1, obj.getId());
    assertEquals("lavi", obj.getName());
  }

  @Test
  public void noArgsConstructor() {
    assertEquals(null, object.getId());
    assertEquals(null, object.getName());
  }
}

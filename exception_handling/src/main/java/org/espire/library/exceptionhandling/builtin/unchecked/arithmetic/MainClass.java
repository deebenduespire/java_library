package org.espire.library.exceptionhandling.builtin.unchecked.arithmetic;

public class MainClass {
  public static void main(String args[]) {
    HandleArithmeticException obj = new HandleArithmeticException();
    obj.getDivide(1, 0);
  }
}

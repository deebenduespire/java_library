package org.espire.library.exceptionhandling.builtin.unchecked.numberformat;

/**
 * Handle Number Format Exception
 */
public class HandleNumberFormatException {

  private void getNumber(Integer num) {
    try {
      num = Integer.parseInt("lavi");
      System.out.println(num);
    } catch (java.lang.NumberFormatException exception) {
      System.out.println("avoid number format exception " + exception);
    }
  }

  public static void main(String args[]) {
    HandleNumberFormatException obj = new HandleNumberFormatException();
    obj.getNumber(23);
  }
}

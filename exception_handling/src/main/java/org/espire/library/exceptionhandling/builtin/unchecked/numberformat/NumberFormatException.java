package org.espire.library.exceptionhandling.builtin.unchecked.numberformat;

/**
 * Number Format Exception
 */
public class NumberFormatException {

  private void getNumber(Integer num) {
    //throw an number format exception
    num = Integer.parseInt("lavi");
    System.out.println(num);
  }

  public static void main(String args[]) {
    NumberFormatException obj = new NumberFormatException();
    obj.getNumber(23);
  }
}

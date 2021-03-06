package org.espire.library.exceptionhandling.builtin.unchecked.arithmetic;

/**
 * Handle Arithmetic Exception
 **/

public class HandleArithmeticException {

  //performing division and store the result
  public void getDivide(Integer a, Integer b) {
    try {
      Integer c = a / b;
      System.out.println("output is" + c);
    }
    //handling the Arithmetic Exception in catch block
    catch (java.lang.ArithmeticException exception) {
      System.out.println("Avoid divided by 0 " + exception);
    }
  }
}

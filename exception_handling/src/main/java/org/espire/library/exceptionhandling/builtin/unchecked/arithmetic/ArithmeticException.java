package org.espire.library.exceptionhandling.builtin.unchecked.arithmetic;

/**
 * Arithmetic Exception
 **/

public class ArithmeticException {

  //performing division and store the result
  private void getDivide(Integer a, Integer b){
    Integer c = a/b;
    System.out.println("output is" + c);
  }

  public static void main(String args[]){
    ArithmeticException obj = new ArithmeticException();

    //throw an Arithmetic Exception
    obj.getDivide(1,0);
  }
}

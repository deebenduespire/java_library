package org.espire.library.exceptionhandling.builtin.unchecked.trycatchfinallyblock;

/**
 * Use of try catch and finally
 * */
public class TryCatchFinally {

  public void getDivision(Integer a, Integer b){

    try {
      Integer c = a/b;
      System.out.println("output is " + c);
    }
    catch(java.lang.ArithmeticException exception){
      System.out.println("Exception caught : Division by Zero");
    }
    finally{
      System.out.println("final block");
    }
  }
}

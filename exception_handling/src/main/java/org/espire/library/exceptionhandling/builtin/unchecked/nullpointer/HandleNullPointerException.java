package org.espire.library.exceptionhandling.builtin.unchecked.nullpointer;

/**
 * Handling Null Pointer Exception
 * */
public class HandleNullPointerException {
  public void getString(String str){

    try {
      System.out.println("Character at Zero index " + str.charAt(0));
    }
    catch(java.lang.NullPointerException exception){
      System.out.println("Should avoid null pointer exception " + exception);
    }
  }
}

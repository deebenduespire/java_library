package org.espire.library.exceptionhandling.builtin.unchecked.nullpointer;

/**
 * Null Pointer Exception
 * */
public class NullPointerException {

  private void getString(String str){

    System.out.println("Character at Zero index " + str.charAt(0));
  }

  public static void main(String args[]){
    NullPointerException obj = new NullPointerException();
    //throw a null pointer exception
    obj.getString(null);
  }
}

package org.espire.library.exceptionhandling.builtin.unchecked.nullpointer;

public class MainClass {
  public static void main(String args[]){
    HandleNullPointerException obj = new HandleNullPointerException();
    obj.getString(null);
  }
}

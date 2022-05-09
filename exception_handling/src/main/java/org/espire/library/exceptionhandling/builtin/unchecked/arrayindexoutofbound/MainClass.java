package org.espire.library.exceptionhandling.builtin.unchecked.arrayindexoutofbound;

public class MainClass {
  public static void main(String args[]) {
    HandleArrayIndexOutOfBound obj = new HandleArrayIndexOutOfBound();
    obj.getArray(new Integer[4]);
  }
}

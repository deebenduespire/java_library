package org.espire.library.exceptionhandling.builtin.unchecked.arrayindexoutofbound;

/**
 * Handle Array Index Out Of Bound
 */
public class HandleArrayIndexOutOfBound {

  public void getArray(Integer a[]) {
    try {
      a[5] = 7;
      System.out.println(a[5]);
    } catch (java.lang.ArrayIndexOutOfBoundsException exception) {
      System.out.println("Avoid array index out of bounds exception " + exception);

    }
  }
}

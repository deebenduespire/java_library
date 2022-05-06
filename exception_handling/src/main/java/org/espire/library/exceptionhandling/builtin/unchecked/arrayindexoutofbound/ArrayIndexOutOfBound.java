package org.espire.library.exceptionhandling.builtin.unchecked.arrayindexoutofbound;

/**
 * Array Index Out Of Bound
 * */
public class ArrayIndexOutOfBound {

  private void getArray(Integer a[]){
    // throw index out of bound exception
    a[5] = 7;
    System.out.println(a[5]);
  }

  public static void main(String args[]){
    ArrayIndexOutOfBound obj = new ArrayIndexOutOfBound();
    obj.getArray(new Integer[4]);
  }
}

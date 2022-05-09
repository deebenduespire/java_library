package org.espire.library.constructor.copy;

public class MainClass {
  public static void main(String args[]) {

    CopyConstructor obj1 = new CopyConstructor(1, "lavi");

    //call copy constructor
    CopyConstructor obj2 = new CopyConstructor(obj1);

    System.out.println(obj2);
  }
}

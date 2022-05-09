package org.espire.library.constructor.argument;

public class MainClass {

  public static void main(String args[]) {

    //invoke parameterized constructor
    ArgsConstructor obj = new ArgsConstructor(1, "lavi");

    System.out.println(obj.toString());

  }
}

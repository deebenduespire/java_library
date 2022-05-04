package org.espire.library.chaining.constructor;

/**
 * Base class
 * */
public class BaseClass {

  private String name;

  //constructor 1
  public BaseClass() {
    this("");
    System.out.println("No-argument constructor of base");
  }

  //constructor 2
  public BaseClass(String name) {
    this.name = name;
    System.out.println("Calling parameterized constructor of base");
  }
}
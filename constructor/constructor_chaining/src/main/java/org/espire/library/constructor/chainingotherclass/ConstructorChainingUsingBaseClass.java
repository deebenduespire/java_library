package org.espire.library.constructor.chainingotherclass;

/**
 * Chaining constructor using super()
 * */

public class ConstructorChainingUsingBaseClass extends BaseClass {

  //constructor 3
  public ConstructorChainingUsingBaseClass() {
    System.out.println("No-argument constructor of main");
  }

  //constructor 4
  public ConstructorChainingUsingBaseClass(String name) {
    //base class constructor 2
    super(name);
    System.out.println("Parameterized constructor of main");
  }



}

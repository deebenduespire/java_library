package org.espire.library.constructor;

/**
 * Chaining constructor using super()
 * */

public class ConstructorChainingUsingBaseClass extends BaseClass{

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

  public static void main(String args[]){

    ConstructorChainingUsingBaseClass obj = new ConstructorChainingUsingBaseClass("lavi");

    ConstructorChainingUsingBaseClass obj2 = new ConstructorChainingUsingBaseClass();
  }

}

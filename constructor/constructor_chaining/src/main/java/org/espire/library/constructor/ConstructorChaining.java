package org.espire.library.constructor;

/**
 * Constructor chaining : calling one constructor from another constructor
 * */

public class ConstructorChaining {

  //constructor 1
  public ConstructorChaining() {
    //calling constructor 2
    this(2);
    System.out.println("default");
  }

  //constructor 2
  public ConstructorChaining(Integer id) {
    //calling constructor 3
    this(2, "lavi");
    System.out.println(id);
  }

  //constructor 3
  public ConstructorChaining(Integer id, String name) {
    System.out.println(id + " " + name);
  }

  public static void main(String args[]){
    //calling dafault constructor
    new ConstructorChaining();
  }
}

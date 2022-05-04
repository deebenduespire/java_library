package org.espire.library.constructor;

/**
 * Constructor Overloading,
 */
public class ConstructorOverloading {

  //one task with different argument
  ConstructorOverloading(Integer id) {
    System.out.println("one argument : " + id);
  }

  ConstructorOverloading(Long id) {
    System.out.println("one argument type Long : " + id);
  }

  ConstructorOverloading(Integer id, String name) {
    System.out.println("Two argument : " + id + " " + name);
  }

  public static void main(String args[]) {

    ConstructorOverloading obj1 = new ConstructorOverloading(1);

    ConstructorOverloading obj2 = new ConstructorOverloading(45567786778L);

    ConstructorOverloading obj3 = new ConstructorOverloading(2, "abc");
  }
}

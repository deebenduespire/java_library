package org.espire.library.constructor.overloading;

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

}

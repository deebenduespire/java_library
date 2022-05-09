package org.espire.library.constructor.copy;

/**
 * Copy constructor : java compiler does not call default copy constructor
 */

public class CopyConstructor {

  private Integer id;
  private String name;

  //parameterized constructor
  public CopyConstructor(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  //copy constructor
  public CopyConstructor(CopyConstructor copy) {
    System.out.println("Copy constructor called ");
    id = copy.id;
    name = copy.name;
  }

  @Override
  public String toString() {
    return "CopyConstructor{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

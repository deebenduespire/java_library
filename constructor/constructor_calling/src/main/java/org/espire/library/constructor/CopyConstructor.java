package org.espire.library.constructor;

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
  CopyConstructor(CopyConstructor copy) {
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

  public static void main(String args[]) {

    CopyConstructor obj1 = new CopyConstructor(1, "lavi");

    //call copy constructor
    CopyConstructor obj2 = new CopyConstructor(obj1);

    System.out.println(obj2);
  }
}

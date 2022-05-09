package org.espire.library.constructor.argument;

/**
 * Constructor with argument
 */
public class ArgsConstructor {

  private Integer id;
  private String name;

  //parameterized constructor
  public ArgsConstructor(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public static void main(String args[]) {

    //invoke parameterized constructor
    ArgsConstructor obj = new ArgsConstructor(1, "lavi");

    System.out.println("id : " + obj.id + " name : " + obj.name);

  }

}

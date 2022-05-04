package org.espire.library.constructor;

/**
 * Default constructor with no argument
 */
public class NoArgsConstructor {

  private Integer id;
  private String name;

  public NoArgsConstructor() {
    super();
    System.out.println("Constructor calling");
  }

  public static void main(String args[]) {
    //invoke default constructor
    NoArgsConstructor obj = new NoArgsConstructor();

    //Default constructor provide default value
    System.out.println(obj.name);
  }

}

package org.espire.library.constructor.noargument;

import lombok.Getter;
import lombok.Setter;

/**
 * Default constructor with no argument
 */
@Getter
@Setter
public class NoArgsConstructor {

  private Integer id;
  private String name;

  public NoArgsConstructor() {
    super();
    System.out.println("Constructor calling");
  }

  @Override
  public String toString() {
    return "NoArgsConstructor{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

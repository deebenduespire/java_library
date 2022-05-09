package org.espire.library.constructor.argument;

import lombok.Getter;
import lombok.Setter;

/**
 * Constructor with argument
 */
@Getter
@Setter
public class ArgsConstructor {

  private Integer id;
  private String name;

  //parameterized constructor
  public ArgsConstructor(Integer id, String name) {
    this.id = id;
    this.name = name;
  }
}

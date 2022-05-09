package org.espire.library.exceptionhandling.userdefined;

/**
 * User defined exception
 */
public class InvalidProduct {

  public void checkWeight(Integer weight) throws CustomException {
    if (weight < 100) {
      throw new CustomException("Product Invalid");
    }
  }
}

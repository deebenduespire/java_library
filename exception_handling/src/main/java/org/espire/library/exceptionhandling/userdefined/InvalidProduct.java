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

  public static void main(String args[]) {
    InvalidProduct obj = new InvalidProduct();

    try {
      obj.checkWeight(60);
    } catch (CustomException exception) {
      System.out.println("caught exception " + exception);
    }
  }
}

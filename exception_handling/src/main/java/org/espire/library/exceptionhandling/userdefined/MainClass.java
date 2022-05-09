package org.espire.library.exceptionhandling.userdefined;

public class MainClass {
  public static void main(String args[]) throws CustomException {
    InvalidProduct obj = new InvalidProduct();
    obj.checkWeight(60);
  }
}

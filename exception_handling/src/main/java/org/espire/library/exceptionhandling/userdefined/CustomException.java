package org.espire.library.exceptionhandling.userdefined;

public class CustomException extends Exception {

  public CustomException(String str) {
    //calling constructor of parent Exception
    super(str);
  }
}

package org.espire.library.exceptionhandling.builtin.checked;

import java.io.File;
import java.io.FileInputStream;

/**
 * File not found exception
 * */
public class HandleFileNotFoundException {
  private void getFile() {
    File file = new File("D:\\BackupFile\\java_library.txt");

    //handle with try catch
    try {
      FileInputStream stream = new FileInputStream(file);
    } catch (java.io.FileNotFoundException e) {
      System.out.println("exception caught " + e);
    }
  }

  public static void main(String args[]) {
    HandleFileNotFoundException obj = new HandleFileNotFoundException();
    obj.getFile();
  }
}

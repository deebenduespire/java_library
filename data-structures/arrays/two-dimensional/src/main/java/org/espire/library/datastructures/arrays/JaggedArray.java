package org.espire.library.datastructures.arrays;

import java.util.Scanner;

public class JaggedArray {

   public static void jaggedArray(int[][] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }


}

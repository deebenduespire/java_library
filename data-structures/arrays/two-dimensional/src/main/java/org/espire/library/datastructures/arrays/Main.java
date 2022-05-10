package org.espire.library.datastructures.arrays;

import org.espire.library.datastructures.arrays.JaggedArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //JaggedArray jagged = new JaggedArray();
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Height of Player is " + " " + j + " " +
                        "in game" + " " + i);
                arr[i][j] = scan.nextInt();
            }
        }
        JaggedArray.jaggedArray(arr);
    }
}

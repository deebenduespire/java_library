package org.espire.library.arrays.typeofarrays.twodimensional;

public class TwoDimensionalMain {

    public static void display(int[][] arr){

        System.out.println("Array contents are.........");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

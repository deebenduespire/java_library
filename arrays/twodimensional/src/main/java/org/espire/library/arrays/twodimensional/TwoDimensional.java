package org.espire.library.arrays.twodimensional;

import java.util.Scanner;

public class TwoDimensional {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[2][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("height of player"+" "+j+" "+
                        "in game"+" "+i);
                arr[i][j]=scan.nextInt();
            }
        }
        TwoDimensionalMain.display(arr);


    }
}

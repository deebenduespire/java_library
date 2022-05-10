package org.espire.library.datastructures.arrays;

public class CopyingArray {

    public static int[] copying(int[]arr1,int[]arr2){
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        return arr2;
    }
    public static void display(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

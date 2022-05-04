package org.espire.library.arrays.typeofarrays.copyingarray;

public class CopyingArray {

    public void copying(int[]arr1,int[]arr2){
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
    }
    public void display(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

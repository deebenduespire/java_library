package org.espire.library.arrays.typeofarrays.reversecopying;

public class ReverseCopying {

    public void reverse(int[] arr1,int[] arr2){
        int j=arr2.length-1;
        for(int i=0;i<arr1.length;i++){
            arr2[j]=arr1[i];
            j--;
        }
    }
    public void display(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

package org.espire.library.datastructures.arrays;

public class ReverseCopying {

    public int[] reverse(int[] arr1){
        int[] arr2 = new int[arr1.length];
        int j=arr2.length-1;
        for(int i=0;i<arr1.length;i++){
            arr2[j]=arr1[i];
            j--;
        }
        return arr2;
    }
    public void display(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

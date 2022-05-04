package org.espire.library.arrays.typeofarrays.swappingarray;

public class SwappingClass {

    public void swap(int[] arr,int help){
       help = arr[0];
       arr[0]=arr[2];
       arr[2]=help;
    }
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

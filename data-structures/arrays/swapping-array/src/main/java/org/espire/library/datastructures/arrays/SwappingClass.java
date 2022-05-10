package org.espire.library.datastructures.arrays;

public class SwappingClass {

    public static int[] swap(int[] arr) {
        int help = 0;
        help = arr[0];
        arr[0] = arr[2];
        arr[2] = help;
        return arr;
    }
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

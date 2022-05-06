package org.espire.library.arrays.rotationofarray;

public class Main {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        Array rotate = new Array();
        rotate.leftRotate(arr,2);
        rotate.printArray(arr, arr.length);


    }
}

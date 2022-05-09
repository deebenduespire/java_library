package org.espire.library.arrays.reversecopying;

public class Main {
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,6,7};
        //int arr2[] = new int[arr1.length];
        ReverseCopying reverseCopying = new ReverseCopying();
        int arr2[] = reverseCopying.reverse(arr1);
        reverseCopying.display(arr2);

    }
}

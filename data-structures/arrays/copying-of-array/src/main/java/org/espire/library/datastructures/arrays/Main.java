package org.espire.library.datastructures.arrays;

import org.espire.library.datastructures.arrays.CopyingArray;

public class Main {
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = new int[arr1.length];
        CopyingArray copyingArray = new CopyingArray();
        copyingArray.copying(arr1,arr2);
        copyingArray.display(arr2);

    }
}

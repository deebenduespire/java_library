package org.espire.library.datastructure.heap.deletionInHeap;

import org.espire.library.datastructure.heap.deletionInHeap.Deletion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int arr[] = { 10, 5, 3, 2, 4 };
        int n = arr.length;
        Deletion delete = new Deletion();
        n = delete.deletion(arr, n);
        delete.printArray(arr, n);

    }
}

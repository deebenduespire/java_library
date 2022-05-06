package org.espire.library.binarysearchtree.binarysearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the array size :");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the key element");
        int key = scan.nextInt();
        BinarySearch search = new BinarySearch();
        search.binarySearch(arr,key);
    }
}

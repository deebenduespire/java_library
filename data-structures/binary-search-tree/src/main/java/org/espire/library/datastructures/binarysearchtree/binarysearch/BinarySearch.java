package org.espire.library.datastructures.binarysearchtree.binarysearch;

public class BinarySearch {

    public static void binarySearch(int arr[],int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                System.out.println("key found at :" + mid);
                System.exit(0);
            } else if (key > arr[mid]) {
                low = mid + 1;
                high = high;
            } else {
                high = mid - 1;
                low = low;
            }
        }
        System.out.println("key not found..");
    }

}

package org.espire.library.algorithms.analysis;

public class LinearSearch {

    static int search(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 30, 15};
        int x = 30;
        int n = arr.length;
        System.out.println();
        System.out.printf("%d is present at index %d", x,
                search(arr, n, x));
        System.out.println();
    }
}

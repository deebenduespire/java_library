package org.espire.library.arrays.typeofarrays.rotationofarray;

public class Array {

    //1 2 3 4 5 6 7
    // 2 3 4 5 6 7 1
    public void leftRotate(int arr[],int d,int n) {

        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
       public void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}

package org.espire.library.datastructure.heap.InsertionInHeap;

public class Insertion {

    public static void heapify(int arr[],int n,int i){
        int parent=(i-1)/2;

            if(arr[parent]>0){
                if(arr[i]>arr[parent]){
                    swap(arr,i,parent);
                    heapify(arr,n,parent);
                }
            }
        }

    public static int[] swap(int[] arr,int i,int parent){
        int swap = arr[i];
        arr[i] = arr[parent];
        arr[parent] = swap;
        return arr;
    }

    public static void insert(int arr[],int n,int key){
      //  n=n+1;
        arr[n-1]=key;
        heapify(arr,n,n-1);
    }
    public void printArray(int arr[],int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}

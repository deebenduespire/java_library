package org.espire.library.datastructure.heap.deletionInHeap;

public class Deletion {

    public static void heapify(int arr[],int n,int i){

        int largest=i;  //root
        int left=2*i;   //left
        int right=2*i+1;//right
        
        if(left<n && arr[left]>arr[largest]){
             largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);

        }
    }

    public int deletion(int[] arr, int n){

        int lastElement=arr[n-1];
        arr[0]=lastElement;
        n=n-1;
        heapify(arr,n,0);
        return n;
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            System.out.println();

        }

    }
}

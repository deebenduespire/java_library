package org.espire.library.datastructure.heap.InsertionInHeap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int arr[]=new int[6];
        arr[0] = 10;
        arr[1]=5;
        arr[2]=3;
        arr[3]=2;
        arr[4]=4;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the key Element :");
        int key = scan.nextInt();
        Insertion insertion = new Insertion();
        Insertion.insert(arr,n,key);
        insertion.printArray(arr,n);

    }
}

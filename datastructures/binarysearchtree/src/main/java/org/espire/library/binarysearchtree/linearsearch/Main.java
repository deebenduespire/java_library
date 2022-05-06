package org.espire.library.binarysearchtree.linearsearch;

import org.espire.library.binarysearchtree.linearsearch.LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the element in array :");
        for(int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the Key :");
        int key = scan.nextInt();
        LinearSearch search = new LinearSearch();
        search.linearSearch(arr,key);

    }
}

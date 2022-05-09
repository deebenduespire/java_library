package org.espire.library.datastructures.binarysearchtree.linearsearch;

import java.util.Scanner;

public class LinearSearch {

    public void linearSearch(int arr[], int key){
        for(int i=0;i< arr.length;i++){
            if(key==arr[i]){
                System.out.println("key found at index :"+" "+i);
                System.exit(0);

            }

        }
        System.out.println("key not found....");
    }

}

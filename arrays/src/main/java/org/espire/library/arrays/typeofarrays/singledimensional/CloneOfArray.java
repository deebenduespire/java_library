package org.espire.library.arrays.typeofarrays.singledimensional;

public class CloneOfArray {

    public static void main(String args[]){

        int arr[] = {1,2,3};
        int cloneArray[] = arr.clone();
        System.out.println(arr == cloneArray);
        for(int i=0;i<cloneArray.length;i++)
        {
            System.out.print(cloneArray[i]+" ");

        }
        System.out.println();
    //    System.out.println(arr.hashCode());
     //   System.out.println(cloneArray.hashCode());
    }
}

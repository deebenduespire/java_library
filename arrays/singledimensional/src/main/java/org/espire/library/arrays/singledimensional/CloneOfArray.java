package org.espire.library.arrays.singledimensional;

public class CloneOfArray {

    public static void main(String args[]){

        int arr[] = {1,2,3};
        int cloneArr[] = cloneArray(arr);

        System.out.println(arr == cloneArr);

        for(int i=0;i<cloneArr.length;i++)
        {
            System.out.print(cloneArr[i]+" ");

        }
        System.out.println();
    //    System.out.println(arr.hashCode());
     //   System.out.println(cloneArray.hashCode());
    }

    public static int[] cloneArray(int[] arr){
        int[] cloneArr = arr.clone();
        return cloneArr;
    }
}

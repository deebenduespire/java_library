package org.espire.library.datastructures.string.programs;

public class CopyingArray {
    public static void main(String args[]){
        String str="Hello";
        char[] array = str.toCharArray();
        int size=array.length;
        char[] array1 = new char[size];
        int i=0;
        while(i!=size){
            array1[i]=array[i];
            ++i;
        }
        System.out.println(array);
        System.out.println(array1);
    }
}

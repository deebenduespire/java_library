package org.espire.library.datastructures.string.programs;

import java.util.Locale;
import java.util.Scanner;

public class FindPalindrome {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str= scan.nextLine();
        str=str.replace(" ","");
        str=str.toUpperCase();
        char[] array = str.toCharArray();
        int size=array.length;
        char[] array1 = new char[size];
        int i=0;
        while(i!=size){
            array1[size-1-i]=array[i];
            ++i;
        }
        i=0;
        while(i!=size){
            if(array1[i]!=array[i]){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
            else{
                ++i;
                continue;
            }
        }
        System.out.println("Palindrome");


    }
}

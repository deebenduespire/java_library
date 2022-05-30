package org.espire.library.datastructures.string.programs.palindrom;

import java.util.Locale;
import java.util.Scanner;

public class FindPalindrome {

   public static void palindrome(char[] array,char[] array1,int size){
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

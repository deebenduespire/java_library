package org.espire.library.datastructures.string.programs.palindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = scan.nextLine();
        str = str.replace(" ", "");
        str = str.toUpperCase();
        char[] array = str.toCharArray();
        int size = array.length;
        char[] array1 = new char[size];
        FindPalindrome find=new FindPalindrome();
       find.palindrome(array,array1,size);

    }
}

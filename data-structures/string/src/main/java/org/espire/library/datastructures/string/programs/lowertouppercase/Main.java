package org.espire.library.datastructures.string.programs.lowertouppercase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str= scan.nextLine();
        char[] array = str.toCharArray();
        int size=array.length;
        LowerToUpper lower = new LowerToUpper();
        lower.convertToUpper(array,size);

    }
}

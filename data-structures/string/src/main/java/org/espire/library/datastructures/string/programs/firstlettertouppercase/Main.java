package org.espire.library.datastructures.string.programs.firstlettertouppercase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = scan.nextLine();
        char[] array=str.toCharArray();
        int size=array.length;
        ToUpperCase convert = new ToUpperCase();
        convert.firstLetterToUpper(array,size);

    }
}

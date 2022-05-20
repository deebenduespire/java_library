package org.espire.library.datastructures.hashing.chaining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of hashtable table");
        int size = scanner.nextInt();

        OpenHashing hashing = new OpenHashing(size);
        hashing.insert(20);
        hashing.insert(30);
        hashing.insert(18);
        hashing.insert(32);
        hashing.insert(43);
        hashing.insert(23);
        hashing.insert(42);
        hashing.insert(46);
        hashing.insert(55);

        hashing.display();
    }
}

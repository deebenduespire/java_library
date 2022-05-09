package org.espire.library.datastructures.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee[] = new Employee[5];
        employee[0] = new Employee(831, "Roy");
        employee[1] = new Employee(567, "Rohan");
        employee[2] = new Employee(231, "Sai");
        employee[3] = new Employee(232, "Saya");
        employee[4] = new Employee(233, "Shri");

        Arrays.stream(employee).forEach(v -> System.out.println(v));
    }
}

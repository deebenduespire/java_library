package org.espire.library.oopsconcepts.polymorphism.methodoverloading;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Employee> employees = null;

    static {
        employees = Arrays.asList(new Employee(101, "shubham yadav"),
                new Employee(102, "ankit tiwari"),
                new Employee(103, "ashish rathod"),
                new Employee(104, "ramesh pawar"));
    }

    public static void main(String[] args) {
        Employee employee = null;

        employee = employees.get(2);
        employee.searchEmployee(103);

//        -------------------------------------
        employee = employees.get(3);
        employee.searchEmployee("ramesh pawar");
    }
}

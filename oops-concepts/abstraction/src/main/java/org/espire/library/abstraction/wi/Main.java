package org.espire.library.abstraction.wi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choice :");
        System.out.println("1. HR");
        System.out.println("2. Manager");

        int choice = scanner.nextInt();

        Employee em = null;

        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        if(choice == 1) em = new HR();
        else if(choice == 2) em = new Manager();
        else System.out.println("Invalid choice");

        em.getDesignation();
        System.out.println("net salary is "+em.getSalary(salary));
        System.out.println("Total salary is : "+salary);
    }
}

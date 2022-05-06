package org.espire.library.polymorphism.hierarchical;

public abstract class Employee {

    void displayInfo(String name, double salary) {
        System.out.println("Name is : " + name);
        System.out.println("Salary is :" + salary);
    }

    abstract void debugString();
}

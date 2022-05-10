package org.espire.library.oopsconcepts.inheritance.hierarchical;

public abstract class Employee {

    void displayInfo(String name, double salary) {
        System.out.println("Name is : " + name);
        System.out.println("Salary is :" + salary);
    }

    abstract void debugString();
}

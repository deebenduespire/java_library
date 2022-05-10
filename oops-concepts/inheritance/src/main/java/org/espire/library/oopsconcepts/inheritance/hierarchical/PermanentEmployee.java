package org.espire.library.oopsconcepts.inheritance.hierarchical;

import org.espire.library.oopsconcepts.inheritance.hierarchical.Employee;

public class PermanentEmployee extends Employee {

    private String designation = "";

    void designation(String des) {
        designation = des;
    }


    void debugString() {
        System.out.println("Designation [" + designation + "]");
    }
}

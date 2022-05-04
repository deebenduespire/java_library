package org.espire.library.polymorphism.hierarchical;

public class PermanentEmployee extends Employee {

    private String designation = "";

    void designation(String des) {
        designation = des;
    }


    void debugString() {
        System.out.println("Designation [" + designation + "]");
    }
}

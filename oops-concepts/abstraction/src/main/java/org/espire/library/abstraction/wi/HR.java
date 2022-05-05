package org.espire.library.abstraction.wi;

public class HR implements Employee {
    @Override
    public void getDesignation() {
        System.out.println("Designation is HR");
    }

    @Override
    public double getSalary(double amt) {
        return amt - amt * 0.1; //net salary
    }
}

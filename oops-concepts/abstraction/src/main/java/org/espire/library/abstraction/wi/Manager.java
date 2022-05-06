package org.espire.library.abstraction.wi;

public class Manager implements Employee {
    @Override
    public void getDesignation() {
        System.out.println("Designation is Manager");
    }

    @Override
    public double getSalary(double amt) {
        return amt - amt * 0.15;
    }
}

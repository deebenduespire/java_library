package org.espire.library.polymorphism.hierarchical;

public class ContractEmployee extends Employee {

    private Integer years;

    void contractPeriod(int yrs) {
        years = yrs;
    }

    void debugString() {
        System.out.println("Years [" + years + "]");
    }

}

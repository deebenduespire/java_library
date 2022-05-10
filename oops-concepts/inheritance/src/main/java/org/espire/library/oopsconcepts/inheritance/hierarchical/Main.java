package org.espire.library.oopsconcepts.inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee employee = new PermanentEmployee();
        employee.displayInfo("Shubham Yadav", 300000.21);
        employee.designation("Software Engineer");
        print(employee);

        System.out.println("------------------------------------------------------");
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.displayInfo("Abhijeet tiwari", 2400003.21);
        contractEmployee.contractPeriod(2);
        print(contractEmployee);
    }

    public static void print(Employee employee) {
        employee.debugString();
    }
}

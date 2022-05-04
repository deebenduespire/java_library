package org.espire.library.polymorphism.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(101L);
        employee.setName("Shubham Yadav");
        employee.setDesignation("Software Engineer");
        employee.setSalary(1000);

        getData(employee);

    }

    public static void getData(Employee employee){
        System.out.println(employee);
    }
}

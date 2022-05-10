package org.espire.library.oopsconcepts.polymorphism.methodoverloading;

public class Employee {
    private static int id;
    private static String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String searchEmployee(int employeeId){
        if(employeeId == id){
            System.out.println("Employee id : "+ id);
            System.out.println("Employee name : "+ name);
            return "record found";
        }
        else{
            return "Record not found";
        }
    }

    public String searchEmployee(String name){
        if(name.equalsIgnoreCase(this.name)){
            System.out.println("Employee id : "+ this.id);
            System.out.println("Employee name : "+ this.name);
            return "record found";
        }
        else{
            return "Record not found";
        }
    }

}

package org.espire.library.arrays.arrayofobjects;

public class Main {
    public static void main(String[] args){

        //creating array of object
        Employee employee[] = new Employee[5];
        employee[0]= new Employee(831,"Roy");
        employee[1]=new Employee(567,"Rohan");
        employee[2]= new Employee(231,"Sai");
        employee[3]= new Employee(232,"Saya");
        employee[4]= new Employee(233,"Shri");

        for(int i=0;i< employee.length;i++)
        {
            System.out.println("Details at index"+" "+i+" "+"is"+": "+
             employee[i].getId()+","+employee[i].getName());
        }
    }
}

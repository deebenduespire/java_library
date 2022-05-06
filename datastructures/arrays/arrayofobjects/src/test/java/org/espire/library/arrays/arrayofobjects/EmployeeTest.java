package org.espire.library.arrays.arrayofobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee[] = new Employee[5];
    @BeforeEach
    void setUp() {
        //Employee employee[] = new Employee[5];
        employee[0]= new Employee(831,"Roy");
        employee[1]=new Employee(567,"Rohan");
        employee[2]= new Employee(231,"Sai");
        employee[3]= new Employee(232,"Saya");
        employee[4]= new Employee(233,"Shri");

    }

    @Test
    void getId() {
        assertEquals(831,employee[0].getId());

    }

    @Test
    void getName() {
        assertEquals("Shri",employee[4].getName());
    }
}
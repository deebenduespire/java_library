package org.espire.library.polymorphism.encapsulation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Employee employee = null;

    @BeforeAll
    public static void setInformation(){
        employee = new Employee();
        employee.setId(101L);
        employee.setName("Shubham Yadav");
        employee.setDesignation("Software Engineer");
        employee.setSalary(21100);
    }

    @Test
    public void getDetails() {
        assertEquals(101L, employee.getId());
        assertEquals("Shubham Yadav", employee.getName());
        assertEquals("Software Engineer", employee.getDesignation());
        assertEquals(21100, employee.getSalary());
    }

}
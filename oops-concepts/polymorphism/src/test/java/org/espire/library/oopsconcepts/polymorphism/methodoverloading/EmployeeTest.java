package org.espire.library.oopsconcepts.polymorphism.methodoverloading;

import org.espire.library.oopsconcepts.polymorphism.methodoverloading.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee(101,"shubham yadav");
    }

    @Test
    void searchEmployee() {
        assertEquals("record found",employee.searchEmployee(101));
    }

    @Test
    void testSearchEmployee() {
        assertEquals("record found",employee.searchEmployee("shubham yadav"));
    }
}
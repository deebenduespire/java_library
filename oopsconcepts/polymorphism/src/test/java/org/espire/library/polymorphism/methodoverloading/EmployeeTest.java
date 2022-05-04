package org.espire.library.polymorphism.methodoverloading;

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
        assertEquals(101,employee.searchEmployee(101));
    }

    @Test
    void testSearchEmployee() {
        assertEquals("shubham yadav",employee.searchEmployee("shubham yadav"));
    }
}
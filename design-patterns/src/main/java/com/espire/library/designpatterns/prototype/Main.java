package com.espire.library.designpatterns.prototype;

import org.apache.commons.lang3.SerializationUtils;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Deebendu", "Chandigarh");
        Employee employee2 = null;
        try {
            employee2 = (Employee) employee1.clone();
            employee2.setId(2);
            employee2.setAddress("Panchkula");

            System.out.println(employee1.toString());
            System.out.println(employee2.toString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        Person person = new Person("Deebendu");
        Person person1 = SerializationUtils.roundtrip(person);
        person1.setName("Kumar");
        System.out.println(person);
        System.out.println(person1);
    }
}

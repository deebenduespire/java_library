package org.espire.library.polymorphism.single_level;

public class Child extends Parent {
    Child(){
        System.out.println("Creating a child class object");
    }
    void childProperty(){
        System.out.println("BMW Car");
    }
}

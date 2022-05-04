package org.espire.library.polymorphism.single_level;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Level Inheritance");
        Child child = new Child();
        child.parentProperty();
        child.childProperty();
    }
}

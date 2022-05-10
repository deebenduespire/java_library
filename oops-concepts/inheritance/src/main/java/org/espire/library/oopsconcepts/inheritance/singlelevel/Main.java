package org.espire.library.oopsconcepts.inheritance.singlelevel;

import org.espire.library.oopsconcepts.inheritance.singlelevel.Child;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Level Inheritance");
        Child child = new Child();
        child.parentProperty();
        child.childProperty();
    }
}

package com.espire.library.designpatterns.dip;

/**
 * Basic idea is not to tightly coupled with high level modules
 */
public class Main {

    public static void main(String[] args) {
        Person parent = new Person("Kumar");
        Person child1 = new Person("Shrey");
        Person child2 = new Person("Ziva");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}

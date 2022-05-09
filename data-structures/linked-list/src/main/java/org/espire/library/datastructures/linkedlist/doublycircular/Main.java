package org.espire.library.datastructures.linkedlist.doublycircular;


public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList dcl = new DoublyCircularLinkedList();
        System.out.println("---------------Insert First-------------------");
        dcl.insertFirst(10);
        dcl.insertFirst(20);
        dcl.insertFirst(30);
        dcl.display();

        System.out.println();
        System.out.println("---------------Insert Last-------------------");
        dcl.insertLast(40);
        dcl.insertLast(50);
        dcl.display();

        System.out.println("");
        System.out.println("---------------Delete First-------------------");
        dcl.deleteFirst();
        dcl.display();

        System.out.println();
        System.out.println("--------------Delete Last--------------------");
        dcl.deleteLast();
        dcl.display();
        System.out.println();
        System.out.println("----------------------------------");
    }
}

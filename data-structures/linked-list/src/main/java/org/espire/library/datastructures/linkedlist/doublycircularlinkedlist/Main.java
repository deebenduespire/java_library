package org.espire.library.datastructures.linkedlist.doublycircularlinkedlist;


public class Main {
    public static void main(String[] args) {
        DoublyCircularLinkedList dcl = new DoublyCircularLinkedList();
        dcl.insertFirst(10);
        dcl.insertFirst(20);
        dcl.insertFirst(30);
        dcl.display();

        System.out.println("----------------------------------");
        dcl.insertLast(40);
        dcl.insertLast(50);
        dcl.display();

        System.out.println("----------------------------------");
        dcl.deleteFirst();
        dcl.display();

        System.out.println("----------------------------------");
        dcl.deleteLast();
        dcl.display();
    }
}

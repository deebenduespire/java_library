package org.espire.library.datastructures.linkedlist.singlyll;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList scl = new SinglyLinkedList();

        System.out.println("After insert first operation");
        scl.insertFirst(10);
        scl.insertFirst(20);
        scl.insertFirst(30);
        scl.insertFirst(50);
        scl.insertFirst(70);

        scl.display();

        System.out.println("After insert last operation");
        scl.insertLast(40);
        scl.display();

        System.out.println("After delete first operation");
        scl.deleteFirst();
        scl.display();

        System.out.println("After delete last operation");
        scl.deleteLast();
        scl.display();

        System.out.println("After insert at position operation");
        scl.insertAtPos(23,5);
        scl.display();

        System.out.println("After delete at position operation");
        scl.deleteAtPos(3);
        scl.display();
    }
}

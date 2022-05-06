package org.espire.library.datastructures.linkedlist.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertFirst(10);
        dl.insertFirst(20);
        dl.insertFirst(30);
        dl.insertLast(40);
        dl.insertLast(50);

        dl.display();

        System.out.println();
        System.out.println("---------- After deleting first operation ------------");
        dl.deleteFirst();

        dl.display();

        System.out.println();
        System.out.println("---------- After deleting last operation ------------");
        dl.deleteLast();
        dl.display();
    }
}

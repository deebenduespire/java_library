package org.espire.library.datastructures.queue.deque;

public class Main {
    public static void main(String[] args) {
        DequeDemo deque = new DequeDemo();

        deque.insertFirst(10);
        deque.insertLast(20);
        deque.insertFirst(30);
        deque.insertFirst(40);
        deque.insertLast(50);

        deque.display();

        deque.deleteFirst();
        deque.display();

        deque.deleteLast();
        deque.display();
    }
}

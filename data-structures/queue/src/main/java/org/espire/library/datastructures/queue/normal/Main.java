package org.espire.library.datastructures.queue.normal;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueDemo queue = new QueueDemo();

        System.out.println("-----------------------------");
        queue.insertFirst(10);
        queue.insertFirst(20);
        queue.insertFirst(30);
        queue.insertFirst(40);
        queue.display();
        //System.out.println();
        System.out.println("-----------------------------");

        queue.deleteLast();
        queue.display();
        System.out.println();
    }
}

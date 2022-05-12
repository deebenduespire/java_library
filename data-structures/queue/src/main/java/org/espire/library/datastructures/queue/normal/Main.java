package org.espire.library.datastructures.queue.normal;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueDemo queue = new QueueDemo();

        System.out.println("-----------------------------");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        //System.out.println();
        System.out.println("-----------------------------");

        queue.dequeue();
        queue.display();
        System.out.println();
    }
}

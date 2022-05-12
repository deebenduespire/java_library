package org.espire.library.datastructures.queue.priority;

public class Main {
    public static void main(String[] args) {
        PriorityQueueDemo pq = new PriorityQueueDemo();
        pq.push(12,4);
        pq.push(21,2);
        pq.push(15,0);
        pq.push(23,3);
        pq.push(18,1);

        pq.display();
        System.out.println("--------------------------------------");
        System.out.println("\t\t\tAFTER POP");
        System.out.println("---------------------------------------");
        pq.pop();
        pq.display();
    }
}

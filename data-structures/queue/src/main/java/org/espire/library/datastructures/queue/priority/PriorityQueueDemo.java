package org.espire.library.datastructures.queue.priority;

class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
public class PriorityQueueDemo {
    private Node head;

    PriorityQueueDemo() {
        head = null;
    }

    //it will push elements according to there priority
    public void push(int data, int priority) {
        Node newNode = new Node(data,priority);

        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node temp = head;

            while ((temp.next != null) && (temp.next.priority <= priority)) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    //it removes highest priority element first
    public void pop () {
        Node temp;

        if (head == null) {
            return;
        }
        else {
            temp = head;
            head = head.next;
        }
    }

    public void display() {
        Node temp = head;

        if (head == null) {
            return;
        }
        else {
            while (temp != null) {
                System.out.printf("%d -> %d",temp.priority,temp.data);
                temp = temp.next;
                System.out.println();
            }
        }
    }

}

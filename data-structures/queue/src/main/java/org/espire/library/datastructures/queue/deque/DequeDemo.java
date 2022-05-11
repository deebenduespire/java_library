package org.espire.library.datastructures.queue.deque;

class Node {
    protected int data;
    protected Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class DequeDemo {
    private Node head;

    public DequeDemo() {
        head = null;
    }

    public void insertFirst(int no) {
        Node newNode = new Node(no);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertLast(int no) {
        Node newNode = new Node(no);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = temp.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            Node temp1 = null;
            while (temp.next != head) {
                temp1 = temp;
                temp = temp.next;
            }
            temp1.next = temp.next;
        }
    }

    public void display() {
        System.out.println("Nodes are : ");
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->");
        System.out.println();

    }
}

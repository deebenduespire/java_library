package org.espire.library.datastructures.linkedlist.doublycircular;

class Node {
    public int data;
    public Node previous;
    public Node next;

    Node(int value) {
        data = value;
        previous = null;
        next = null;
    }
}
public class DoublyCircularLinkedList {
    private Node head,tail;

    public DoublyCircularLinkedList(){
        head = null;
        tail = null;
    }

    public void insertFirst(int no) {
        Node newNode = new Node(no);

        if(head == null && tail == null) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.previous = newNode;
            head = head.previous;
        }
        tail.next = head;
        head.previous = tail;

    }

    public void insertLast(int no) {
        Node newNode = new Node(no);

        if(head == null && tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        tail.next = head;
        head.previous = tail;
    }

    public void deleteFirst() {
        if (head == null && tail == null) {
            return;
        }
        else if(head.next == head) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        tail.next = head;
        head.previous = tail;
    }

    public void deleteLast() {
        if(head == null && tail == null) {
            return;
        }
        else if(head.next == head) {
            head = null;
            tail = null;
        }
        else{
            tail = tail.previous;
        }
        tail.next = head;
        head.previous = tail;
    }
    public void display() {
        if(head == null && tail == null) {
            return;
        }
        else {
            Node temp = head;
            Node temp2 = tail;
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            while (temp != temp2.next);
        }
    }
}

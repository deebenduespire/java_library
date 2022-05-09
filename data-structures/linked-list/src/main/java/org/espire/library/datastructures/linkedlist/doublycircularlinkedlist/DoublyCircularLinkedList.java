package org.espire.library.datastructures.linkedlist.doublycircularlinkedlist;

class Node {
    protected int data;
    protected Node previous;
    protected Node next;

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

        if(head == null) {
            head = tail = newNode;
            newNode.next = tail;
            newNode.previous = head;
        }
        else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            tail = newNode;
        }
    }

    public void insertLast(int no) {
        Node newNode = new Node(no);

        if(head == null) {
            head = tail = newNode;
            newNode.next = tail;
            newNode.previous = head;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
            tail.previous = newNode;
            newNode.next = tail;
        }
    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }
        else if(head.next == head) {
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head.next.previous = temp;
            head = temp.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        else if(head.next == head) {
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }

            temp.previous.next = head;
            head.previous = temp.previous;
        }
    }
    public void display() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }
}

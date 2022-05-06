package org.espire.library.datastructures.linkedlist.doublylinkedlist;

class Node {
    public int data;
    public Node previous;
    public Node next;

    Node(int value){
        data = value;
        previous = null;
        next = null;
    }
}
public class DoublyLinkedList {
    public Node head,tail;
//    public Node tail = null;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertFirst(int no){
        Node newNode = new Node(no);

        if(head == null){
            head = tail = newNode;
        }
        else{
            //newNode.previous = null;
            newNode.next = head;
            head.previous=newNode;
            head=newNode;
        }
    }

    public void insertLast(int no){
        Node newNode = new Node(no);

        if(head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void deleteFirst(){
        if(head == null) {
            return;
        }
        else if(head.next == null) {
            head = null;
            return;
        }
        else {
            head = head.next;
            head.previous = null;
            System.out.println("Node deleted");
        }
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        else if(head.next == null) {
            head = null;
            return;
        }
        else {
            tail = tail.previous;
            tail.next = null;

        }
    }

    public void display(){
        Node temp = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(temp != null) {
            //Print each node and then go to next.
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


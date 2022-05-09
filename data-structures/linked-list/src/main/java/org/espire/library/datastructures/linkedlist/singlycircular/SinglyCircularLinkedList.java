package org.espire.library.datastructures.linkedlist.singlycircular;

class Node {
    protected int data;
    protected Node next;

    public Node(int value) {
        data = value;
        next = null;
    }
}

public class SinglyCircularLinkedList {
    private Node head;

    SinglyCircularLinkedList() {
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

    public int count() {
        Node temp = head;
        int cnt = 0;

        while (temp.next != head) {
            cnt++;
            temp = temp.next;
        }
        cnt++;

        return cnt;
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

    public void insertAtPos(int no, int pos) {
        int size = count();

        if ((pos <= 0) || (pos > size + 1)) {
            return;
        }

        if (pos == 1) {
            insertFirst(no);
        } else if (pos == (size + 1)) {
            insertLast(no);
        } else {
            Node newNode = new Node(no);
            Node temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtPos(int pos) {
        int size = count();

        if ((pos <= 0) || (pos > (size + 1))) {
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else if (pos == (size + 1)) {
            deleteLast();
        } else {
            Node temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display() {
        System.out.println("Nodes are : ");
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + "");
        System.out.println();
    }
}

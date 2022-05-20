package org.espire.library.datastructures.hashing.chaining;

class Node {
    protected int data;
    protected Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class OpenHashing {
    private Node[] head;
    private int size;

    OpenHashing(int size) {
        head = new Node[size];
        this.size = size;
    }

    void insert(int key) {
        int i = key % size;
        Node newNode = new Node(key);

        if(head[i] == null) {
            head[i] = newNode;
        }
        else {
            Node temp = head[i];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void search(int key) {
        int i = key % size;
        if (head[i] == null) {
            System.out.println("No such a element found");
            return;
        } else {
            Node temp = head[i];
            for (temp = head[i]; temp != null; temp = temp.next) {
                if (temp.data == key) {
                    System.out.println("Element Found in HashTable");
                    break;
                }
            }
            if (temp == null) {
                System.out.println("Element Not found in HashTable");
            }
        }
    }

    void display() {
        for (int i = 0; i <size;i++) {
            System.out.printf("\nEntries at index :| %d |",i);
            if (head[i] == null) {
                System.out.print(" No entries found");
            }
            else {
                for (Node temp = head[i]; temp != null; temp = temp.next){
                    System.out.printf(" %d -> ",temp.data);
                }
            }
        }
    }
}

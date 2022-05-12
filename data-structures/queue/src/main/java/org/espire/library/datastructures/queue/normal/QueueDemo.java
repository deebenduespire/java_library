package org.espire.library.datastructures.queue.normal;

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
public class QueueDemo {
    public Node head;

    public QueueDemo() {
        head = null;
    }

    public void enqueue(int no) {
        //insertFirst
        Node newNode = new Node(no);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
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

    public void dequeue() {
        //deleteLast
        if(head == null)	// Empty
        {
            return;
        }
        else
        {
            if(head.next == null)	// single node
            {
                head = null;
            }
            else 			// more than one node
            {
                Node temp = head;

                while(temp.next.next != null)
                {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void display() throws Exception {
        Node temp = head;
        System.out.println("Elements of Queue are: ");

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println();
    }
}

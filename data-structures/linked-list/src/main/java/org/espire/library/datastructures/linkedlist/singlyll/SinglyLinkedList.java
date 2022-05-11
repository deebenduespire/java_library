package org.espire.library.datastructures.linkedlist.singlyll;

import java.lang.*;

//structure of node
class Node
{
    public int data;
    public Node next;

    public Node(int value)
    {
        data = value;
        next = null;
    }
}

public class SinglyLinkedList
{
    public Node head;

    public SinglyLinkedList()
    {
        head = null;
    }

    public void insertFirst(int no)
    {
        Node newNode = new Node(no);
        // C 		PNODE newNodeode = (PNODE)malloc(sizeof(NODE));
        // C++		PNODE newNode = new NODE;
        // java 	Node newNode = new Node(no);

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

    public void insertLast(int no)
    {
        Node newNode = new Node(no);	// Kamal statement ahe
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public void display()
    {
        Node temp = head;
        System.out.println("Elements of linked list are: ");

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int count()
    {
        int icnt = 0;
        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            icnt++;
        }
        return icnt;
    }

    public void deleteFirst()
    {
        if(head == null)	// Empty
        {
            return;
        }
        else // one or more than one
        {
            head = head.next;
        }
    }

    public void deleteLast()
    {
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

    public void insertAtPos(int pos, int data)
    {
        int size = count();
        if((pos <= 0) || (pos > size+1))
        {
            return;
        }
        if(pos == 1)
        {
            insertFirst(data);
        }
        else if (pos == (size + 1))
        {
            insertLast(data);
        }
        else
        {
            Node newNode = new Node(data);
            Node temp = head;
            for(int i = 1; i < pos-1; i++)
            {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtPos(int pos)
    {
        int size = count();
        if((pos <= 0) || (pos > size))
        {
            return;
        }
        if(pos == 1)
        {
            deleteFirst();
        }
        else if (pos == (size))
        {
            deleteLast();
        }
        else
        {
            Node temp = head;
            for(int i = 1; i < pos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
    }
}

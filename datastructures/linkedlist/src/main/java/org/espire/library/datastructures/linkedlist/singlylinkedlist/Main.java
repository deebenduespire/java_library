package org.espire.library.datastructures.linkedlist.singlylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]) throws Exception
    {
        SinglyLinkedList obj = new SinglyLinkedList();

        Scanner sobj = new Scanner(System.in);
        int choice = 1;
        int value = 0;
        int pos = 0;

        System.out.println("Collection Framework");

        while(choice != 0)
        {
            System.out.println("__________________________");
            System.out.println("Enter your choice");
            System.out.println("__________________________");
            System.out.println("1 : Insert First");
            System.out.println("2 : Insert Last");
            System.out.println("3 : Insert at position");
            System.out.println("4 : Delete First");
            System.out.println("5 : Delete Last");
            System.out.println("6 : Delete at position");
            System.out.println("7 : Display");
            System.out.println("8 : Count");
            System.out.println("0 : Exit");
            System.out.println("__________________________");
            choice = sobj.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value");
                    value = sobj.nextInt();
                    obj.insertFirst(value);
                    break;

                case 2:
                    System.out.println("Enter the value");
                    value = sobj.nextInt();
                    obj.insertLast(value);
                    break;

                case 3:
                    System.out.println("Enter the value");
                    value = sobj.nextInt();

                    System.out.println("Enter the position");
                    pos = sobj.nextInt();
                    obj.insertAtPos(pos,value);
                    break;

                case 4:
                    obj.deleteFirst();
                    break;

                case 5:
                    obj.deleteLast();
                    break;

                case 6:
                    System.out.println("Enter the position");
                    pos = sobj.nextInt();
                    obj.deleteAtPos(pos);
                    break;

                case 7:
                    obj.display();
                    break;

                case 8:
                    System.out.println("Number of elements are : "+obj.count());
                    break;
            }
        }

        System.out.println("Thank you for using Collection Framework");

        obj.head = null;
    }
}

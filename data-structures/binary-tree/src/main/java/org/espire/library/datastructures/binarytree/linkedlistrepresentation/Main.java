package org.espire.library.datastructures.binarytree.linkedlistrepresentation;

public class Main {
        public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            BinaryTree.constructCompleteBinaryTree(head);
        }
    }


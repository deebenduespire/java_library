package org.espire.library.binarytree.linkedlistrepresentation;

import java.util.LinkedList;
import java.util.Queue;

import static org.espire.library.binarytree.linkedlistrepresentation.BinaryTree.constructCompleteBinaryTree;

public class Main {
        public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            constructCompleteBinaryTree(head);
        }
    }


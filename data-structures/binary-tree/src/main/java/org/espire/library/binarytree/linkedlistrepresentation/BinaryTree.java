package org.espire.library.binarytree.linkedlistrepresentation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + "");
            inOrder(root.right);
        }
    }

    public static void constructCompleteBinaryTree(ListNode head) {
        if (head == null) {
            return;
        }
        TreeNode root = new TreeNode(head.data);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (head != null) {
            TreeNode parent = q.poll();
            head = head.next;
            if (head != null) {
                TreeNode leftchild = new TreeNode(head.data);
                parent.left = leftchild;
                q.add(leftchild);
                head = head.next;
                if (head != null) {
                    // this node of the linked list is the right child of parent
                    TreeNode rightChild = new TreeNode(head.data);
                    parent.right = rightChild;
                    // add right child to the queue
                    q.add(rightChild);
                }
            }

        }
        System.out.println("Inorder Traversal");
        inOrder(root);
        System.out.println();
    }

    }


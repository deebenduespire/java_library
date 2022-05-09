package org.espire.library.binarytree.iterativepostorder;

import java.util.Stack;

public class PostOrder{
    Node root;
    public static void postOrderIterative(Node root) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        if (root == null)
            return;
        s1.push(root);
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            Node temp = s1.pop();
            s2.push(temp);
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
        while (!s2.isEmpty()) {
            Node temp = s2.pop();
            System.out.print(temp.data + " ");
        }
    }
}

package org.espire.library.datastructures.binarytree.iterativepreorder;

import java.util.Stack;

public class BinaryTree {
    TreeNode root;
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(6);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(2);

        root = first;
        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);
    }
    public void iterativePreOrder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.getData());
            if(temp.getRight()!=null){
                stack.push(temp.getRight());
            }
            if(temp.getLeft()!=null){
                stack.push(temp.getLeft());
            }

        }
    }
}

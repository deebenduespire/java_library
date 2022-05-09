package org.espire.library.datastructures.binarysearchtree.deletionoperation;

public class CreateBinaryTree {

    public Node createNewNode(int val){
        Node node = new Node();
        node.setData(val);
        node.left=null;
        node.right=null;
        return node;
    }


   public Node insert(Node node, int value) {
        if(node == null) {
            return createNewNode(value);
        }
        if(value<node.getData()){
            node.left=insert(node.left,value);
        }
        else if(value> node.getData()){
            node.right=insert(node.right,value);
        }
        return node;
    }
    public Node delete(Node node,int value) {
        if (node == null) {
            return null;
        }
        if (value < node.getData()) {
            node.left = delete(node.left, value);
        } else if (value > node.getData()) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null || node.right == null) {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                }
                // successor (smallest in the right subtree)
                value = minValue(node.right);

                // Delete the inorder successor
                node.right = delete(node.right,value);
            }
            }

        return node;

        }
        public int minValue(Node node){

        int minval = node.getData();
        while(node.left!=null){
            minval=node.left.getData();
            node=node.left;
        }
        return minval;


        }
        public void inOrder(Node node){
           if(node!=null){
               inOrder(node.left);
               System.out.println(node.getData() + " ");
               inOrder(node.right);
        }
        }
    }





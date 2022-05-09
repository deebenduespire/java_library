package org.espire.library.datastructures.binarytree.preorderbinarytree;



public class BinaryTree {
    RootNode root;
    public void createBinaryTree () {

        RootNode first = new RootNode(1);
        RootNode second = new RootNode(2);
        RootNode third = new RootNode(3);
        RootNode fourth = new RootNode(4);
        root = first;
        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);

    }
    public void preOrder(RootNode root){
        if(root==null){
            return;
        }
        System.out.print(root.getData()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());


    }
}

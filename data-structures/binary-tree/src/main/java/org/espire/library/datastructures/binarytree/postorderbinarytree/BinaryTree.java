package org.espire.library.datastructures.binarytree.postorderbinarytree;

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
    public void postOrder(RootNode root){
        if(root==null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData()+" ");

    }
}

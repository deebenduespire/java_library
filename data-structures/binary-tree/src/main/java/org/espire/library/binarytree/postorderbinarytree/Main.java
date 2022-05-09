package org.espire.library.binarytree.postorderbinarytree;

public class Main {
    public static void main(String args[]){

        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        tree.postOrder(tree.root);


    }
}

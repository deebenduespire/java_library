package org.espire.library.binarytree.preorderbinarytree;

public class Main {
    public static void main(String args[]){

        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        tree.preOrder(tree.root);

    }

}

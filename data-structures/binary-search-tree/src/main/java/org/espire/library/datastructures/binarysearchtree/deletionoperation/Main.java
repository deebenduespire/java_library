package org.espire.library.datastructures.binarysearchtree.deletionoperation;


public class Main {
    public static void main(String[] args){
        CreateBinaryTree bst = new CreateBinaryTree();
        Node root = null;
        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 10);
        root = bst.insert(root, 2);
        root = bst.insert(root, 1);
        root = bst.insert(root, 12);
        root = bst.delete(root,3);
        bst.inOrder(root);

    }
}

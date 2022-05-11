package org.espire.library.datastructures.binarysearchtree.minnode;

public class Main {
    public static void main(String[] args){
        Bst bst = new Bst();
        Node root=null;
        root=bst.insert(root,8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 10);
        root = bst.insert(root, 2);
        root = bst.insert(root, 1);
        root = bst.insert(root, 12);

        System.out.println(bst.getMin(root));
    }
}

package org.espire.library.datastructures.binarytree.preorderbinarytree;

public class RootNode {

    private RootNode root;
    private RootNode left;
    private RootNode right;
    private int data;

    public RootNode(int data) {
        this.data = data;
    }

    public RootNode getRoot() {
        return root;
    }

    public void setRoot(RootNode root) {
        this.root = root;
    }

    public RootNode getLeft() {
        return left;
    }

    public void setLeft(RootNode left) {
        this.left = left;
    }

    public RootNode getRight() {
        return right;
    }

    public void setRight(RootNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


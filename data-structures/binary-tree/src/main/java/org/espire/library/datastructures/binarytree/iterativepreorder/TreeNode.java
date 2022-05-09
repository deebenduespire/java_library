package org.espire.library.datastructures.binarytree.iterativepreorder;

public class TreeNode {
    private TreeNode root;
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

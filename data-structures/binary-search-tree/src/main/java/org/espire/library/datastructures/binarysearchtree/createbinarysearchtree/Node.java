package org.espire.library.datastructures.binarysearchtree.createbinarysearchtree;

public class Node {
  private int data;
   Node left;
   Node right;

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }


  @Override
  public String toString() {
    return "Node{" +
            "data=" + data +
            ", left=" + left +
            ", right=" + right +
            '}';
  }
}

package org.espire.library.datastructures.binarysearchtree.maxnode;

public class Bst {

    public Node createNewNode(int value){

        Node node = new Node();
        node.setData(value);
        node.left=null;
        node.right=null;
        return node;

    }
    public Node insert(Node node,int val){
        if(node==null){
            return createNewNode(val);
        }
        if(val> node.getData()){
            node.right=insert(node.right,val);
        }
        else if(val< node.getData()){
            node.left=insert(node.left,val);
        }
        return node;
    }
    public int getMax(Node node){
        if(node==null){
            System.out.println("tree is empty..");
            return -1;
        }
        while(node.right!=null){
            node=node.right;
        }
        return node.getData();
    }

}

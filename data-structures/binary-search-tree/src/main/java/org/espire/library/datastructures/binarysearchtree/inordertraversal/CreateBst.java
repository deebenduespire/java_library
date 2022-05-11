package org.espire.library.datastructures.binarysearchtree.inordertraversal;


public class CreateBst {

    public Node createNewNode(int val){
        Node node = new Node();
        node.setData(val);
        node.left=null;
        node.right=null;
        return node;
        }


        public Node insert(Node node,int value) {
            if (node == null) {
                return createNewNode(value);
            }
            if(value<node.getData()){
                node.left=insert(node.left,value);
            }
            else if(value> node.getData()){
                node.right=insert(node.right,value);
            }
            return node;
        }

        public void inOrder(Node node){
            if(node==null){
                return;
            }
            inOrder(node.left);
            System.out.println(node.getData()+" ");
            inOrder(node.right);

        }

    }


package ru.perepelitsina.part1.lesson32;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }
    public Tree(){
        root = null;
    }
    public void insert(int i){
        Node newNode = new Node();
        newNode.iData = i;
        if(root==null){
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if (i > current.iData){
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                } else {
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
            }
        }
    }
}

package ru.perepelitsina.part1.lesson32;

//Программа для подсчета листовых узлов в двоичном дереве в Java.
public class Task1 {
    private static int x;
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(12);
        tree.insert(37);
        tree.insert(43);
        tree.insert(30);
        tree.insert(33);
        tree.insert(87);
        tree.insert(93);
        tree.insert(97);
        tree.insert(10);
        tree.insert(15);
        tree.insert(27);
        tree.insert(40);
        tree.insert(45);
        Node current = tree.getRoot();
        System.out.println("Листовых узлов в двоичном дереве - " + numberOfLeaves(current));
    }
    private static int numberOfLeaves(Node cur){
        Node left = cur.leftChild;
        Node right = cur.rightChild;
        if (left == null && right == null){
            x++;
        } else {
            if (right != null){
                 x = numberOfLeaves(right);
            }
            if (left != null){
                x = numberOfLeaves(left);
            }
        }
        return x;
    }
}

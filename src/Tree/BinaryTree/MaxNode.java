package Tree.BinaryTree;

import java.util.Scanner;

public class MaxNode {
    static Scanner sc=null;

    static class Node{
        int element;
        Node left;
        Node right;
        Node(int element){
            this.element=element;
        }
    }

    private Node root;

    Node insert(int data){
        Node root;

        if(data==-1) return null;

        root= new Node(data);

        System.out.println("Enter left for " + data);
        root.left= insert(sc.nextInt());

        System.out.println("Enter right for " + data);
        root.right= insert(sc.nextInt());

        return root;
    }

    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public int max(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.element,Math.max(max(root.left),max(root.right)));
    }

    public int min(Node root){
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.element,Math.min(min(root.left),min(root.right)));
    }

    public static void main(String[] args) {
        sc= new Scanner(System.in);
        MaxNode t= new MaxNode();

        System.out.println("Enter data: ");
        t.root=t.insert(sc.nextInt());

        preOrder(t.root);
        System.out.println();

        System.out.println("Max Node of tree = "+ t.max(t.root));
        System.out.println("Min Node of tree = "+ t.min(t.root));
    }
}

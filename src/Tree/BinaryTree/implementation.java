package Tree.BinaryTree;

import java.util.Scanner;

public class implementation {
    static Scanner sc=null;

    class Node{
        int element;
        Node left,right;
        Node(int element){
            this.element=element;
        }
    }

    private Node root;


    Node insert(int data){
        Node root=null;

        if(data==-1) return null;

        root= new Node(data);

        System.out.println("Enter left for " + data);
        root.left= insert(sc.nextInt());

        System.out.println("Enter right for " + data);
        root.right= insert(sc.nextInt());

        return root;
    }

    public static void inOrder(Node root){
        if(root==null) return;
        System.out.print(root.element + " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        sc= new Scanner(System.in);
        implementation t= new implementation();

        System.out.println("Enter data: ");
        t.root=t.insert(sc.nextInt());

        inOrder(t.root);

        System.out.println();
    }
}

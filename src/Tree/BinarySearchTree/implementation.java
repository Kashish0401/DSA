package Tree.BinarySearchTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class implementation{
    class Node{
        int element;
        Node left,right;

        public Node(int e,Node left,Node right){
            element=e;
            this.left=left;
            this.right=right;
        }
    }

    private Node root;

    public implementation(){
        root=null;
    }

    public Node insert(Node tempRoot,int e){
        if(tempRoot!=null){
            if(e== tempRoot.element)
                return null;
            else if(e< tempRoot.element)
                tempRoot.left=insert(tempRoot.left,e);
            else if(e> tempRoot.element)
                tempRoot.right=insert(tempRoot.right,e);
        }
        else{
        Node n=new Node(e,null,null);
        if(root==null)
            root=n;
        tempRoot=n;
        }
        return tempRoot;
    }

    public Node search(Node tempRoot,int e){
        if(tempRoot!=null) {
            if (e == tempRoot.element) {
                System.out.println("Found");
                return tempRoot;
            }
            if (e < tempRoot.element) {
                tempRoot.left = search(tempRoot.left, e);
            }
            if (e > tempRoot.element) {
                tempRoot.right = search(tempRoot.right, e);
            }
        }
        return null;
    }

    public void inorder(Node tempRoot){
        if(tempRoot!=null){
            inorder(tempRoot.left);
            System.out.print(tempRoot.element + " ");
            inorder(tempRoot.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        implementation b= new implementation();
        System.out.println("Enter no of elements");
        int n= sc.nextInt();
        System.out.println("Enter the elements to be inserted in BST order");
        for(int i=0;i<n;i++)
        b.insert(b.root,sc.nextInt());
        System.out.print("\nInOrder -> ");
        b.inorder(b.root);
        System.out.println("\nEnter element to be searched");
        b.search(b.root,sc.nextInt());

        //System.out.print("/nPreOrder -> ");
    }
}


/* Enter no of elements
7
Enter the elements to be inserted in BST order
5 3 8 1 4 6 9

InOrder -> 1 3 4 5 6 8 9
Enter element to be searched
9
Found */
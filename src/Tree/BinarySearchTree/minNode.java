package Tree.BinarySearchTree;

import java.util.Scanner;

public class minNode {
    class Node{
        Node right,left;
        int element;
        Node(int e){
            this.element=e;
            left=right=null;
        }
    }

    private Node root;

    minNode(){
        root=null;
    }

    public Node insert(Node root, int e){
        if(root==null){
            Node n= new Node(e);
            root=n;
            if(this.root==null)
                this.root=n;
        }
        else if(e<root.element)
            root.left=insert(root.left,e);
        else if(e>root.element)
            root.right=insert(root.right,e);
        return root;
    }

    public int min(Node root){
        Node curr= root;
        while(curr.left!=null){
            curr=curr.left;
        }
        return curr.element;
    }

    public int max(Node root){
        Node curr= root;
        while(curr.right!=null){
            curr=curr.right;
        }
        return curr.element;
    }

    public void preOrder(Node root){
        if(root!=null) {
            System.out.print(root.element + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        minNode t= new minNode();
        Scanner sc= new Scanner(System.in);
        int x;
        while(true){
            System.out.println("Enter data");
            x=sc.nextInt();
            if(x==-1)
                break;
            t.insert(t.root,x);
        }
        System.out.println(t.min(t.root));
        System.out.println(t.max(t.root));
        t.preOrder(t.root);
    }
}

package Tree.BinarySearchTree;

import java.util.Scanner;

public class checkBST {
    class Node{
        Node right,left;
        int element;
        Node(int element){
            this.element=element;
            left=right=null;
        }
    }

    private Node root;

    public checkBST(){
        root=null;
    }

    public Node insert(Node root, int e){
        if(root==null){
            Node n= new Node(e);
            if(this.root==null)
                this.root=n;
        root=n;
        }

        else if(e<root.element)
            root.left=insert(root.left,e);
        else if(e>root.element)
            root.right=insert(root.right,e);

        return root;
    }

    public boolean isBST(Node root, int max, int min){
        if(root==null)
            return true;
        if(root.element <min || root.element> max)
            return false;

        return(isBST(root.left,root.element-1,min) && isBST(root.right,max, root.element+1));
    }

    Node prev=null;
    public boolean isBST2(Node root){
        if(root!=null){
            isBST2(root.left);
            if(prev!=null && root.element <= prev.element)
                return false;
            prev = root;
            isBST2(root.right);
        }
        return true;
    }
    public void inOrder(Node root){
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.element + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        checkBST b= new checkBST();
        Scanner sc= new Scanner(System.in);
        int x;
        while(true){
            System.out.println("Enter data");
            x=sc.nextInt();
            if(x== -1)
                break;
            b.insert(b.root,x);
        }
        b.inOrder(b.root);
        System.out.println(b.isBST(b.root,Integer.MAX_VALUE,Integer.MIN_VALUE));
        System.out.println(b.isBST2(b.root));
    }
}

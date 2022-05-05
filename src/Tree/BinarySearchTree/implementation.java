package Tree.BinarySearchTree;

import java.util.Scanner;

public class implementation{
    class Node{
        int element;
        Node left,right;

        public Node(int e){
            element=e;
            left=right=null;
        }
    }

    private Node root;

    public implementation(){
        root=null;
    }

    public Node insert(Node root ,int e){
        if(root==null){
            Node n = new Node(e);
            root=n;
            if(this.root==null)
                this.root=n;
            return root;
        }
        else if(root.element<e)
            root.right=insert(root.right,e);
        else if(root.element>e)
            root.left=insert(root.left,e);

        return root;
    }

    public static Node delete(Node root, int e){
         if(root==null)
             return root;
         if(e<root.element)
             root.left=delete(root.left,e);
         else if(e>root.element)
             root.right=delete(root.right,e);
         else{
             if(root.right==null)
                 return root.left;
             else if(root.left==null)
                 return root.right;

             root.element=minValue(root.right);
             root.right=delete(root.right,root.element);
         }
         return root;
    }

    public static int minValue(Node root){
        int minv=root.element;
        while(root.left!=null){
            minv=root.left.element;
            root=root.left;
        }
        return minv;
    }


    public Node search(Node root,int e){
        if(root!=null) {
            if (e == root.element) {
                System.out.println("Found");
                return root;
            }
            if (e < root.element) {
                root.left = search(root.left, e);
            }
            if (e > root.element) {
                root.right = search(root.right, e);
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

    public void postOrder(Node tempRoot){
        if(tempRoot!=null){
            postOrder(tempRoot.left);
            postOrder(tempRoot.right);
            System.out.print(tempRoot.element + " ");
        }
    }

    public void preOrder(Node tempRoot){
        if(tempRoot!=null){
            System.out.print(tempRoot.element + " ");
            preOrder(tempRoot.left);
            preOrder(tempRoot.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        implementation b= new implementation();
        int e;
        while (true) {
            System.out.println("Enter element");
            e=sc.nextInt();
            if(e==-1)
                break;
            b.insert(b.root,e);
        }
        System.out.print("\nInOrder -> ");
        b.inorder(b.root);
        System.out.print("\nPreOrder -> ");
        b.preOrder(b.root);
        System.out.print("\nPostOrder -> ");
        b.postOrder(b.root);

        System.out.println("\nEnter element to be searched");
        b.search(b.root,sc.nextInt());

        System.out.println("Enter an element to be deleted");
        b.delete(b.root,sc.nextInt());

        System.out.print("\nInOrder -> ");
        b.inorder(b.root);
    }
}


/* Enter element
5 3 8 1 4 6 9

InOrder -> 1 3 4 5 6 8 9
PreOrder -> 5 3 1 4 8 6 9
PostOrder -> 1 4 3 6 9 8 5
Enter element to be searched
9
Found
Enter an element to be deleted
2

InOrder -> 3 4 5 6 8 9
*/
package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static Scanner sc=null;

    static class Node{
        int element;
        Node left,right;
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

    public static void levelOrder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr= q.poll();
            if(curr==null){
                if(q.isEmpty()) break;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.element + " ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        sc= new Scanner(System.in);
        BFS t= new BFS();

        System.out.println("Enter data: ");
        t.root=t.insert(sc.nextInt());

        levelOrder(t.root);
        System.out.println();
    }
}

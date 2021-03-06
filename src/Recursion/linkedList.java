package Recursion;

public class linkedList{

    class Node{
        Node next;
        int element;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public linkedList(){
        head=tail=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int length(Node p){
        if(p!=null){
            return 1+length(p.next);
        }
        return 0;
    }

    public void addLast(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size=size+1;
    }

    public void display(Node p){
        if(p!=null){
            System.out.print(p.element+ " ");
            display_recursive(p.next);
        }
        return;
    }

    public void display_recursive(Node p){
        if(p!=null){
            display_recursive(p.next);
            System.out.print(p.element+ " ");
        }
        return;
    }

    public static void main(String[] args) {
        linkedList l=new linkedList();
        l.addLast(7);
        l.addLast(12);
        l.addLast(4);
        l.addLast(45);
        l.display(l.head);
        System.out.println();
        l.display_recursive(l.head);
        System.out.println();
        System.out.println(l.length(l.head));
    }
}


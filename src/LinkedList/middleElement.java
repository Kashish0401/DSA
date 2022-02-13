package LinkedList;

import java.util.Scanner;

public class middleElement {
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

    public middleElement(){
        head=null;
        tail=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
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

    public void findMiddle(){
        Node p=head;
        for(int i=0;i< (length()/2)-1; i++){
            p=p.next;
        }
        if(length()%2==0)
            System.out.println(p.element);
        else if(length()%2!=0 && length()!=1)
            System.out.println(p.next.element);
        else
            System.out.println(p.element);
    }

    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        middleElement l=new middleElement();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            l.addLast(sc.nextInt());
        l.display();
        l.findMiddle();
    }
}

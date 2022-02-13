package DoublyLinkedList;

import java.util.Scanner;

public class insertAtFirst{
    class Node{
        Node next, prev;
        int element;
        Node(int e, Node n, Node p){
            element=e;
            next=n;
            prev=p;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public insertAtFirst(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    public void addFirst(int e){
        Node newest= new Node(e,null,null);
        if(isEmpty()){
            tail=newest;
        }
        else{
            newest.next=head;
            head.prev=newest;
        }
        head=newest;
        size++;
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
        insertAtFirst l= new insertAtFirst();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            l.addFirst(sc.nextInt());
        l.display();
    }
}


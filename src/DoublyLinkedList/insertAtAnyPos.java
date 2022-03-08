package DoublyLinkedList;

import LinkedList.delAtAnyPosition;

import java.util.Scanner;

public class insertAtAnyPos{
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

    public insertAtAnyPos(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    public void addLast(int e){
        Node newest= new Node(e,null,null);
        if(isEmpty()){
            head=newest;
        }
        else{
            tail.next=newest;
            newest.prev=tail;
        }
        tail=newest;
        size++;
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

    void addAny(int e, int pos){
        Node newest=new Node(e,null,null);
        if(pos==1){
            addFirst(e);
        }
        else if(pos==length()+1){
            addLast(e);
        }
        else{
            Node p=head;
            for(int i=1;i<pos-1;i++){
                p=p.next;
            }
            newest.next=p.next;
            p.next.prev=newest;
            p.next=newest;
            newest.prev=p;
            size++;
        }
    }

    public int removeLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e=tail.element;
        tail=tail.prev;
        size--;
        if(isEmpty()){
            head=null;
            return e;
        }
        tail.next=null;
        return e;
    }

    public int removeFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
            return -1;
        }
        int e=head.element;
        head=head.next;
        head.prev=null;
        size--;
        if(isEmpty())
            head=null;
        return e;
    }

    public int removeAny(int pos){
        if(pos<1 || pos> length()+1){
            System.out.println("Invalid position");
            return -1;
        }
        if(pos==size){
            return removeLast();
        }
        if(pos==1){
            return removeFirst();
        }
        Node p=head;
        for(int i=1;i<pos-1;i++){
            p=p.next;
        }
        int e=p.next.element;
        p.next=p.next.next;
        p.next.prev=p;
        size--;
        return e;
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
        insertAtAnyPos l= new insertAtAnyPos();
        l.addFirst(12);
        l.addFirst(15);
        l.addFirst(17);
        l.addFirst(19);
        l.addFirst(25);
        //l.addAny(20,3);
        //int e= l.removeAny(6) ;
        l.display();
        //System.out.println("Removed element: "+e);
        //System.out.println(l.length());
        System.out.println(l.removeAny(3));;
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l.removeAny(1));
        System.out.println(l.removeLast());
        l.display();
        System.out.println(l.removeLast());
    }
}

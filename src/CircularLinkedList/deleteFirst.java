package CircularLinkedList;

import java.util.Scanner;

public class deleteFirst {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private static Node head;
    private static Node tail;
    private static int size;

    public deleteFirst(){
        head=tail=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public static boolean isEmpty(){
        return size==0;
    }

    void addLast(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=newest.next=newest;
        else
            tail.next=newest;
        tail=newest;
        size++;
    }

    static int removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e=head.element;
        head=head.next;
        tail.next=head.next;
        size--;
        if(isEmpty())
            head=tail=null;
        return e;
    }

    void display(){
        Node p=head;
        for(int i=0;i<length();i++){
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteFirst l=new deleteFirst();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        l.removeFirst();
        l.display();
    }
}

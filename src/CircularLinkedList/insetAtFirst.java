package CircularLinkedList;

import java.util.Scanner;

public class insetAtFirst {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public insetAtFirst(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    void addFirst(int e){
        Node newest= new Node(e,null);
        if(isEmpty()){
            head=tail=newest.next=newest;
        }
        else{
            newest.next=head;
            head=tail.next=newest;
        }
        size++;
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
        insetAtFirst l= new insetAtFirst();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.addFirst(sc.nextInt());
        }
        l.display();
    }
}

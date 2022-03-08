package CircularLinkedList;

import java.util.Scanner;

public class deleteANyPosition {
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

    public deleteANyPosition(){
        head=tail=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    void addAny(int e, int pos){
        Node newest= new Node(e,null);
        if(pos < 1 || pos > length() +1)
            System.out.println("Invalid");
        else{
            if(isEmpty())
                head=tail=newest.next=newest;
            else if(pos==1){
                newest.next=head;
                head=newest;
            }
            else{
                Node p= head;
                for(int i=1;i<pos-1;i++)
                    p=p.next;
                newest.next=p.next;
                p.next=newest;
            }
            size++;
            if(pos==length())
                tail=newest;
        }
    }

    public int removeANy(int pos) {
        if (isEmpty()) {
            System.out.println("Empty");
            return 0;
        }
        if(pos>size){
            return 0;
        }
        if(pos==1){
            deleteFirst.removeFirst();
        }
        Node p = head;
        for (int i = 1; i < pos - 1; i++)
            p = p.next;
        p.next = p.next.next;
        if(pos==length()){
        p.next=head;
        }
        size--;
        return 1;
    }

    void display(){
        Node p=head;
        for(int i=0;i<length();i++) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        deleteANyPosition l= new deleteANyPosition();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            l.addAny(sc.nextInt(),i+1);
        l.addAny(20,3);
        l.removeANy(1) ;
        l.display();
        System.out.println(l.length());
    }
}

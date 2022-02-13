package CircularLinkedList;

import java.util.Scanner;

public class insertAtAnyPosition {
    static class Node{
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

    public insertAtAnyPosition(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
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

    void display(){
        Node p=head;
        for(int i=0;i<length();i++)
        {
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtAnyPosition l= new insertAtAnyPosition();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            l.addAny(sc.nextInt(),i);
        }
        l.addAny(33,6);
        l.display();
    }
}

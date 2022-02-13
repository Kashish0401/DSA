package LinkedList;

import java.util.Scanner;  //not finished

public class insertSorted {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public insertSorted(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    void addAny(int e, int pos){        //works for all positions
        Node newest= new Node(e,null);
        if(isEmpty()){
            head=tail=newest;
            size++;
        }
        else if(pos==1) {
            newest.next=head;
            head=newest;
        }
        else{
            Node p = head;
            int i=1;
            while(i<pos-1){
                p=p.next;
                i++;
            }
            newest.next=p.next;
            p.next=newest;
            size++;
            if(pos==length())
                tail=newest;
        }
    }

    void insert(int e){
        Node newest= new Node(e,null);
        if(isEmpty()){
            head=tail=newest;
        }
        else{
            Node p=head, q=head;
            while(p.element< newest.element && p.next!=null){
                q=p;
                p=p.next;
            }
            if(p.next==null)
            {
                tail=newest;
            }
            newest.next=p.next;
            p.next=newest;
            size++;
        }
    }

    void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertSorted l=new insertSorted();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            l.addAny(sc.nextInt(),i+1);
        l.insert(3);
        //l.addAny(55,1);
        //l.addAny(99,8);
        l.display();
    }
}

package LinkedList;

import java.util.Scanner;

public class search {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element = e;
            next= n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public search(){
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
        else if(pos==1){
            head=tail=newest;
            head=newest;
            size++;
        }
        else {
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

    void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    int searchNumber(int s){
        Node p=head;
        int i=1;
        while(p!=null){
            if(p.element == s)
                return i;
            p=p.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        search l= new search();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total no of elements");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            l.addAny(sc.nextInt(),i);
        l.display();
        System.out.println("Enter umber to be searched");
        int s=sc.nextInt();
        s=l.searchNumber(s);
        if(s!= -1)
            System.out.println("Number found at position: "+ s);
        else
            System.out.println("Not found");
    }
}

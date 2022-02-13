package LinkedList;

public class insertFirst {
    class Node{
        int element;
        Node next;
        public Node(int e,Node n){
            element=e;
            next=n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public insertFirst(){
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
        if(isEmpty()) {
            head=newest;
            tail = newest;
        }
        else {
            newest.next=head;
            head=newest;
        }
        size=size + 1;
    }

    void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            //System.out.println(p.next);
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertFirst l=new insertFirst();
        l.addFirst(7);
        l.addFirst(4);
        l.addFirst(12);
        l.addFirst(5);
        l.display();
        System.out.println("Size: " +l.length());
    }
}

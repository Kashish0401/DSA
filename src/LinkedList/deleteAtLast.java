package LinkedList;

public class deleteAtLast {
    class Node{
        int element;
        Node next;
        public Node(int e,Node n){
            element = e;
            next =n;
        }
    }
     private Node head;
    private Node tail;
    private int size;

    public deleteAtLast(){
        head=tail=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    void addLast(int e){
        Node newest = new Node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size++;
    }

    void addFirst(int e){
        Node newest= new Node(e,null);
        if(isEmpty()){
            head=tail=newest;
        }
        else{
            newest.next=head;
            head=newest;
        }
        size++;
    }

    void addAny(int e, int pos){
        Node newest = new Node(e,null);
        Node p=head;
        int i=1;
        while(i<pos-1){
            p=p.next;
            i++;
        }
        newest.next=p.next;
        p.next=newest;
        size++;
    }

    public int removeFirst(){
        if(isEmpty()){
            System.out.println("Empty list");
            return -1;
        }
        int e=head.element;
        head=head.next;
        size--;
        if(isEmpty())
            tail=null;
        return e;
    }

    public int removeLast(){
        if(tail==null){
            System.out.println("List is empty");
            return -1;
        }
        int e= tail.element;
        Node p=head;
        int i=1;
        while(i<length()-1){
            p=p.next;
            i=i+1;
        }
        tail=p;
        p.next=null;
        size--;
        if(isEmpty()){
            head=null;
        }
        return e;
    }

    void display(){
        Node p= head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteAtLast l= new deleteAtLast();
        l.addFirst(7);
        l.addLast(4);
        l.addFirst(12);
        l.addFirst(5);
        l.addFirst(3);
        l.addAny(20,3);
        int e= l.removeLast() ;
        l.display();
        //System.out.println("Removed element: "+e);
        //System.out.println(l.length());
    }
}

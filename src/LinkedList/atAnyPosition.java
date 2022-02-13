package LinkedList;

public class atAnyPosition {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element= e;
            next=n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public atAnyPosition(){
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
        if(pos == 0) {
            // System.out.println("Invalid Position! Index starts from 1.";
            return;
        }
        if (pos == 1) {
            addFirst(e);
            return;
        }
        if (pos > size) {
            // System.out.println("Invalid Position! List Size is -> " + size);
            return;
        }
        Node newest = new Node(e,null);
        Node p=head;
        int i=1;
        while(i<pos-1){
            p=p.next;
            i++;
        }
        newest.next= p.next;
        p.next=newest;
        size=size+1;
    }

    public void addLast(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size=size+1;
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

    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        atAnyPosition l= new atAnyPosition();
        l.addFirst(7);
        l.addFirst(4);
        l.addFirst(12);
        l.addFirst(5);
        l.addAny(20,3);
        l.display();
        System.out.println(l.length());
    }
}

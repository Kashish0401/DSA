package LinkedList;

public class deleteAtFirst {
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

    public deleteAtFirst(){
        head=tail=null;
        size=0;
    }

    boolean isEmpty(){
        return size==0;
    }

    int length(){
        return size;
    }

    void display(){
        Node p = head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    void addFirst(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=tail=newest;
        else {
            newest.next = head;
            head = newest;
        }
        size++;
    }

    void addLast(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size++;
    }

    void addAny(int e, int pos){
        Node newest= new Node(e,null);
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

    int removeFirst() {
        if (isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int e= head.element;
        head = head.next;
        size--;
        if(isEmpty())
            tail=null;
        return e;
    }

    public static void main(String[] args) {
        deleteAtFirst l= new deleteAtFirst();
        l.addFirst(7);
        l.addLast(4);
        l.addFirst(12);
        l.addFirst(5);
        l.addFirst(00);
        l.addAny(20,3);
        int e= l.removeFirst() ;
        l.display();
        System.out.println("Removed element: "+e);
        System.out.println(l.length());
    }
}
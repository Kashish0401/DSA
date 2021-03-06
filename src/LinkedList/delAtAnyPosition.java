package LinkedList;

public class delAtAnyPosition {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element = e;
            next =n;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public delAtAnyPosition(){
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
        if(isEmpty()){
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

    public int removeAny(int pos){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        if (pos < 1 || pos > length()) {
            System.out.println("Invalid position");
            return -1;
        }
        if(pos==1){
            removeFirst();
        }
        Node p=head;
        int i=1;
        while(i<pos-1){
            p=p.next;
            i++;
        }
        int e=(p.next).element;
        p.next=(p.next).next;
        size--;
        if(size==1){
            tail=head;
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
        delAtAnyPosition l= new delAtAnyPosition();
        //l.addFirst(12);
        //l.addFirst(15);
        //l.addFirst(17);
        l.addFirst(19);
        l.addFirst(25);
        //l.addAny(20,3);
        //int e= l.removeAny(6) ;
        l.display();
        //System.out.println("Removed element: "+e);
        //System.out.println(l.length());
        //System.out.println(l.removeAny(3));;
        //System.out.println(l.removeFirst());
        //System.out.println(l.removeLast());
        System.out.println(l.removeAny(1));
        //System.out.println(l.removeLast());
        l.display();
        //System.out.println(l.removeLast());
    }
}
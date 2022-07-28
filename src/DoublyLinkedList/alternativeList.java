package DoublyLinkedList;

public class alternativeList {
    class Node {
        int element;
        Node next, prev;

        Node(int e) {
            element = e;
            next = prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    private Node head2;
    private Node tail2;

    alternativeList() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    void insertLast(int e) {
        Node newest = new Node(e);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
            newest.prev = tail;
        }
        tail = newest;
        size++;
    }

    void insertFirst(int e) {
        Node newest = new Node(e);
        if (isEmpty()) {
            tail = newest;
        } else {
            newest.next = head;
            head.prev = newest;
        }
        head = newest;
        size++;
    }

    void addAny(int e, int pos) {
        if (isEmpty() || pos == 1)
            insertFirst(e);
        else if (pos == length() + 1)
            insertLast(e);
        else {
            Node newest = new Node(e);
            Node p = head;
            int i = 1;
            while (i < pos - 1) {
                p = p.next;
                i++;
            }
            newest.next = p.next;
            p.next.prev = newest;
            p.next = newest;
            newest.prev = p;
            size++;
        }
    }

    public int removeFirst() {
        if (isEmpty())
            return -1;

        int e = head.element;
        head = head.next;
        head.prev = null;
        size--;
        if (isEmpty())
            tail = null;
        return e;
    }

    int removeLast(){
        if(isEmpty())
            return -1;
        int e=tail.element;
        tail=tail.prev;
        tail.next=null;
        size--;
        if(isEmpty())
            head=null;
        return e;
    }

    int removeAny(int pos){
        if(pos==1)
            removeFirst();
        if(pos==length())
            removeLast();
        Node p=head;
        int i=1;
        while(i<pos-1){
            p=p.next;
        }
        int e=p.next.element;
        p.next=p.next.next;
        p.next.prev=p;
        size--;
        return e;
    }

    int alternative(int pos){
        int i=1;
        Node p=head;
        while(i<pos){
            p=p.next;
        }
        System.out.print(p.element + " ");
        return p.element;
    }

    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }
}

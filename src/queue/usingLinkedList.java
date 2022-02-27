package queue;

public class usingLinkedList {
    class Node{
        Node next;
        int element;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public usingLinkedList(){
        front=rear=null;
        size=0;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int e){
        Node newest= new Node(e,null);
        if(isEmpty()){
            front=newest;
        }
        else
            rear.next=newest;
        rear=newest;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int e=front.element;
        front= front.next;
        size--;
        if(isEmpty()){
            rear=null;
        }
        return e;
    }

    public void display(){
        if(isEmpty())
            return;
        Node p=front;
        while(p!=null){
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        usingLinkedList q= new usingLinkedList();
        System.out.println(q.dequeue());
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(18);
        q.display();
        q.enqueue(20);
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.size);
        System.out.println(q.dequeue());
    }
}

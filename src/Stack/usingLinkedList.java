package Stack;

public class usingLinkedList {
    class Node{
        int element;
        Node next;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private Node top;
    private int size;

    public usingLinkedList(){
        top=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(int e){
        Node newest= new Node(e,null);
        if(isEmpty()){
            top=newest;
        }
        else{
            newest.next=top;
            top=newest;
        }
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int e= top.element;
        top=top.next;
        size--;
        return e;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.element;
    }

    public void display(){
        Node p=top;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        usingLinkedList s= new usingLinkedList();
        s.push(5);
        s.push(4);
        s.push(67);
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(33);
        s.display();
        System.out.println(s.length());
    }
}

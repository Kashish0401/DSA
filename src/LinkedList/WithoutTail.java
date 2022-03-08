package LinkedList;

import java.util.Scanner;

public class WithoutTail {
    class Node {
        Node next;
        int element;

        public Node(Node n, int e) {
            next = n;
            element = e;
        }
    }
        private Node head;
        private int size;

        public WithoutTail(){
            head=null;
            size=0;
        }

        boolean isEmpty(){
            return size==0;
        }

        void addLast(int e){
            Node newest= new Node(null,e);
            if(isEmpty()){
                head=newest;
                size++;
            }
            else {
                Node p = head;
                for(int i=1;i<=size-1;i++){
                    p=p.next;
                }
                p.next=newest;
                size++;
            }
        }

        int removeLast(){
            Node p=head;
            for(int i=1;i<size-1;i++){
                p=p.next;
            }
            int e=p.next.element;
            p.next=null;
            return e;
        }
        void display(){
            Node p=head;
            while(p!=null){
                System.out.print(p.element+ " ");
                p=p.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        WithoutTail l= new WithoutTail();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        System.out.println(l.removeLast());
        l.display();
    }
}

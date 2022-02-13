package CircularLinkedList;

import java.util.Scanner;

public class deleteLast {
    class Node{
        int element;
        insertAtAnyPosition.Node next;
        public Node(int e, insertAtAnyPosition.Node n){
            element=e;
            next=n;
        }
    }

    private insertAtAnyPosition.Node head;
    private insertAtAnyPosition.Node tail;
    private int size;

    public deleteLast(){
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
        insertAtAnyPosition.Node newest= new insertAtAnyPosition.Node(e,null);
        if(pos < 1 || pos > length() +1)
            System.out.println("Invalid");
        else{
            if(isEmpty())
                head=tail=newest.next=newest;
            else{
                insertAtAnyPosition.Node p= head;
                for(int i=1;i<pos-1;i++)
                    p=p.next;
                newest.next=p;
                p.next=newest;
            }
            size++;
            if(pos==length())
                tail=newest;
        }
    }

    public int removeLast(){
        if(isEmpty()){
            System.out.println("List empty");
            return -1;
        }
        else {
            int e= tail.element;
            insertAtAnyPosition.Node p = head;
            for (int i = 1; i < length() - 1; i++) {
                p = p.next;
            }
            p.next = head;
            tail=p;
            //System.out.println(p.element+ " "+ tail.element + " " +p.next.element);  //it was just to check whether it was working perfectly or not
            size--;
            if(isEmpty())
                head=tail=null;
            return e;
        }
    }

    void display(){
        insertAtAnyPosition.Node p=head;
        for(int i=0;i<length();i++)
        {
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteLast l= new deleteLast();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            l.addAny(sc.nextInt(),i);
        }
        l.removeLast();
        l.display();
    }
}

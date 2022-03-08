package CircularLinkedList;

import java.util.Scanner;

public class withoutTAil {

    private insertAtLast.Node head;
    //private insertAtLast.Node tail;
    private int size;

    public withoutTAil(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    void addLast(int e){
        insertAtLast.Node newest = new insertAtLast.Node(e,null);
        if(isEmpty()){
            head=newest.next=newest;
        }
        else{
            insertAtLast.Node p= head;
            for(int i=1;i<size;i++){
                p=p.next;
            }
            p.next=newest;
            newest.next=head;
        }
        size++;
    }

    void display(){
        insertAtLast.Node p=head;
        for(int i=0;i<length();i++)
        {
            System.out.print(p.element+ " ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        withoutTAil l= new withoutTAil();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.addLast(sc.nextInt());
        }
        l.display();
    }
}

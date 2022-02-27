package queue;

import java.util.Scanner;

public class UsingArray {
    private int data[];
    private int rear, front;

    public UsingArray(int n){
        data=new int[n];
        rear=front=-1;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return rear==data.length-1;
    }

    public void enqueue(int e){
        if(isEmpty()){
            front++;
        }
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        data[rear]=e;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int e=data[front];
        front++;
        if(front>rear){
            front=rear=-1;
        }
        return e;
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        UsingArray q= new UsingArray(n);
        System.out.println(q.dequeue());
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(18);
        q.display();
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

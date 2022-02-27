package Stack;

import java.util.Scanner;

public class usingArrays {
    private int data[];
    private int top;

    public usingArrays(int n){
        data= new int[n];
        top=0;
    }

    public int length(){
        return top;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public boolean isFull(){
        return top== data.length;
    }

    public void push(int e){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }

        data[top]=e;
        top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        top--;
        return data[top];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is EMpty");
            return -1;
        }

        return data[top-1];
    }

    public void display(){
        for(int i=top-1;i>=0;i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        usingArrays s= new usingArrays(n);
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

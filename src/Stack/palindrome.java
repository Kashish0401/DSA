package Stack;

import java.util.Scanner;

public class palindrome {
    class Node{
        char element;
        Node next;
        public Node(char e, Node n){
            element=e;
            next=n;
        }
    }

    private Node top;
    private int size;

    public palindrome(){
        top=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(char e){
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

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 'b';
        }
        char e= top.element;
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
        palindrome s = new palindrome();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str= String.valueOf(num);

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        String str2= "";
        for(int i=0;i<str.length();i++)
            str2 += s.pop();
        if(str.equals(str2))
            System.out.println("Palindrome");
        else
            System.out.println("NOt");
    }
}


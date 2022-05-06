package Stack;

import java.util.Scanner;

public class parenthesisCheck {
    class Node{
        char element;
        Node next;
        public Node(char c){
            this.element=c;
            next=null;
        }
    }

    private Node top;
    private int size;

    public parenthesisCheck(){
        top=null;
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(char c){
        Node newest= new Node(c);
        if(isEmpty())
            top=newest;
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
        char c= top.element;
        top=top.next;
        size--;
        return c;
    }

    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 'b';
        }
        return top.element;
    }

    boolean isOpen(char c){
        return c=='(' || c=='[' || c=='{';
    }

    boolean isClose(char c, char c2){
        return ((c==')' && c2=='(') || (c=='}' && c2=='{') || (c==']' && c2=='['));
    }

    boolean isMatch(String str){
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(isOpen(ch))
                push(ch);
            else{
                if(isEmpty())
                    return false;
                else if (!(isClose(ch,peek())))
                    return false;
                else
                    pop();
            }
        }
        return isEmpty();
    }

    public static void main(String[] args) {
        parenthesisCheck p= new parenthesisCheck();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");

        String str= sc.next();
        System.out.println(p.isMatch(str));
    }
}

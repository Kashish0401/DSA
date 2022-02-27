package Recursion;

import java.util.Scanner;

public class fibonacci {

    static int fib(int n){
        if(n<=2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        System.out.print(fib(i) +" ");
    }
}

package Recursion;

import java.util.Scanner;

public class factorial {
    int fact(int n)
    {
        if(n>0)
            return fact(n-1)*n;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorial obj= new factorial();
        int n=sc.nextInt();
        System.out.println(obj.fact(n));
    }
}

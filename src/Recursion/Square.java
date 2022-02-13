package Recursion;

import java.util.Scanner;

public class Square {
    void sqnum(int n)
    {
        if(n>0)
        {
            int k=n*n;
            System.out.println(k);
            sqnum(n-1);     //this statement here works as tail recursion
            System.out.printf("hi %d ",n);      //this statement here works as a head recursion
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Square obj= new Square();
        int n=sc.nextInt();
        obj.sqnum(n);
    }
}

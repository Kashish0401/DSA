package Recursion;

import java.util.Scanner;

public class printingNumbers {
    void print(int n)
    {
        if(n>0)
        {
            print(n-1);
            System.out.printf("%d ",n);
        }
    }

    public static void main(String[] args) {
        printingNumbers obj=new printingNumbers();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        obj.print(n);
    }
}

package Recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    int sum(int n)
    {
        if(n>0)
        {
            return sum(n-1)+n;
        }
        return 0;
    }

    public static void main(String[] args) {
        SumOfNNumbers obj= new SumOfNNumbers();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum= "+obj.sum(n));
    }
}

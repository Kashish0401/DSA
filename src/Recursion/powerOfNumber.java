package Recursion;

import java.util.Scanner;

public class powerOfNumber {
    int pow(int n, int p)
    {
        if(p>0)
        {
            return pow(n,p-1)*n;
        }
        return 1;
    }

    public static void main(String[] args) {
        powerOfNumber obj= new powerOfNumber();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), p=sc.nextInt();
        System.out.println(obj.pow(n,p));
    }
}

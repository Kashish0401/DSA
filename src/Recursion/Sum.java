package Recursion;

import java.util.Scanner;

public class Sum {
    int sumOfNum(int[] arr, int n)
    {
        if(n>0)
        {
            return sumOfNum(arr,n-1)+arr[n-1];
        }
        return 0;
    }

    public static void main(String[] args) {
        Sum obj= new Sum();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(obj.sumOfNum(arr,n));
    }
}

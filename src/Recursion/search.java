package Recursion;

import java.util.Scanner;

public class search {
    int find(int[] arr, int currIndex, int num)
    {
        if(arr[currIndex]==num)
            return currIndex;
        if(currIndex==arr.length)
            return -1;
        return find(arr,currIndex+1,num);
    }

    public static void main(String[] args) {
        search obj=new search();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        System.out.println(obj.find(arr,0,num));
    }
}

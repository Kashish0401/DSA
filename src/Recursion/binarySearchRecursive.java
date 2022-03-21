package Recursion;

import java.util.Scanner;

public class binarySearchRecursive {

    int search(int[] arr, int s, int l, int h){
        int m=(l+h)/2;
        if(l>h)
            return -1;
        if(arr[m]==s)
            return m;
        if(arr[m]<s)
            l=m+1;
        else if(arr[m]>s)
            h=m-1;
        return search(arr,s,l,h);
    }

    public static void main(String[] args) {
        binarySearchRecursive obj= new binarySearchRecursive();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(), arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        int s= sc.nextInt();
        if(obj.search(arr,s,0, (arr.length-1)) == -1)
            System.out.println("Not found");
        else
            System.out.println("Found");

    }
}

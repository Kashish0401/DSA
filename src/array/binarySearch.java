package array;

import java.util.Scanner;

public class binarySearch {
    int search(int[] arr, int n,int x)
    {
        int l=0, h=n-1,m;
        do{
            m=(h+l)/2;
            if(x==arr[m])
            {
                return m;
            }
            else if(x<arr[m])
            {
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }while(m>0);
        return -1;
    }
    public static void main(String[] args) {
        binarySearch obj= new binarySearch();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array in sorted way");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int x=sc.nextInt();
        System.out.printf("number is present at index= %d",obj.search(arr,n,x));
    }
}

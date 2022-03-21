package array.sorting;

import java.util.Scanner;

public class bubbleSort {
    void sorting(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void printArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void main(String[] args) {
        bubbleSort obj= new bubbleSort();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        obj.sorting(arr,n);
        obj.printArray(arr,n);
    }
}

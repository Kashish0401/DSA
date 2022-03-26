package array.sorting;

import java.util.Scanner;

public class quickSort {
    static void sort(int[] arr, int l, int r){
        if(l<r){
            int p= partition(arr,l,r);
            sort(arr,l,p-1);
            sort(arr,p+1,r);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr, int l, int r){
        int pivot= arr[r];
        int p=l;
        for(int i=l;i<r;i++){
            if(arr[i]<pivot){
                swap(arr,p,i);
                p++;
            }
        }
        swap(arr,p,r);
        return p;
    }

    static void printArray(int[] arr){
        for(int i:arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort(arr,0,arr.length-1);
        printArray(arr);
    }
}

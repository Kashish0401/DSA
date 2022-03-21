package array.sorting;

import java.util.Scanner;

public class selectionSort {
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pos]>arr[j]){
                    pos=j;
                }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int[] arr){
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        printArray(arr);
    }
}

// it is an unstable sorting technique. It has O(n^2) comparison and O(n)for swapping(it is the only sorting technique
// which has O(n) swaps

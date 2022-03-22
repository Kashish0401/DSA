package array.sorting;

import java.util.Scanner;

public class shellSort {
    static void sort(int[] arr){
        int gap= arr.length/2;
        while(gap>0){
            for(int i=0;i< arr.length;i++){
                if((i+gap)<arr.length && arr[i]>arr[i+gap]){
                    int temp=arr[i];
                    arr[i]=arr[gap+i];
                    arr[i+gap]=temp;
                }
                if((i-gap)>=0 && arr[i]<arr[i-gap]){
                    int temp=arr[i];
                    arr[i]=arr[i-gap];
                    arr[i-gap]=temp;
                }
            }
            gap/=2;
        }
    }

    static void printArray(int[] arr){
        for(int j:arr){
            System.out.print(j+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        sort(arr);
        printArray(arr);
    }
}

//It has complexity of O(n log n). it is not a stable sort
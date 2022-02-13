package array;

import java.util.Scanner;

public class secondLargestOptimum {
    int secondLargest(int[] arr)
    {
        int res=-1,max=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > arr[max]) {
                res = max;
                max = i;
            } else if (arr[i] != arr[max]) {
                if (res == -1 || arr[i] > arr[res])
                {
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        secondLargestOptimum obj= new secondLargestOptimum();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.printf("Index of second largest no is= %d",obj.secondLargest(arr));
    }
}

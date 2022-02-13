package array;

import java.util.ArrayList;
import java.util.Scanner;

public class sortedCheck {
    void check(int[] arr)
    {
        int flag=1;
        for(int i=0;i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("Sorted array");
        else
            System.out.println("NO.");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sortedCheck obj= new sortedCheck();
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.check(arr);
    }
}

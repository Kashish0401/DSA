package array;

import java.util.Scanner;

public class secondLargest {
    int largest(int[] arr, int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    int secondLar(int[] arr,int n)
    {
        int res=-1;
        int max= largest(arr,n);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[max])
            {
                if(res==-1)
                    res=i;
                else if(arr[res]<arr[i])
                    res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        secondLargest obj= new secondLargest();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.printf("Second largest is present at = %d",obj.secondLar(arr,n));
    }
}

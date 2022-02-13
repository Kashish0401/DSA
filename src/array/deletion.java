package array;

import java.util.Scanner;

public class deletion
{
    int delete(int[] arr, int n, int num)
    {
        int f=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==num)
            {
                for(int j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                f++;
            }
        }
        return f;
    }
    void printArray(int[] arr, int n, int f)
    {
        for(int i=0;i<n-f;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void main(String[] args) {
        deletion obj= new deletion();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.println("Enter the number to be deleted");
        int num= sc.nextInt();
        int f;
        f= obj.delete(arr,n,num);
        obj.printArray(arr,n,f);
    }
}

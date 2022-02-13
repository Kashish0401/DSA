package array;

import java.util.Scanner;

public class insertion
{
    int insert(int[] arr,int n, int ni, int no, int pos)
    {
        if(n<ni+1)
            return ni;
        for(int i=ni-1; i>=pos-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos-1]=no;
        return ni+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertion obj=new insertion();
        int n=sc.nextInt();
        System.out.println("enter size of nos to be inserted");
        int ni=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<ni;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter no to be inserted");
        int no= sc.nextInt();
        System.out.println("Enter the position");
        int pos= sc.nextInt();
        ni=obj.insert(arr, n, ni, no, pos);
        for(int i=0;i<ni;i++)
            System.out.println(arr[i]);
    }
}

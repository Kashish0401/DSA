package array;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class reverse {
    public static int[] rev(int[] arr,int n)
    {
        for(int i=0; i < n/2 ; i++){
            int temp= arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        reverse obj=new reverse();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        arr=rev(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}

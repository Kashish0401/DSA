package array;
import java.util.*;
public class linearSearch
{
    int search(int[] arr, int n, int s)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        linearSearch obj= new linearSearch();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int s=sc.nextInt();
        System.out.println(s+" was found at "+obj.search(arr,n,s));
    }
}

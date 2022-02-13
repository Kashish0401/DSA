package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchAllOccurrence {
    List<Integer> res(int[] arr, int currIndex, int num)
    {
        List <Integer> l= new ArrayList<>();
        if(currIndex<arr.length) {
            if (arr[currIndex] == num)
                l.add(currIndex);
            l.addAll(res(arr, currIndex + 1, num));
        }
        return l;
    }

    public static void main(String[] args) {
        searchAllOccurrence obj=new searchAllOccurrence();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int num=sc.nextInt();
        for(var i: obj.res(arr,0,num))
            System.out.printf("%d ",i);
    }
}

import java.util.ArrayList;
class Subsequences {
    
    private static void printSubsequence(int[] arr, int i, ArrayList<Integer> l, int currSum, int k){
        if(i>=arr.length){
            if(currSum==k){
                for(int j: l)
                    System.out.print(j + " ");
                System.out.println();
            }
            return;
        }
        currSum+=arr[i];
        l.add(arr[i]);
        printSubsequence(arr, i+1, l, currSum, k);
        l.remove(l.size()-1);
        currSum-=arr[i];
        printSubsequence(arr, i+1, l, currSum, k);
    }
    
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int k=3;
        ArrayList<Integer> l = new ArrayList<>();
        printSubsequence(arr, 0, l, 0, k);
    }
}

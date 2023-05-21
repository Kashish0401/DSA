import java.util.ArrayList;
class Subsequence {
    
    private static void printSubsequences(int[] arr, int i, ArrayList<Integer> l){
        if(i>=arr.length){
            for(int j: l)
                System.out.print(j + " ");
            if(l.size()==0)
                System.out.print("{}");
            System.out.println();
            return;
        }
        l.add(arr[i]);
        printSubsequences(arr, i+1, l);
        l.remove(l.size()-1);
        printSubsequences(arr, i+1, l);
    }
    
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        ArrayList<Integer> l = new ArrayList<>();
        printSubsequences(arr, 0, l);
    }
}

//O(2^n)

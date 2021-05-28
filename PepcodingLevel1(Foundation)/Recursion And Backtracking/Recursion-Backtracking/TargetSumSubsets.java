package RecursionBacktracking;
import java.util.*;
public class TargetSumSubsets {


    public static void targetSumSubsets(int []arr, int idx, int sum, int tar, String ans){
        if(idx==arr.length){
            if(sum==tar){
                System.out.println(ans + ".");
            }
            return;
        }else if(sum>tar) return;

        targetSumSubsets(arr,idx+1,sum+arr[idx],tar,ans+arr[idx]+", ");
        targetSumSubsets(arr,idx+1,sum,tar,ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        targetSumSubsets(arr,0,0,tar,"");
    }
}

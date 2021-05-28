package RecursionInArrays;
import java.util.*;
public class AllIndicesOfArray {

    public static int[] allIndices(int[] arr, int idx, int count, int tar) {
        if (idx == arr.length) return new int[count];

        int[] ans;
        if (arr[idx] == tar) {
            ans = allIndices(arr, idx + 1, count + 1, tar);
            ans[count] = idx;
        } else {
            ans = allIndices(arr, idx + 1, count, tar);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        int []ans = allIndices(arr,0,0,tar);

        if(ans.length==0){
            System.out.println();
        }

        for(int i=0; i<ans.length; i++) System.out.println(ans[i]);
    }
}

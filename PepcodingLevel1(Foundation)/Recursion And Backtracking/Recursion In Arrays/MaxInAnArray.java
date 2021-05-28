package RecursionInArrays;
import java.util.*;
public class MaxInAnArray {

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length) return -1;

        return Math.max(maxOfArray(arr, idx + 1), arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int ans = maxOfArray(arr,0);
        System.out.println(ans);
    }
}

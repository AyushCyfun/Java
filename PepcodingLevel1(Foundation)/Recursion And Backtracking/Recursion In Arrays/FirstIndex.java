package RecursionInArrays;
import java.util.*;
public class FirstIndex {

    public static int fi(int[] arr, int idx, int tar) {
        if (idx == arr.length) return -1;
        else if (arr[idx] == tar) return idx;

        return fi(arr, idx + 1, tar);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        int ans = fi(arr,0,tar);
        System.out.println(ans);
    }
}

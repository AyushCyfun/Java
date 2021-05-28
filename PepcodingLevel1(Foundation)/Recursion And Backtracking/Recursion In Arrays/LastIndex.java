package RecursionInArrays;
import java.util.*;
public class LastIndex {

    public static int li(int[] arr, int idx, int tar) {
        if (idx < 0) return -1;
        else if (arr[idx] == tar) return idx;

        return li(arr, idx - 1, tar);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        int ans = li(arr,n-1,tar);
        System.out.println(ans);
    }
}

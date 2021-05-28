package RecursionInArrays;
import java.util.*;
public class DisplayArray {

    public static void display(int[] arr, int idx) {
        if (idx == arr.length) return;

        System.out.println(arr[idx]);
        display(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        display(arr,0);
    }
}

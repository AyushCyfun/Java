package FunctionsAndArrays;
import java.util.*;
public class InverseOfAnArray {

    public static void InverseArray(int []arr){
        int []ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) ans[arr[i]] = i;

        for(int i=0; i<ans.length; i++) System.out.println(ans[i]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();
        InverseArray(arr);
    }
}

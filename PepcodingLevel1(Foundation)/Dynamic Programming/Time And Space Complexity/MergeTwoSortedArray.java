package TimeAndSpaceComplexity;
import java.util.*;
import java.io.*;
public class MergeTwoSortedArray {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int []ans = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                ans[k++] = b[j++];
            }else{
                ans[k++] = a[i++];
            }
        }

        while(i<a.length){
            ans[k++] = a[i++];
        }

        while(j<b.length){
            ans[k++] = b[j++];
        }

        return ans;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }
}

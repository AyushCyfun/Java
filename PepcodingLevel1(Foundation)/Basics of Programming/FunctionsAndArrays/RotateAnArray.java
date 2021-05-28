package FunctionsAndArrays;
import java.util.*;
public class RotateAnArray {


    public static void reverse(int []arr, int l , int r){
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }


    public static void rotate(int []arr, int r){
        r = r % arr.length;
        if(r<0) r+=arr.length;

        reverse(arr,0,arr.length-r-1);
        reverse(arr,arr.length-r,arr.length-1);
        reverse(arr,0,arr.length-1);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int r = scn.nextInt();
        rotate(arr,r);
    }
}

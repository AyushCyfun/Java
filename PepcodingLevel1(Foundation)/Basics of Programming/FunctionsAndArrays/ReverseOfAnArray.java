package FunctionsAndArrays;
import java.util.*;
public class ReverseOfAnArray {

    public static void reverseArray(int []arr){
        int i = 0, j=arr.length-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        for(i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();
        reverseArray(arr);
    }
}

package TimeAndSpaceComplexity;
import java.util.*;
import java.io.*;
public class PivotInSortedAndRotatedArray {

    public static int findPivot(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid]<arr[j]){
                j = mid;
            }else{
                i = mid + 1;
            }
        }

        return arr[i];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }
}

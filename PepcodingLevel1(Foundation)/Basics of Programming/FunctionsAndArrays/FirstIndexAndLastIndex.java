package FunctionsAndArrays;
import java.util.*;
public class FirstIndexAndLastIndex {

    public static int fi(int []arr, int tar){
        int l = 0, r = arr.length-1,fi = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==tar){
                fi = mid;
                r = mid - 1;
            }else if(arr[mid]>tar){
                r = mid - 1;
            }else{
                l = mid +1;
            }
        }

        return fi;
    }


    public static int li(int []arr, int tar){
        int l = 0, r = arr.length-1,li = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==tar){
                li = mid;
                l = mid +1;
            }else if(arr[mid]>tar){
                r = mid - 1;
            }else{
                l = mid +1;
            }
        }

        return li;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        System.out.println(fi(arr,tar));
        System.out.println(li(arr,tar));
    }
}

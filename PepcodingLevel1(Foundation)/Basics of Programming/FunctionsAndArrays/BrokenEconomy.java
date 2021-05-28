package FunctionsAndArrays;
import java.util.*;
public class BrokenEconomy {

    public static void BrokenEconomy(int []arr, int tar){
        int l=0,r=arr.length-1,floor=Integer.MIN_VALUE,ceil = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==tar){
                floor = tar;
                ceil = tar;
                break;
            }else if(arr[mid]>tar){
                ceil = arr[mid];
                r = mid-1;
            }else{
                floor = arr[mid];
                l = mid+1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        BrokenEconomy(arr,tar);
    }
}

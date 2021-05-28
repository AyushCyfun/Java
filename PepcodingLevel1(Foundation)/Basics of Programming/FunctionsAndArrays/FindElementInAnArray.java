package FunctionsAndArrays;
import java.util.*;
public class FindElementInAnArray {

    public static void FindElement(int []arr, int tar){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==tar){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();
        FindElement(arr,tar);
    }
}

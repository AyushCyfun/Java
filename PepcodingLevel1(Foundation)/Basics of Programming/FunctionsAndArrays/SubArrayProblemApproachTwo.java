package FunctionsAndArrays;
import java.util.*;
public class SubArrayProblemApproachTwo {

    public static void SubarrayTwo(int []arr){
        for(int i=0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<arr.length; j++){
                sb.append(arr[j] + "\t");
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        SubarrayTwo(arr);
    }
}

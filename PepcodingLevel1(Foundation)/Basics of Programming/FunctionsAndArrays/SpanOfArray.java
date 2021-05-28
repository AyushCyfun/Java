package FunctionsAndArrays;
import java.util.*;
public class SpanOfArray {

    public static void Span(int []arr){
        int min = arr[0], max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        System.out.println(max - min);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        Span(arr);
    }
}

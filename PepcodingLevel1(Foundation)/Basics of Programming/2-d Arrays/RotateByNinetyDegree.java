package TwoDArray;
import java.util.*;
public class RotateByNinetyDegree {

    public static void reverse(int [][]arr, int r){
        int i = 0, j = arr.length-1;
        while(i<j){
            int t = arr[r][i];
            arr[r][i] = arr[r][j];
            arr[r][j] = t;
            i++;
            j--;
        }
    }


    public static void transpose(int [][]arr, int r){
        for(int i=r; i<arr.length; i++){
            int t = arr[r][i];
            arr[r][i] = arr[i][r];
            arr[i][r] = t;
        }
    }


    public static void rotate(int [][]arr){
        for(int i=0; i<arr.length; i++){
            transpose(arr,i);
        }

        for(int i=0; i<arr.length; i++){
            reverse(arr,i);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++) System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        rotate(arr);
    }
}

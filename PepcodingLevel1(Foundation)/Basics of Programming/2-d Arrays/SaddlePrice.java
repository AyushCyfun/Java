package TwoDArray;
import java.util.*;
public class SaddlePrice {

    public static void SaddlePrice(int [][]arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i][0], idx = 0;
            for(int j=1; j<arr.length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    idx = j;
                }
            }

            boolean ans = true;
            for(int j=0; j<arr.length; j++){
                if(arr[j][idx]>min){
                    ans = false;
                    break;
                }
            }

            if(ans){
                System.out.println(min);
                return;
            }
        }

        System.out.println("Invalid input");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = scn.nextInt();
        }

        SaddlePrice(arr);
    }
}

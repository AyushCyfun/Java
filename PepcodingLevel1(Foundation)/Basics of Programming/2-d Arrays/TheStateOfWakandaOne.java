package TwoDArray;
import java.util.*;
public class TheStateOfWakandaOne {

    public static void StateOfWakandaOne(int [][]arr){
        for(int i=0; i<arr[0].length; i++){
            if(i%2==0){
                for(int j=0; j<arr.length; j++) System.out.println(arr[j][i]);
            }else{
                for(int j=arr.length-1; j>=0; j--) System.out.println(arr[j][i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) arr[i][j] = scn.nextInt();
        }

        StateOfWakandaOne(arr);
    }
}

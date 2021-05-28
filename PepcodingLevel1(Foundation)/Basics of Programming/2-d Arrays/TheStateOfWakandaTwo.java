package TwoDArray;
import java.util.*;
public class TheStateOfWakandaTwo {

    public static void theStateOfWakandaTwo(int [][]arr){
        for(int i=0; i<arr.length; i++){
            int r = 0;
            int c = i;
            while(c<arr.length){
                System.out.println(arr[r][c]);
                r++;
                c++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = scn.nextInt();
        }

        theStateOfWakandaTwo(arr);
    }
}

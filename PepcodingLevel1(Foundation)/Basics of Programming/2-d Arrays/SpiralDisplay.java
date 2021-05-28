package TwoDArray;
import java.util.*;
public class SpiralDisplay {

    public static void spiralDisplay(int [][]arr){
        int minr = 0, minc = 0, maxr = arr.length-1, maxc = arr[0].length-1;
        int t = arr.length * arr[0].length, cc= 0;
        while(cc<t){
            for(int i=minr; i<=maxr && cc<t; i++){
                System.out.println(arr[i][minc]);
                cc++;
            }

            minc++;

            for(int i=minc; i<=maxc && cc<t; i++){
                System.out.println(arr[maxr][i]);
                cc++;
            }

            maxr--;

            for(int i=maxr; i>=minr && cc<t; i--){
                System.out.println(arr[i][maxc]);
                cc++;
            }

            maxc--;

            for(int i=maxc; i>=minc && cc<t; i--){
                System.out.println(arr[minr][i]);
                cc++;
            }

            minr++;
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

        spiralDisplay(arr);
    }
}

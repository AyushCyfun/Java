package RecursionBacktracking;
import java.util.*;
public class FloodFill {

    public static void floodFill(int [][]arr, int r, int c, String ans){
        if(r<0 || c<0 || r>=arr.length || c>=arr[0].length || arr[r][c]==1) return;
        else if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(ans);
            return;
        }

        arr[r][c] = 1;
        floodFill(arr,r-1,c,ans+"t");
        floodFill(arr,r,c-1,ans+"l");
        floodFill(arr,r+1,c,ans+"d");
        floodFill(arr,r,c+1,ans+"r");
        arr[r][c] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        floodFill(arr,0,0,"");
    }
}

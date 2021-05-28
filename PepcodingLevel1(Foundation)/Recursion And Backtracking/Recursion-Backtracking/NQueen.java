package RecursionBacktracking;
import java.util.*;
public class NQueen {

    public static boolean IsQueenSafe(int [][]arr, int r, int c){
        for(int i=0; i<r; i++){
            if(arr[i][c]==1) return false;
        }

        for(int i=r, j=c; i>=0 && j<arr[0].length; i--, j++){
            if(arr[i][j]==1) return false;
        }

        for(int i=r, j=c; i>=0 && j>=0; i--, j--){
            if(arr[i][j]==1) return false;
        }

        return true;
    }


    public static void NQueens(int [][]arr, int r, String ans){
        if(r==arr.length){
            System.out.println(ans + ".");
            return;
        }

        for(int i=0; i<arr[0].length; i++){
            if(IsQueenSafe(arr,r,i)){
                arr[r][i] = 1;
                NQueens(arr,r+1,ans + r + "-" + i + ", ");
                arr[r][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        NQueens(arr,0,"");
    }
}

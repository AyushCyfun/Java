package RecursionBacktracking;
import java.util.*;
public class KnightsTour {

    public static void display(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        System.out.println();
    }


    public static void KnightsTour(int [][]arr, int r, int c, int move){
        if(r<0 || r>=arr.length || c<0 || c>=arr[0].length || arr[r][c]!=0) return;
        else if(move==(arr.length*arr[0].length)){
            arr[r][c] = move;
            display(arr);
            arr[r][c] = 0;
            return;
        }


        arr[r][c] = move;
        KnightsTour(arr,r-2,c+1,move+1);
        KnightsTour(arr,r-1,c+2,move+1);
        KnightsTour(arr,r+1,c+2,move+1);
        KnightsTour(arr,r+2,c+1,move+1);
        KnightsTour(arr,r+2,c-1,move+1);
        KnightsTour(arr,r+1,c-2,move+1);
        KnightsTour(arr,r-1,c-2,move+1);
        KnightsTour(arr,r-2,c-1,move+1);
        arr[r][c] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][]arr =new int[n][n];
        KnightsTour(arr,r,c,1);
    }
}

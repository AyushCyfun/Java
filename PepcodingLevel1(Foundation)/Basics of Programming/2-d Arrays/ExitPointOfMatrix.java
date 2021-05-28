package TwoDArray;
import java.util.*;
public class ExitPointOfMatrix {

    public static void ExitPoint(int [][]arr){
        int r = 0, c = 0, dir =0;
        while(r>=0 && r<arr.length && c>=0 && c<arr[0].length){
            dir = (arr[r][c] + dir)%4;
            if(dir==0) c++;
            else if(dir==1) r++;
            else if(dir==2) c--;
            else r--;
        }

        if(r<0) r++;
        else if(c<0) c++;
        else if(r>=arr.length) r--;
        else if(c>=arr[0].length) c--;

        System.out.println(r);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) arr[i][j] = scn.nextInt();
        }
        ExitPoint(arr);
    }
}

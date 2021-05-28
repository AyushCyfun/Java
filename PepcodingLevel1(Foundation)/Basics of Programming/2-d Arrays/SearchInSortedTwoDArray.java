package TwoDArray;
import java.util.*;
public class SearchInSortedTwoDArray {

    public static void SearchInArray(int [][]arr, int tar){
        int r = 0, c = arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==tar){
                System.out.println(r);
                System.out.println(c);
                return;
            }else if(arr[r][c]>tar){
                c--;
            }else{
                r++;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = scn.nextInt();
        }

        int tar = scn.nextInt();
        SearchInArray(arr,tar);
    }
}

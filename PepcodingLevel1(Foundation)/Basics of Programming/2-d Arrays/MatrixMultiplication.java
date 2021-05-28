package TwoDArray;
import java.util.*;
public class MatrixMultiplication {

    public static void Multiplication(int [][]a, int [][]b){
        if(a[0].length!=b.length){
            System.out.println("Invalid input");
            return;
        }

        int [][]ans = new int[a.length][b[0].length];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                for(int k=0; k<b.length; k++){
                    ans[i][j]+= (a[i][k] * b[k][j]);
                }
            }
        }

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++) System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int [][]a = new int[n1][m1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++) a[i][j] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int [][]b = new int[n2][m2];
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++) b[i][j] = scn.nextInt();
        }

        Multiplication(a,b);
    }
}

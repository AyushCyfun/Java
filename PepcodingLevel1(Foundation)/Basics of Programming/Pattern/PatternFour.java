package Pattern;
import java.util.*;
public class PatternFour {

    public static void Pattern4(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++) System.out.print("\t");
            for(int j=1; j<=n-i; j++) System.out.print("*\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern4(n);
    }
}

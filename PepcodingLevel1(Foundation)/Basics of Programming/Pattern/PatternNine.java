package Pattern;
import java.util.*;
public class PatternNine {

    public static void Pattern9(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i==(n-j)+1) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern9(n);
    }
}

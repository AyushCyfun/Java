package Pattern;
import java.util.*;
public class PatternEight {

    public static void Pattern8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==(n-j)+1) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern8(n);
    }
}

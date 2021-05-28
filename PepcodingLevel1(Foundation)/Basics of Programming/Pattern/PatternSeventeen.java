package Pattern;
import java.util.*;
public class PatternSeventeen {

    public static void Pattern17(int n){
        int sp = n/2, st = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                if(i==(n/2)+1) System.out.print("*\t");
                else System.out.print("\t");
            }

            for(int j=1; j<=st; j++) System.out.print("*\t");

            System.out.println();
            if(i<=n/2) st++;
            else st--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern17(n);
    }
}

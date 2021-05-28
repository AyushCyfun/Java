package Pattern;
import java.util.*;
public class PatternSixteen {

    public static void Pattern16(int n){
        int st = 1, sp = (2*n)-3;
        for(int i=1; i<=n; i++){
            int cc = 1;
            for(int j=1; j<=st; j++) System.out.print(cc++ + "\t");

            for(int j=1; j<=sp; j++) System.out.print("\t");

            if(i==n){
                cc--;
                st--;
            }

            cc--;
            for(int j=1; j<=st; j++) System.out.print(cc-- + "\t");

            System.out.println();
            st++;
            sp-=2;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern16(n);
    }
}

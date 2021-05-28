package Pattern;
import java.util.*;
public class PatternTen {

    public static void Pattern10(int n){
        int sp=n/2, is=-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++) System.out.print("\t");
            System.out.print("*\t");

            for(int j=1; j<=is; j++) System.out.print("\t");
            if(i>1 && i<n) System.out.print("*\t");

            System.out.println();
            if(i<=n/2){
                sp--;
                is+=2;
            }else{
                sp++;
                is-=2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern10(n);
    }
}

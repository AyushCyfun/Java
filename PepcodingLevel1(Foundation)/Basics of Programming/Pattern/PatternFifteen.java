package Pattern;
import java.util.*;
public class PatternFifteen {

    public static void Pattern15(int n){
        int sp = n/2, st =1, cc=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            int val = cc;
            for(int j=1; j<=st; j++){
                System.out.print(val + "\t");
                if(j<=st/2) val++;
                else val--;
            }

            System.out.println();
            if(i<=n/2){
                st+=2;
                sp--;
                cc++;
            }else{
                st-=2;
                sp++;
                cc--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern15(n);
    }
}

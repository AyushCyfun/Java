package Pattern;
import java.util.*;
public class PatternEighteen {

    public static void Pattern18(int n){
        int st = n, sp = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++) System.out.print("\t");
            for(int j=1; j<=st; j++) {
                if(i>1 && i<(n/2)+1){
                    if(j==1 || j==st) System.out.print("*\t");
                    else System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }

            System.out.println();
            if(i<=n/2){
                sp++;
                st-=2;
            }else{
                sp--;
                st+=2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern18(n);
    }
}

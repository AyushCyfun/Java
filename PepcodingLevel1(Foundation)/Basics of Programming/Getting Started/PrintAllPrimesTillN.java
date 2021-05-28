package GettingStarted;
import java.util.*;
public class PrintAllPrimesTillN {

    public static void PrimeTillN(int l, int h){
        for(int i=l; i<=h; i++){
            boolean ans = true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    ans = false;
                    break;
                }
            }
            if(ans) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h  = scn.nextInt();
        PrimeTillN(l,h);
    }
}

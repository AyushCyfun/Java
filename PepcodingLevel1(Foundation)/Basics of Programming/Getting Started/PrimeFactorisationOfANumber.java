package GettingStarted;
import java.util.*;
public class PrimeFactorisationOfANumber {

    public static void PrimeFactorization(int n){
        int cc = 2;
        while(n!=1){
            if(n%cc==0) {
                System.out.print(cc + " ");
                n/=cc;
            }else{
                cc++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PrimeFactorization(n);
    }
}

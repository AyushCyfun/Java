package GettingStarted;
import java.util.*;
public class IsANumberPrime {

    public static void isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
        }

        System.out.println("prime");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            isPrime(n);
        }
    }
}

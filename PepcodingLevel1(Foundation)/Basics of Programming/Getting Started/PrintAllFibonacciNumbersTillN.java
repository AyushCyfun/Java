package GettingStarted;
import java.util.*;
public class PrintAllFibonacciNumbersTillN {

    public static void FibTillN(int n){
        int a = 0, b=1;
        for(int i=0; i<n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        FibTillN(n);
    }
}

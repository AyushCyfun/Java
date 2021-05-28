package IntroductionToRecursion;
import java.util.*;
public class Factorial {

    public static int factorial(int n){
        if(n==0) return 1;

        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}

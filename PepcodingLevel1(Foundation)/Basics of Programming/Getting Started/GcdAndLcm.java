package GettingStarted;
import java.util.*;
public class GcdAndLcm {

    public static void GcdLcm(int n, int m){
        int n1 = n, m1 = m;
        while(m%n!=0){
            int r = m % n;
            m = n;
            n = r;
        }

        int gcd = n;
        int lcm = (n1 * m1)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        GcdLcm(n,m);
    }
}

package IntroductionToRecursion;
import java.util.*;
public class PowerLinear {

    public static int PowerLinear(int n, int x){
        if(x==0) return 1;

        return PowerLinear(n,x-1) * n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int ans = PowerLinear(n,x);
        System.out.println(ans);
    }
}

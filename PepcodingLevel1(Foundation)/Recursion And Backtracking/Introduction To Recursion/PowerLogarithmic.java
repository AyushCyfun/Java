package IntroductionToRecursion;
import java.util.*;
public class PowerLogarithmic {

    public static int PowerLog(int n, int x){
        if(x==0) return 1;

        int ans = PowerLog(n,x/2);
        ans = ans * ans;
        if(x%2!=0) ans = ans * n;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int ans = PowerLog(n,x);
        System.out.println(ans);
    }
}

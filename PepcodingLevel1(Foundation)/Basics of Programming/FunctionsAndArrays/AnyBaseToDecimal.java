package FunctionsAndArrays;
import java.util.*;
public class AnyBaseToDecimal {

    public static int AnyBaseToDecimal(int n, int b){
        int ans = 0, len = 0;
        while (n != 0){
            ans = ans + ((int)Math.pow(b,len) * (n%10));
            n/=10;
            len++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = AnyBaseToDecimal(n,b);
        System.out.println(ans);
    }
}

package FunctionsAndArrays;
import java.util.*;
public class AnyBaseToAnyBase {

    public static int DecimalToAnyBase(int n, int b){
        int ans = 0, len = 0;
        while(n!=0){
            ans = ans + ((int)Math.pow(10,len) * (n%b));
            n/=b;
            len++;
        }

        return ans;
    }


    public static int AnyBaseToDecimal(int n, int b){
        int ans = 0, len = 0;
        while (n != 0){
            ans = ans + ((int)Math.pow(b,len) * (n%10));
            n/=10;
            len++;
        }

        return ans;
    }


    public static int AnyBaseToAnyBase(int n, int b1, int b2){
        int ans1 = AnyBaseToDecimal(n,b1);
        int ans = DecimalToAnyBase(ans1,b2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int ans = AnyBaseToAnyBase(n,b1,b2);
        System.out.println(ans);
    }
}

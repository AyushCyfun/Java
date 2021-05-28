package FunctionsAndArrays;
import java.util.*;
public class DecimalToAnyBase {

    public static int DecimalToAnyBase(int n, int b){
        int ans = 0, len = 0;
        while(n!=0){
            ans = ans + ((int)Math.pow(10,len) * (n%b));
            n/=b;
            len++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = DecimalToAnyBase(n,b);
        System.out.println(ans);
    }
}

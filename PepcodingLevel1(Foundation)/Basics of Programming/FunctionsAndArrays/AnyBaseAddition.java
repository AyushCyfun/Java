package FunctionsAndArrays;
import java.util.*;
public class AnyBaseAddition {

    public static int AnyBaseAddition(int n1, int n2, int b){
        int ans = 0, c = 0, len = 0;
        while(n1!=0 || n2!=0 || c!=0){
            int r1 = n1 % 10; n1/=10;
            int r2 = n2 % 10; n2/=10;

            int sum = c + r1 + r2;
            ans = ans + ((int)Math.pow(10,len) * (sum%b));
            len++;
            c = sum / b;
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = AnyBaseAddition(n1,n2,b);
        System.out.println(ans);
    }
}

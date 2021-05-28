package FunctionsAndArrays;
import java.util.*;
public class AnyBaseSubtraction {

    public static int AnyBaseSubtraction(int n1, int n2, int b){
        int ans = 0, c = 0, len = 0;
        while(n2!=0){
            int r1 = n1 % 10; n1/=10;
            int r2 = n2 % 10; n2/=10;

            int diff = (r2 + c) - r1;
            if(diff<0){
                diff+=b;
                c = -1;
            }else{
                c = 0;
            }

            ans = ans + ((int)Math.pow(10,len) * diff);
            len++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = AnyBaseSubtraction(n1,n2,b);
        System.out.println(ans);
    }
}

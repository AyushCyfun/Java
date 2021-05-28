package GettingStarted;
import java.util.*;
public class InverseANumber {

    public static void InverseNumber(int n){
        int temp = n, len = 0;
        while(temp!=0){
            temp/=10;
            len++;
        }

        int div = (int)Math.pow(10,len-1);
        int ans = 0;

        while(n!=0){
            int r = n / div;
            ans = ans +  (int)Math.pow(10,r-1) * len;
            n = n % div;
            div = div / 10;
            len--;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        InverseNumber(n);
    }
}

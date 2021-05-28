package GettingStarted;
import java.util.*;
public class RotateANumber {

    public static void rotateNumber(int n, int r){
        int temp = n, len = 0;
        while(temp!=0){
            temp/=10;
            len++;
        }

        r = r % len;
        if(r<0) r = r + len;

        int div = (int)Math.pow(10,r);
        int mul = (int)Math.pow(10,len-r);
        int ans = ((n%div)*mul) + (n/div);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        rotateNumber(n,r);
    }
}

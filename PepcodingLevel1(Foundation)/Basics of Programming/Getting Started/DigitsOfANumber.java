package GettingStarted;
import java.util.*;
public class DigitsOfANumber {

    public static void DigitsInNumber(int n){
        int temp = n, len =0;
        while(temp!=0){
            temp/=10;
            len++;
        }

        int div = (int)Math.pow(10,len-1);
        while(div!=0){
            System.out.println(n / div);
            n = n % div;
            div = div / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        DigitsInNumber(n);
    }
}

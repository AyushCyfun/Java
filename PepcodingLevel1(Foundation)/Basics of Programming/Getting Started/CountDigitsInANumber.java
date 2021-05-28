package GettingStarted;
import java.util.*;
public class CountDigitsInANumber {

    public static void countDigits(int n){
        int temp = n;
        int cc = 0;
        while(temp!=0){
            cc++;
            temp/=10;
        }
        System.out.println(cc);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        countDigits(n);
    }
}

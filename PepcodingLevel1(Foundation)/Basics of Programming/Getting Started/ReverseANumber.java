package GettingStarted;
import java.util.*;
public class ReverseANumber {

    public static void reverseNumber(int n){
        while(n!=0){
            System.out.println(n % 10);
            n/=10;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverseNumber(n);
    }
}

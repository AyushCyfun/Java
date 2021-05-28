package FunctionsAndArrays;
import java.util.*;
public class DigitFrequency {

    public static void digitFrequency(int n, int d){
        int cc = 0;
        while(n!=0){
            if(n%10==d) cc++;
            n/=10;
        }
        System.out.println(cc);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        digitFrequency(n,d);
    }
}

package GettingStarted;
import java.util.*;
public class PythagoreanTriplet {

    public static void Pythagoreantriplet(long a, long b, long c){
        if(a>=b && a>=c){
            if(a*a== (b*b) + (c*c)) System.out.println(true);
            else System.out.println(false);
        }else if(b>=a && b>=c){
            if(b*b== (a*a) + (c*c)) System.out.println(true);
            else System.out.println(false);
        }else{
            if(c*c== (b*b) + (a*a)) System.out.println(true);
            else System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        long b = scn.nextLong();
        long c = scn.nextLong();
        Pythagoreantriplet(a,b,c);
    }
}

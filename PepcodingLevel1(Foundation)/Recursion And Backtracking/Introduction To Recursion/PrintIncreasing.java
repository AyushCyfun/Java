package IntroductionToRecursion;
import java.util.*;
public class PrintIncreasing {

    public static void PrintIncreasing(int n){
        if(n==0) return;

        PrintIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PrintIncreasing(n);
    }
}

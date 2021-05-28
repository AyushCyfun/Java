package IntroductionToRecursion;
import java.util.*;
public class PrintIncreasingAndDecreasing {

    public static void PrintIncreasingDecreasing(int n){
        if(n==0) return;

        System.out.println(n);
        PrintIncreasingDecreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PrintIncreasingDecreasing(n);
    }
}

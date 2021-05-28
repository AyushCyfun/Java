package IntroductionToRecursion;
import java.util.*;
public class PrintZigZag {

    public static void zigzag(int n){
        if(n==0) return;

        System.out.print(n + " ");
        zigzag(n-1);
        System.out.print(n + " ");
        zigzag(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        zigzag(n);
    }
}

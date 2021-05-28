package IntroductionToRecursion;
import java.util.*;
public class TowerOfHanoi {

    public static void toh(int n, int src, int des, int hel){
        if(n==0) return;

        toh(n-1,src,hel,des);
        System.out.println(n + "[" + src + " -> " + des + "]");
        toh(n-1,hel,des,src);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int des = scn.nextInt();
        int hel =  scn.nextInt();
        toh(n,src,des,hel);
    }
}

package GettingStarted;
import java.util.*;
public class TheCuriousCaseOfBenjaminBulbs {

    public static void BenjaminBulbs(int n){
        for(int i=1; i*i<=n; i++) {
            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BenjaminBulbs(n);
    }
}

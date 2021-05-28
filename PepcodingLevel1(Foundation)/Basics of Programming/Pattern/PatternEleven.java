package Pattern;
import java.util.*;
public class PatternEleven {

    public static void Pattern11(int n){
        int cc = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) System.out.print(cc++ + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern11(n);
    }
}

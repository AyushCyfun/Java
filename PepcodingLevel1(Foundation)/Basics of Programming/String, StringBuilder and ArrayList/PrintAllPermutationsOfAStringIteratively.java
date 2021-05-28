package StringAndStringBuilder;
import java.util.*;
public class PrintAllPermutationsOfAStringIteratively {

    public static void Permutations(String str){
        int t = 1;
        for(int i=2; i<=str.length(); i++) t*=i;

        for(int i=0; i<t; i++){
            StringBuilder sb = new StringBuilder(str);
            int k = i;
            for(int j = str.length(); j>=1; j--){
                int r = k % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                k = k / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Permutations(str);
    }
}

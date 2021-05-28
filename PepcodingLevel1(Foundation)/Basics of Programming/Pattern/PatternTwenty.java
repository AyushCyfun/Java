package Pattern;
import java.util.*;
public class PatternTwenty {

    public static void Pattern20(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || j==n){
                    System.out.print("*\t");
                }else if(i>=(n/2)+1 && i<n){
                    if(i==j || i==(n-j)+1) System.out.print("*\t");
                    else System.out.print("\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern20(n);
    }
}

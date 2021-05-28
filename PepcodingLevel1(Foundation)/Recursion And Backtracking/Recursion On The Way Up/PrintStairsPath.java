package RecursionOnTheWayUp;
import java.util.*;
public class PrintStairsPath {

    public static void PrintStairsPath(int n, String ans){
        if(n<0) return;
        else if(n==0){
            System.out.println(ans);
            return;
        }

        PrintStairsPath(n-1,ans+"1");
        PrintStairsPath(n-2,ans+"2");
        PrintStairsPath(n-3,ans+"3");

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PrintStairsPath(n,"");
    }
}

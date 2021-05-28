package RecursionOnTheWayUp;
import java.util.*;
public class PrintSubsequence {

    public static void PrintSubsequence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);

        PrintSubsequence(rest,ans+ch);
        PrintSubsequence(rest,ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintSubsequence(str,"");
    }
}

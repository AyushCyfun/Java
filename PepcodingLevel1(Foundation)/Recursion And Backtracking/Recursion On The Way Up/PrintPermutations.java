package RecursionOnTheWayUp;
import java.util.*;
public class PrintPermutations {

    public static void PrintPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String rest = str.substring(0,i) + str.substring(i+1);
            PrintPermutations(rest,ans+ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintPermutations(str,"");
    }
}

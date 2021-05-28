package RecursionOnTheWayUp;
import java.util.*;
public class PrintKpc {

    static String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void PrintKpc(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        String s = keys[str.charAt(0) - '0'];
        String rest = str.substring(1);
        for(int i=0; i<s.length(); i++){
            PrintKpc(rest,ans+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintKpc(str,"");
    }
}

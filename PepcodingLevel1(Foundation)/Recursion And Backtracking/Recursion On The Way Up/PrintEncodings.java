package RecursionOnTheWayUp;
import java.util.*;
public class PrintEncodings {

    public static void PrintEncodings(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }else if(str.length()==1){
            if(str.charAt(0)=='0') return;

            int val = str.charAt(0) - '0';
            char ch = (char)(val+96);
            String rest = str.substring(1);
            PrintEncodings(rest,ans+ch);
        }else{
            if(str.charAt(0)=='0') return;

            int val = str.charAt(0) - '0';
            char ch = (char)(val+96);
            String rest = str.substring(1);
            PrintEncodings(rest,ans+ch);

            int val2 = Integer.parseInt(str.substring(0,2));
            if(val2<=26){
                char ch2 = (char)(val2+96);
                PrintEncodings(str.substring(2),ans+ch2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintEncodings(str,"");
    }
}

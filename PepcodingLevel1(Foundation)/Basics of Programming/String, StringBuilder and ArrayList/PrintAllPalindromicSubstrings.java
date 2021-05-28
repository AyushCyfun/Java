package StringAndStringBuilder;
import java.util.*;
public class PrintAllPalindromicSubstrings {

    public static boolean check(String str){
        int i =0, j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    public static void PrintPalindromicSubstring(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String s = str.substring(i,j+1);
                if(check(s)) System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintPalindromicSubstring(str);
    }
}

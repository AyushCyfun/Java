package StringAndStringBuilder;
import java.util.*;
public class ToggleCase {

    public static void toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z') ch = (char)(ch-'a'+'A');
            else if(ch>='A' && ch<='Z') ch = (char)(ch-'A'+'a');

            sb.append(ch);
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        toggleCase(str);
    }
}

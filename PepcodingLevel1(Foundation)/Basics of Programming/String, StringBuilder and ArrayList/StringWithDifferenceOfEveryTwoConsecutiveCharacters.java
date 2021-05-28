package StringAndStringBuilder;
import java.util.*;
public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

    public static void DifferenceOfString(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            sb.append(str.charAt(i) - str.charAt(i-1));
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        DifferenceOfString(str);
    }
}

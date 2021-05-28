package StringAndStringBuilder;
import java.util.*;
public class StringCompression {

    public static String CompressionOne(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }


    public static String compressionTwo(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int cc = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                if(cc>1) sb.append(cc);
                sb.append(str.charAt(i));
                cc = 1;
            }else{
                cc++;
            }
        }

        if(cc>1) sb.append(cc);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(CompressionOne(str));
        System.out.println(compressionTwo(str));
    }
}

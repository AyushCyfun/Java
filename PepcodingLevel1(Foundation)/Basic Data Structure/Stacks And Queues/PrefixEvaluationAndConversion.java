package StackAndQueue;
import java.util.*;
public class PrefixEvaluationAndConversion {

    public static int evaluation(int n, int m, char ch){
        if(ch=='+') return n + m;
        else if(ch=='-') return n - m;
        else if(ch=='*') return n * m;
        else return n / m;
    }

    public static void prefixConvEval(String str){
        Stack<Integer> val = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<String> in = new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch -'0');
                post.push(ch + "");
                in.push(ch + "");
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int n = val.pop();
                int m = val.pop();
                val.push(evaluation(n,m,ch));

                String a = in.pop();
                String b = in.pop();
                in.push("(" + a + ch + b + ")");

                String a2 = post.pop();
                String b2 = post.pop();
                post.push(a2 + b2 + ch);
            }
        }

        System.out.println(val.peek());
        System.out.println(in.peek());
        System.out.println(post.peek());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        prefixConvEval(str);
    }
}

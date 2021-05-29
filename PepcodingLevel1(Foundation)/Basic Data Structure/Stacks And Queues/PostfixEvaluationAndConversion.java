package StackAndQueue;
import java.util.*;
public class PostfixEvaluationAndConversion {

    public static int evaluation(int n, int m, char ch){
        if(ch=='+') return n + m;
        else if(ch=='-') return n - m;
        else if(ch=='*') return n * m;
        else return n / m;
    }

    public static void postfixEvalConv(String str){
        Stack<Integer> val = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> in = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
                pre.push(ch + "");
                in.push(ch + "");
            }else if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                int m = val.pop();
                int n = val.pop();
                val.push(evaluation(n,m,ch));

                String b = in.pop();
                String a = in.pop();
                in.push("(" + a + ch + b + ")");

                String b2 = pre.pop();
                String a2 = pre.pop();
                pre.push(ch +  a2 + b2);
            }
        }

        System.out.println(val.peek());
        System.out.println(in.peek());
        System.out.println(pre.peek());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        postfixEvalConv(str);
    }
}

package StackAndQueue;
import java.util.*;
public class InfixConversion {

    public static int Precedence(char ch){
        if(ch=='+' || ch=='-') return 0;
        else return 1;
    }

    public static void infixConversion(String str){
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch) || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                pre.push(ch + "");
                post.push(ch + "");
            }else if(ch=='('){
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                    char c = op.pop();
                    String b = pre.pop();
                    String a = pre.pop();
                    pre.push(c + a + b);

                    String b2 = post.pop();
                    String a2 = post.pop();
                    post.push(a2 + b2 + c);
                }

                op.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while (!op.isEmpty() && op.peek()!='(' && Precedence(op.peek())>=Precedence(ch)){
                    char c = op.pop();
                    String b = pre.pop();
                    String a = pre.pop();
                    pre.push(c + a + b);

                    String b2 = post.pop();
                    String a2 = post.pop();
                    post.push(a2 + b2 + c);
                }
                op.push(ch);
            }
        }

        while(!op.isEmpty()){
            char c = op.pop();
            String b = pre.pop();
            String a = pre.pop();
            pre.push(c + a + b);

            String b2 = post.pop();
            String a2 = post.pop();
            post.push(a2 + b2 + c);
        }

        System.out.println(post.peek());
        System.out.println(pre.peek());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        infixConversion(str);
    }
}

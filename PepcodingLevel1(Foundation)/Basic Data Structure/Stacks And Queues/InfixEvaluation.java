package StackAndQueue;
import java.util.*;
public class InfixEvaluation {

    public static int evaluation(int n, int m, char ch){
        if(ch=='+') return n + m;
        else if(ch=='-') return n - m;
        else if(ch=='*') return n * m;
        else return n / m;
    }

    public static int Precedence(char ch){
        if(ch=='+' || ch=='-') return 0;
        else return 1;
    }

    public static int infixEvaluation(String str){

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch -'0');
            }else if(ch=='('){
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                    int m = val.pop();
                    int n = val.pop();
                    val.push(evaluation(n,m,op.pop()));
                }
                op.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(!op.isEmpty() && op.peek()!='(' && Precedence(op.peek())>=Precedence(ch)){
                    int m = val.pop();
                    int n = val.pop();
                    val.push(evaluation(n,m,op.pop()));
                }
                op.push(ch);
            }
        }

        while(!op.isEmpty()){
            int m = val.pop();
            int n = val.pop();
            val.push(evaluation(n,m,op.pop()));
        }

        return val.peek();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(infixEvaluation(str));
    }
}

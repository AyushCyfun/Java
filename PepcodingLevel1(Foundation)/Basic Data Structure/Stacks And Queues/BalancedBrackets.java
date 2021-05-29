package StackAndQueue;
import java.util.*;
public class BalancedBrackets {

    public static boolean balancedBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else if(ch==']'){
                if(st.isEmpty() || st.peek()!='[') return false;
                else st.pop();
            }else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                else st.pop();
            }else if(ch==')'){
                if(st.isEmpty() || st.peek()!='(') return false;
                else st.pop();
            }
        }

        if(st.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(balancedBrackets(str));
    }
}

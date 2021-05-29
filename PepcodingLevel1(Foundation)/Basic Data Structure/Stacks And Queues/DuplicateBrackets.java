package StackAndQueue;
import java.util.*;
public class DuplicateBrackets {

    public static boolean duplicatesBrackets(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(st.peek()=='(') return true;

                while (st.peek()!='(') st.pop();
                st.pop();
            }else{
                st.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(duplicatesBrackets(str));
    }
}

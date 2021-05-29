package StackAndQueue;
import java.util.*;
public class SmallestNumberFollowingPattern {

    public static void SmallestNumber(String str){
        Stack<Integer> st = new Stack<>();
        int val = 1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='d') st.push(val++);

            else if(ch=='i'){
                st.push(val++);
                while(!st.isEmpty()) System.out.print(st.pop());
            }
        }

        st.push(val);
        while(!st.isEmpty()) System.out.print(st.pop());
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        SmallestNumber(str);
    }
}

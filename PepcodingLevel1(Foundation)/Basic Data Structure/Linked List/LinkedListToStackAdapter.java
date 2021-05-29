package LinkedList;
import java.util.*;
import java.io.*;
public class LinkedListToStackAdapter {

    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<>();
        }


        int size() {
            return this.list.size();
        }

        void push(int val) {
            this.list.addLast(val);
        }

        int pop() {
            if(this.list.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            int d = this.list.getLast();
            this.list.removeLast();
            return d;
        }

        int top() {
            if(this.list.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            int d = this.list.getLast();
            return d;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToStackAdapter st = new LLToStackAdapter();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}

package StackAndQueue;
import java.util.*;
import java.io.*;
public class MinimumStackI {

    public static class MinStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return this.allData.size();
        }

        void push(int val) {
            this.allData.push(val);
            if(this.minData.isEmpty() || this.minData.peek()>val) {
                this.minData.push(val);
            }else{
                this.minData.push(this.minData.peek());
            }
        }

        int pop() {
            if(this.allData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            this.minData.pop();
            return this.allData.pop();
        }

        int top() {
            if(this.allData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            return this.allData.peek();
        }

        int min(){
            if(this.minData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            return this.minData.peek();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

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
            } else if(str.startsWith("min")){
                int val = st.min();
                if(val != -1){
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}

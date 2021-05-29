package StackAndQueue;
import java.util.*;
import java.io.*;
public class MinimumStackConstantSpace {

    public static class MinStack {
        Stack<Integer> data;
        int min;

        public MinStack() {
            data = new Stack<>();
        }

        int size() {
            return this.data.size();
        }

        void push(int val) {
            if(this.data.isEmpty()){
                this.data.push(val);
                min = val;
            }

            if(this.min>val){
                int m = (2*val) - min;
                this.data.push(m);
                this.min = val;
            }else{
                this.data.push(val);
            }
        }

        int pop() {
            if(this.data.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else if(this.data.peek()>this.min){
                return this.data.pop();
            }else{
                int d = this.min;
                this.min = (2*this.min) - this.data.pop();
                return d;
            }
        }

        int top() {
            if(this.data.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            if(this.data.peek()>this.min){
                return this.data.peek();
            }else{
                return this.min;
            }
        }

        int min() {
            if(this.data.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            return this.min;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.min();
                if (val != -1) {
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}

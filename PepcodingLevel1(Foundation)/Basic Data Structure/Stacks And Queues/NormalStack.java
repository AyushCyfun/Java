package StackAndQueue;
import java.util.*;
import java.io.*;
public class NormalStack {
    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return this.tos+1;
        }

        void display() {
            for(int i=this.tos; i>=0; i--) System.out.print(this.data[i] + " ");
            System.out.println();
        }

        void push(int val) {
            if(this.tos==this.data.length-1){
                System.out.println("Stack overflow");
                return;
            }

            this.data[++this.tos] = val;
        }

        int pop() {
            if(size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            int k = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return k;
        }

        int top() {
            if(size()==0){
                System.out.println("Stack underflow");
                return -1;
            }

            return this.data[this.tos];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

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
            } else if(str.startsWith("display")){
                st.display();
            }
            str = br.readLine();
        }
    }
}

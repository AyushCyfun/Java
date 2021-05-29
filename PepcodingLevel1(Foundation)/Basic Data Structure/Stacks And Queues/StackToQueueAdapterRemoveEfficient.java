package StackAndQueue;
import java.util.*;
import java.io.*;
public class StackToQueueAdapterRemoveEfficient {

    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        int size() {
            return this.mainS.size();
        }

        void add(int val) {
            while(!this.mainS.isEmpty()) this.helperS.push(this.mainS.pop());
            this.mainS.push(val);
            while(!this.helperS.isEmpty()) this.mainS.push(this.helperS.pop());
        }

        int remove() {
            if(this.mainS.isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }

            return this.mainS.pop();
        }

        int peek() {
            if(this.mainS.isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }

            return this.mainS.peek();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StackToQueueAdapter qu = new StackToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}

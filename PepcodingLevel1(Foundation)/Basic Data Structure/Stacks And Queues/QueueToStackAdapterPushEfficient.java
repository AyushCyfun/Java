package StackAndQueue;
import java.util.*;
import java.io.*;
public class QueueToStackAdapterPushEfficient {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return this.mainQ.size();
        }

        void push(int val) {
            this.mainQ.add(val);
        }

        int pop() {
            if(this.mainQ.isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }

            while(this.mainQ.size()>1) this.helperQ.add(this.mainQ.remove());
            int d = this.mainQ.remove();
            while(!this.helperQ.isEmpty()) this.mainQ.add(this.helperQ.remove());
            return d;
        }

        int top() {
            if(this.mainQ.isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }

            while(this.mainQ.size()>1) this.helperQ.add(this.mainQ.remove());
            int d = this.mainQ.remove();

            this.helperQ.add(d);
            while(!this.helperQ.isEmpty()) this.mainQ.add(this.helperQ.remove());
            return d;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();

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
            }
            str = br.readLine();
        }
    }
}

package StackAndQueue;
import java.util.*;
import java.io.*;
public class NormalQueue {

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            return this.size;
        }

        void display() {
            for(int i=0; i<this.size; i++){
                int idx = (this.front + i )% this.data.length;
                System.out.print(this.data[idx] + " ");
            }
            System.out.println();
        }

        void add(int val) {
            if(this.size==this.data.length){
                System.out.println("Queue overflow");
                return;
            }
            int idx = (this.front + this.size)%this.data.length;
            data[idx] = val;
            size++;
        }

        int remove() {
            if(size==0){
                System.out.println("Queue underflow");
                return -1;
            }

            int k = this.data[this.front];
            this.data[this.front] = 0;
            this.front = (this.front+1)%this.data.length;
            this.size--;
            return k;
        }

        int peek() {
            if(size==0){
                System.out.println("Queue underflow");
                return -1;
            }

            return this.data[this.front];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if(str.startsWith("remove")){
                int val = qu.remove();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("peek")){
                int val = qu.peek();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(qu.size());
            } else if(str.startsWith("display")){
                qu.display();
            }
            str = br.readLine();
        }
    }
}

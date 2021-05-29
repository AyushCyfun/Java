package StackAndQueue;
import java.util.*;
public class LargestAreaHistogramApproachSecond {

    public static int LargestArea(int []arr){
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int max = 0;

        for(int i=0; i<arr.length; i++){
            while(st.peek()!=-1 && arr[st.peek()]>=arr[i]){
                int h = arr[st.pop()];
                int b = i - st.peek() - 1;
                int area = b * h;
                max = Math.max(max,area);
            }

            st.push(i);
        }

        int n = arr.length;
        while(st.peek()!=-1){
            int h = arr[st.pop()];
            int b = n - st.peek() - 1;
            int area = b * h;
            max = Math.max(max,area);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        System.out.println(LargestArea(arr));
    }
}

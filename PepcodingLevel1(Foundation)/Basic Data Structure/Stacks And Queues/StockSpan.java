package StackAndQueue;
import java.util.*;
public class StockSpan {

    public static int[] ngol(int []arr){
        int []ans = new int[arr.length];
        Arrays.fill(ans,-1);

        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int []ans = ngol(arr);
        for(int i=0; i<n; i++){
            ans[i] = i - ans[i];
        }

        for(int i=0; i<n; i++) System.out.println(ans[i]);
    }
}

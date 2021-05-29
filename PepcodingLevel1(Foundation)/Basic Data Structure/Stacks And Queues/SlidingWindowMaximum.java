package StackAndQueue;
import java.util.*;
public class SlidingWindowMaximum {


    public static int [] ngor(int []arr){
        int []ans = new int[arr.length];
        Arrays.fill(ans,arr.length);

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }


    public static int[] MaxWindow(int []arr, int k){
        int []ans = new int[arr.length-k+1];

        int []a = ngor(arr);

        for(int i=0; i<ans.length; i++){
            int j = i;
            while(a[j]<i+k) j = a[j];

            ans[i] = arr[j];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int k = scn.nextInt();

        int []ans = MaxWindow(arr,k);
        for(int i=0; i<ans.length; i++) System.out.println(ans[i]);

    }
}

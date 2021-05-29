package StackAndQueue;
import java.util.*;
public class LargestAreaHistogramApproachOne {

    public static int[] nsor(int []arr){
        int []ans = new int[arr.length];
        Arrays.fill(ans,arr.length);

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        return ans;
    }


    public static int[] nsol(int []arr){
        int []ans = new int[arr.length];
        Arrays.fill(ans,-1);

        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }


    public static int LargestArea(int []arr){
        int []ans1 = nsor(arr);
        int []ans2 = nsol(arr);

        int max = 0;
        for(int i=0; i<arr.length; i++){
            int area = (ans1[i] - ans2[i] - 1) * arr[i];
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

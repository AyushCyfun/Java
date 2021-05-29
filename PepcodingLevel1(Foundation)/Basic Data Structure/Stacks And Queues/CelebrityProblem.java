package StackAndQueue;
import java.util.*;
import java.io.*;
public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int [][]arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) st.push(i);

        while(st.size()>1){
            int n = st.pop();
            int m = st.pop();

            if(arr[n][m]==1) st.push(m);
            else st.push(n);
        }

        int idx = st.pop();
        boolean ans = true;
        for(int i=1; i<arr.length; i++){
            if(arr[idx][i]==1){
                ans = false;
            }
        }

        if(ans){
            System.out.println(idx);
        }else{
            System.out.println("none");
        }
    }

}

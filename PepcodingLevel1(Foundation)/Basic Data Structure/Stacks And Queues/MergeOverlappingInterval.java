package StackAndQueue;
import java.util.*;
import java.io.*;
public class MergeOverlappingInterval {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b) -> {
            return a[0] - b[0];
        });

        Stack<int[]> st = new Stack<>();
        st.push(new int[]{arr[0][0],arr[0][1]});

        for(int i=1; i<arr.length; i++){
            int []a = st.peek();
            if(arr[i][0]<=a[1]){
                a[1] = Math.max(a[1],arr[i][1]);
            }else{
                st.push(new int[]{arr[i][0],arr[i][1]});
            }
        }


        int [][]ans = new int[st.size()][2];
        int i = st.size()-1;
        while (!st.isEmpty()){
            int []a = st.pop();
            ans[i][0] = a[0];
            ans[i][1] = a[1];
            i--;
        }

        for(i=0; i<ans.length; i++){
            for(int j=0; j<2; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}

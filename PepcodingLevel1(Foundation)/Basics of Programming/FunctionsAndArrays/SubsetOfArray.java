package FunctionsAndArrays;
import java.util.*;
public class SubsetOfArray {

    public static int DecimalToAnyBase(int n, int b){
        int ans = 0, len = 0;
        while(n!=0){
            ans = ans + ((int)Math.pow(10,len) * (n%b));
            n/=b;
            len++;
        }

        return ans;
    }

    public static void Subsets(int []arr){
        int tos = (int)Math.pow(2,arr.length);
        for(int i=0; i<tos; i++){
            int k = DecimalToAnyBase(i,2);
            int div = (int)Math.pow(10,arr.length-1);
            int cc = 0;
            while(cc<arr.length){
                int q = k / div;
                if(q==1) System.out.print(arr[cc] + "\t");
                else System.out.print("-\t");
                k = k % div;
                div = div / 10;
                cc++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();
        Subsets(arr);
    }
}

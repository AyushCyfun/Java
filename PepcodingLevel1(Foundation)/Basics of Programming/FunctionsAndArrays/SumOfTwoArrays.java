package FunctionsAndArrays;
import java.util.*;
public class SumOfTwoArrays {

    public static void SumOfTwoArray(int []a, int []b){
        int []ans = new int[a.length>b.length? a.length:b.length];
        int i = a.length-1, j=b.length-1,k=ans.length-1,c=0;
        while(k>=0){
            int sum = c;

            if(i>=0) sum+=a[i--];
            if(j>=0) sum+=b[j--];

            ans[k--] = sum % 10;
            c = sum / 10;
        }

        if(c!=0) System.out.println(c);
        for(i=0; i<ans.length; i++) System.out.println(ans[i]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<a.length; i++) a[i] = scn.nextInt();

        int m = scn.nextInt();
        int []b = new int[m];
        for(int i=0; i<b.length; i++) b[i] = scn.nextInt();

        SumOfTwoArray(a,b);
    }
}

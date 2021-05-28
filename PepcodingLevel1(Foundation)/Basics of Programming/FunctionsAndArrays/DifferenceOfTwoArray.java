package FunctionsAndArrays;
import java.util.*;
public class DifferenceOfTwoArray {

    public static void DifferenceOfTwoArray(int []a, int[]b){
        int []ans = new int[a.length>b.length? a.length: b.length];
        int i = a.length-1, j = b.length-1, k= ans.length-1, c=0;

        while(k>=0){
            int diff = c;
            if(j>=0) diff+=b[j--];
            if(i>=0) diff-=a[i--];

            if(diff<0){
                diff+=10;
                c= -1;
            }else{
                c = 0;
            }

            ans[k--] = diff;
        }

        i = 0;
        while(ans[i]==0) i++;

        for(j=i; j<ans.length; j++) System.out.println(ans[j]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++) a[i] = scn.nextInt();

        int m = scn.nextInt();
        int []b = new int[m];
        for(int i=0; i<m; i++) b[i] = scn.nextInt();

        DifferenceOfTwoArray(a,b);
    }
}

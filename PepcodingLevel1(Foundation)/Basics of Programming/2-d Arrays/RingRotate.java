package TwoDArray;
import java.util.*;
public class RingRotate {


    public static void OneDReverse(int []arr, int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }


    public static void rotateOneD(int []arr, int r){
        r = r % arr.length;
        if(r<0) r+=arr.length;

        OneDReverse(arr,arr.length-r,arr.length-1);
        OneDReverse(arr,0,arr.length-r-1);
        OneDReverse(arr,0,arr.length-1);
    }


    public static int[] fillOneDFromTwoD(int [][]arr, int s){
        int minr = s-1, maxr = arr.length-s, minc = s-1, maxc = arr[0].length-s;
        int t = ((maxr-minr+1)*2) + ((maxc-minc+1)*2) - 4;
        int []a = new int[t];
        int cc = 0;

        while(cc<t){
            for(int i=minr; i<=maxr; i++)a[cc++] = arr[i][minc];
            minc++;

            for(int i=minc; i<=maxc; i++) a[cc++] = arr[maxr][i];
            maxr--;

            for(int i=maxr; i>=minr; i--) a[cc++] = arr[i][maxc];
            maxc--;

            for(int i=maxc; i>=minc; i--) a[cc++] = arr[minr][i];
            minr++;
        }

        return a;

    }


    public static void fillTwoDFromOneD(int [][]arr, int s, int []a){
        int minr = s-1, maxr = arr.length-s, minc = s-1, maxc = arr[0].length-s;
        int t = ((maxr-minr+1)*2) + ((maxc-minc+1)*2) - 4;

        int cc = 0;
        while(cc<t){
            for(int i=minr; i<=maxr; i++)arr[i][minc] = a[cc++];
            minc++;

            for(int i=minc; i<=maxc; i++) arr[maxr][i] = a[cc++];
            maxr--;

            for(int i=maxr; i>=minr; i--) arr[i][maxc] = a[cc++];
            maxc--;

            for(int i=maxc; i>=minc; i--) arr[minr][i] = a[cc++];
            minr++;
        }
    }


    public static void RingRotate(int [][]arr, int s, int r){
        int []a = fillOneDFromTwoD(arr,s);
        rotateOneD(a,r);
        fillTwoDFromOneD(arr,s,a);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) arr[i][j] = scn.nextInt();
        }

        int s = scn.nextInt();
        int r = scn.nextInt();
        RingRotate(arr,s,r);
    }
}

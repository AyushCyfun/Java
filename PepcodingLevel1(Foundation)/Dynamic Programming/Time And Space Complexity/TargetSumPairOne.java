package TimeAndSpaceComplexity;
import java.util.*;
public class TargetSumPairOne {

    public static void targetSumPair(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        while(i<j){
            int s = arr[i] + arr[j];
            if(s==target){
                System.out.println(arr[i] + ", " + arr[j]);
                i++;
                j--;
            }else if(s>target){
                j--;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }
}

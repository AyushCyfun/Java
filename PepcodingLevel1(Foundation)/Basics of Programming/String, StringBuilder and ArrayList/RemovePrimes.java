package StringAndStringBuilder;
import java.util.*;
public class RemovePrimes {

    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }


    public static void RemovePrimes(ArrayList<Integer>arr){
        for(int i=arr.size()-1; i>=0; i--){
            if(isPrime(arr.get(i))) arr.remove(i);
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) arr.add(scn.nextInt());

        RemovePrimes(arr);
    }
}

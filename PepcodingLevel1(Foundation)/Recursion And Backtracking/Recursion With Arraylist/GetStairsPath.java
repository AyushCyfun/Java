package RecursionWithArraylist;
import java.util.*;
public class GetStairsPath {

    public static ArrayList<String> GetStairsPath(int n){
        if(n<0) return new ArrayList<>();
        else if(n==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> recans1 = GetStairsPath(n-1);
        ArrayList<String> recans2 = GetStairsPath(n-2);
        ArrayList<String> recans3 = GetStairsPath(n-3);

        ArrayList<String> myans = new ArrayList<>();
        for(int i=0; i<recans1.size(); i++) myans.add("1" + recans1.get(i));
        for(int i=0; i<recans2.size(); i++) myans.add("2" + recans2.get(i));
        for(int i=0; i<recans3.size(); i++) myans.add("3" + recans3.get(i));
        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = GetStairsPath(n);
        System.out.println(ans);
    }
}

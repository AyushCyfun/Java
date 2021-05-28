package RecursionWithArraylist;
import java.util.*;
public class GetSubsequence {

    public static ArrayList<String> getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> recans = getSubsequence(str.substring(1));
        ArrayList<String> myans = new ArrayList<>();

        for(int i=0; i<recans.size(); i++) myans.add(recans.get(i));
        for(int i=0; i<recans.size(); i++) myans.add(str.charAt(0) + recans.get(i));
        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getSubsequence(str);
        System.out.println(ans);
    }
}

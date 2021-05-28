package RecursionWithArraylist;
import java.util.*;
public class GetKpc {

    static String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> recans = getKPC(str.substring(1));
        ArrayList<String> myans = new ArrayList<>();
        String s = keys[str.charAt(0)-'0'];
        for(int i=0; i<s.length(); i++){
            for (int j=0; j<recans.size(); j++) myans.add(s.charAt(i) + recans.get(j));
        }

        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }
}

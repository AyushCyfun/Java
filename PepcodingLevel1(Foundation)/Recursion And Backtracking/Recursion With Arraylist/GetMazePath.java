package RecursionWithArraylist;
import java.util.*;
public class GetMazePath {

    public static ArrayList<String> GetMazePath(int sr, int sc, int er,int ec){
        if(sr>er || sc>ec) return new ArrayList<>();
        else if(sr==er && sc==ec){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> recans1 = GetMazePath(sr,sc+1,er,ec);
        ArrayList<String> recans2 = GetMazePath(sr+1,sc,er,ec);

        ArrayList<String> myans = new ArrayList<>();

        for(int i=0; i<recans1.size(); i++) myans.add("h" + recans1.get(i));
        for(int i=0; i<recans2.size(); i++) myans.add("v" + recans2.get(i));

        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();

        ArrayList<String> ans = GetMazePath(0,0,er-1,ec-1);
        System.out.println(ans);
    }
}

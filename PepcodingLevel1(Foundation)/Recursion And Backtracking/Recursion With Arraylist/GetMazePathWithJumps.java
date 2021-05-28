package RecursionWithArraylist;
import java.util.*;
public class GetMazePathWithJumps {

    public static ArrayList<String> GetMazePathWithJumps(int sr,int sc, int er, int ec){
        if(sr>er || sc>ec) return new ArrayList<>();
        else if(sr==er && sc==ec){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> myans = new ArrayList<>();
        for(int i=1; i<=ec; i++){
            ArrayList<String> recans1 = GetMazePathWithJumps(sr,sc+i,er,ec);
            for(int j=0; j<recans1.size(); j++) {
                myans.add("h" + i + recans1.get(j));
            }
        }

        for(int i=1; i<=er; i++){
            ArrayList<String> recans2 = GetMazePathWithJumps(sr+i,sc,er,ec);
            for(int j=0; j<recans2.size(); j++) {
                myans.add("v" + i + recans2.get(j));
            }
        }

        for(int i=1; i<=er && i<=ec; i++){
            ArrayList<String> recans3 = GetMazePathWithJumps(sr+i,sc+i,er,ec);
            for(int j=0; j<recans3.size(); j++) {
                myans.add("d" + i + recans3.get(j));
            }
        }

        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();
        ArrayList<String> ans = GetMazePathWithJumps(0,0,er-1,ec-1);
        System.out.println(ans);
    }
}

package RecursionOnTheWayUp;
import java.util.*;
public class PrintMazePath {

    public static void PrintMazePath(int sr, int sc, int er, int ec, String ans){
        if(sr>er || sc>ec) return;
        else if(sr==er && sc==ec){
            System.out.println(ans);
            return;
        }

        PrintMazePath(sr,sc+1,er,ec,ans+"h");
        PrintMazePath(sr+1,sc,er,ec,ans+"v");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();
        PrintMazePath(0,0,er-1,ec-1,"");
    }
}

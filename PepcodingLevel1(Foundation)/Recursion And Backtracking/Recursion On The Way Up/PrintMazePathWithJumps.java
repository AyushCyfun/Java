package RecursionOnTheWayUp;
import java.util.*;
public class PrintMazePathWithJumps {

    public static void PrintMazePathWithJumps(int sr, int sc, int er, int ec, String ans){
        if(sr>er || sc>ec) return;
        else if(sr==er && sc==ec){
            System.out.println(ans);
            return;
        }

        for(int i=1; i<=ec; i++)PrintMazePathWithJumps(sr,sc+i,er,ec,ans+"h"+i);
        for(int i=1; i<=er; i++)PrintMazePathWithJumps(sr+i,sc,er,ec,ans+"v"+i);
        for(int i=1; i<=ec && i<=er; i++)PrintMazePathWithJumps(sr+i,sc+i,er,ec,ans+"d"+i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();
        PrintMazePathWithJumps(0,0,er-1,ec-1,"");
    }
}

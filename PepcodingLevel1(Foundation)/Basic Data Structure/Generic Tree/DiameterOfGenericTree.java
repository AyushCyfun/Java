package GenericTree;
import java.util.*;
import java.io.*;
public class DiameterOfGenericTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static int smax = -1;
    static int maxDia = 0;
    public static int diameter(Node node){
        int max = -1;
        for(int i=0; i<node.children.size(); i++){
            int ans = diameter(node.children.get(i));
            if(ans>max){
                smax = max;
                max = ans;
            }else if(ans>smax){
                smax = ans;
            }
        }

        int sum = max + smax + 2;
        if(sum>maxDia){
            maxDia = sum;
        }

        return max + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        diameter(root);
        System.out.println(maxDia);
    }
}

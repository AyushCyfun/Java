package GenericTree;
import java.util.*;
import java.io.*;
public class PredecessorAndSuccessorOfAnElement {

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

    static Node predecessor;
    static Node successor;
    static int state;
    public static void predecessorAndSuccessor(Node node, int data) {
        if(node.data==data){
            state++;
        }else if(state==1){
            predecessor = node;
        }else if(state==2){
            successor = node;
            state++;
        }

        for(int i=0; i<node.children.size(); i++){
            predecessorAndSuccessor(node.children.get(i),data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int data = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        predecessor = null;
        successor = null;
        state = 1;
        predecessorAndSuccessor(root, data);
        if(predecessor == null){
            System.out.println("Predecessor = Not found");
        } else {
            System.out.println("Predecessor = " + predecessor.data);
        }

        if(successor == null){
            System.out.println("Successor = Not found");
        } else {
            System.out.println("Successor = " + successor.data);
        }
    }
}

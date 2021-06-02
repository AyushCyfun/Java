import java.util.*;
public class StackUsingLinkedList {

    private LinkedList<Integer> ll;

    public StackUsingLinkedList(){
        this.ll = new LinkedList<>();
    }

    public void StackUnderflowException() throws Exception{
        if(this.ll.size()==0){
            throw new Exception("Stack is empty");
        }
    }

    public int size(){
        return this.ll.size();
    }

    public boolean isEmpty(){
        return this.ll.size()==0;
    }

    public void push(int val){
        this.ll.addLast(val);
    }

    private int peek_(){
        return this.ll.getLast();
    }

    public int peek() throws Exception{
        StackUnderflowException();
        return peek_();
    }

    private int pop_(){
        int data = this.ll.getLast();
        this.ll.removeLast();
        return data;
    }

    public int pop() throws Exception{
        StackUnderflowException();
        return pop_();
    }
}

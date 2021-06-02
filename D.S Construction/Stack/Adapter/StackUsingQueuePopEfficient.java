import java.util.*;
public class StackUsingQueuePopEfficient {

    private Queue<Integer> main;
    private Queue<Integer> helper;

    public StackUsingQueuePopEfficient(){
        this.main = new ArrayDeque<>();
        this.helper = new ArrayDeque<>();
    }

    private void StackUnderflowException() throws Exception{
        if(this.main.size()==0){
            throw new Exception("Stack is empty");
        }
    }

    public int size(){
        return this.main.size();
    }

    public boolean isEmpty(){
        return this.main.size()==0;
    }

    public void push(int val){
        while(!this.main.isEmpty()) this.helper.add(this.main.remove());
        this.main.add(val);
        while(!this.helper.isEmpty()) this.main.add(this.helper.remove());
    }

    private int peek_(){
        return this.main.peek();
    }

    public int peek() throws Exception{
        StackUnderflowException();
        return peek_();
    }

    private int pop_(){
        return this.main.remove();
    }

    public int pop() throws Exception{
        StackUnderflowException();
        return pop_();
    }

}

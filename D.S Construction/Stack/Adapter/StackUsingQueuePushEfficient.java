import java.util.*;
public class StackUsingQueuePushEfficient {

    private Queue<Integer> main;
    private Queue<Integer> helper;

    public StackUsingQueuePushEfficient(){
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
        this.main.add(val);
    }

    private int peek_(){
        while(this.main.size()>1){
            this.helper.add(this.main.remove());
        }

        int data = this.main.remove();
        this.helper.add(data);

        while(this.helper.size()!=0){
            this.main.add(this.helper.remove());
        }

        return data;
    }

    public int peek() throws Exception{
        StackUnderflowException();
        return peek_();
    }

    private int pop_(){
        while(this.main.size()>1){
            this.helper.add(this.main.remove());
        }

        int data = this.main.remove();

        while(this.helper.size()!=0){
            this.main.add(this.helper.remove());
        }

        return data;
    }


    public int pop() throws Exception{
        StackUnderflowException();
        return pop_();
    }
}


import java.util.*;
public class Stack {

    private int []arr;
    private int tos;
    private int NoOfElements;
    private int MaxCapacity;

    protected void initialize(int size){
        this.arr = new int[size];
        this.tos = -1;
        this.NoOfElements = 0;
        this.MaxCapacity = size;
    }

    public Stack(){
        initialize(10);
    }

    public Stack(int size){
        initialize(size);
    }

    public void StackOverflowException() throws Exception{
        if(this.NoOfElements==this.MaxCapacity){
            throw new Exception("Stack is full");
        }
    }

    public void StackUnderflowException() throws Exception{
        if(this.NoOfElements==0){
            throw new Exception("Stack is empty");
        }
    }

    protected int GetCapacity(){
        return this.MaxCapacity;
    }

    public int size(){
        return this.NoOfElements;
    }

    public boolean isEmpty(){
        return this.NoOfElements==0;
    }

    private void push_(int val){
        this.arr[++this.tos] = val;
        this.NoOfElements++;
    }

    public void push(int val) throws Exception{
        StackOverflowException();
        push_(val);
    }

    private int peek_(){
        return this.arr[this.tos];
    }

    public int peek()throws Exception{
        StackUnderflowException();
        return peek_();
    }

    private int pop_(){
        int data = this.arr[this.tos];
        this.arr[this.tos] = 0;
        this.tos--;
        this.NoOfElements--;
        return data;
    }

    public int pop() throws Exception{
        StackUnderflowException();
        return pop_();
    }
}

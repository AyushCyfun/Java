import java.util.*;
public class MinStack extends DynamicStack{

    private int min;

    public MinStack(){
        super();
    }

    public MinStack(int size){
        super(size);
    }

    public int getMin(){
        return this.min;
    }

    @Override
    public void push(int val) throws Exception{
        if(super.isEmpty()){
            super.push(val);
            this.min = val;
        }else if(val>=this.min){
            super.push(val);
        }else{
            int data = (2 * val) - this.min;
            super.push(data);
            this.min = val;
        }
    }

    @Override
    public int peek() throws Exception{
        if(super.peek()>this.min){
            return super.peek();
        }else{
            return this.min;
        }
    }

    @Override
    public int pop() throws Exception{
        if(super.peek()>=this.min){
            return super.pop();
        }

        int data = this.min;
        this.min = (2 * data) - super.pop();
        return data;
    }
}

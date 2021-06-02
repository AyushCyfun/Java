import java.util.*;
public class DynamicStack extends Stack {

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int val) throws Exception{
        if(super.GetCapacity()==super.size()){
            int n = super.size();
            int []temp = new int[n];
            int i = n-1;
            while(!super.isEmpty()){
                temp[i--] = super.pop();
            }

            super.initialize(n*2);
            for(i=0; i<n; i++){
                super.push(temp[i]);
            }
        }
        super.push(val);
    }
}

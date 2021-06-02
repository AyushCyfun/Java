import java.util.*;
public class client {

    public static void main(String[] args) throws Exception{
        StackUsingQueuePushEfficient stOne = new StackUsingQueuePushEfficient();
        for(int i=0; i<10; i++){
            stOne.push(i + 10);
        }

        while(!stOne.isEmpty()){
            System.out.println(stOne.pop());
        }


        StackUsingQueuePopEfficient stTwo = new StackUsingQueuePopEfficient();
        for(int i=0; i<10; i++){
            stTwo.push(i);
        }

        while (!stTwo.isEmpty()){
            System.out.println(stTwo.pop());
        }

        StackUsingLinkedList stThree = new StackUsingLinkedList();
        for(int i=0; i<100; i++){
            stThree.push(i);
        }

        while(!stThree.isEmpty()){
            System.out.println(stThree.pop());
        }

    }
}

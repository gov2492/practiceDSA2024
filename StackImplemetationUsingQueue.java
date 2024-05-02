package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplemetationUsingQueue {


    Queue<Integer> q1;
    Queue<Integer> q2;
    int size=0;

    public StackImplemetationUsingQueue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public void push(int a){
       size++;
       q2.add(a);
       while(!q1.isEmpty()){
           q2.add(q1.peek());
           q1.remove();
       }
       Queue<Integer> q=q1;
       q1=q2;
       q2=q;
    }
    public void pop(){
        if(q1.isEmpty()){
            return;
        }
        q1.remove();
        size--;
    }
    public int top(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    public static void main(String[] args) {
        StackImplemetationUsingQueue stack = new StackImplemetationUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.top());
        stack.pop();

        System.out.println(stack.top());
        stack.pop();

        System.out.println(stack.top());
        stack.pop();

        System.out.println(stack.top());
        stack.pop();

        System.out.println(stack.top());

    }
}

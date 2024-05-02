package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
        reverseIterative(queue);
        System.out.println(queue);

    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }

    public static void reverseIterative(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int a = queue.poll();
        reverse(queue);
        queue.offer(a);
    }
}

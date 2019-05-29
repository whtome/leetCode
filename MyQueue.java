package bit.com;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stackA = new Stack<>();
    private Stack<Integer> stackB = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackA.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackB.isEmpty()) {
            int len = stackA.size();
            for (int i = 0; i < len; i++) {
                stackB.push(stackA.pop());
            }
        }
        int result = stackB.peek();
        stackB.pop();
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if (stackB.isEmpty()) {
            int len = stackA.size();
            for (int i = 0; i < len; i++) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackA.isEmpty() && stackB.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


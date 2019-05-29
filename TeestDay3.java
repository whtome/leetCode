package bit.com;


import java.util.Arrays;
import java.util.Stack;

//class MinStack {
//
//
//    /** initialize your data structure here. */
//
//    private int n=10;
//    private Object[] elementdata = new Object[n];
//    private Object[] mindata = new Object[n];
//    private int currentSize;
//    private int minSize;
//
//
//    public MinStack() {
//
//    }
//
//    public void push(int x) {
//            if (currentSize == 0) {
//                elementdata[currentSize++] = x;
//                mindata[minSize++] = x;
//            }else if (currentSize < n){
//                elementdata[currentSize++] = x;
//                if (x < (int) mindata[minSize-1]) {
//                    mindata[minSize++] = x;
//                }
//            }else {
//                int oldCount = n;
//                int newCount = oldCount << 1;
//                if (((newCount+8) - Integer.MAX_VALUE) > 0 ) {
//                    return;
//                }
//                n = newCount;
//                elementdata = Arrays.copyOf(elementdata,newCount);
//                elementdata[currentSize++] = x;
//                if (x < (int) mindata[minSize-1]) {
//                    mindata[minSize++] = x;
//                }
//
//            }
//    }
//
//    public void pop() {
//        if (currentSize > 0) {
//            if (elementdata[currentSize - 1] == mindata[minSize - 1]) {
//                mindata[--minSize] = null;
//            }
//            elementdata[--currentSize] = null;
//        }else {
//            System.out.println("栈已空");
//        }
//    }
//    public int top() {
//        if (currentSize > 0) {
//            return (int) elementdata[currentSize - 1];
//        }else {
//            return Integer.parseInt(null);
//        }
//    }
//
//    public int getMin() {
//        if (minSize > 0) {
//            return (int) mindata[minSize-1];
//        }else {
//            return Integer.parseInt(null);
//        }
//    }
//
//}


class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;


    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minstack.isEmpty() || x <= minstack.peek()){
            minstack.push(x);
        }
    }

    public void pop() {

        if (stack.peek().equals(minstack.peek())) {
            minstack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}



public class TeestDay3{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

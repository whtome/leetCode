package bit.com;

public class MyCircularQueue {

    private Object[] data;
    private int head;
    private int tail;
    private int size;


    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new Object[k+1];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        data[tail] = value;
        tail = (tail+1)%data.length;
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        data[head] = null;
        head = (head+1)%data.length;
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return (int) data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return (int) data[(tail+data.length-1)%data.length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(size == (data.length-1)) {//  (tail+1)%data.length == head;
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */


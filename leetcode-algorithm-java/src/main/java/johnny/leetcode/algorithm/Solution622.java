package johnny.leetcode.algorithm;

/**
 * 622. Design Circular Queue
 * Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.
 * <p>
 * Your implementation should support following operations:
 * <p>
 * MyCircularQueue(k): Constructor, set the size of the queue to be k.
 * Front: Get the front item from the queue. If the queue is empty, return -1.
 * Rear: Get the last item from the queue. If the queue is empty, return -1.
 * enQueue(value): Insert an element into the circular queue. Return true if the operation is successful.
 * deQueue(): Delete an element from the circular queue. Return true if the operation is successful.
 * isEmpty(): Checks whether the circular queue is empty or not.
 * isFull(): Checks whether the circular queue is full or not.
 * <p>
 * <p>
 * Example:
 * <p>
 * MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
 * circularQueue.enQueue(1);  // return true
 * circularQueue.enQueue(2);  // return true
 * circularQueue.enQueue(3);  // return true
 * circularQueue.enQueue(4);  // return false, the queue is full
 * circularQueue.Rear();  // return 3
 * circularQueue.isFull();  // return true
 * circularQueue.deQueue();  // return true
 * circularQueue.enQueue(4);  // return true
 * circularQueue.Rear();  // return 4
 * <p>
 * Note:
 * <p>
 * All values will be in the range of [0, 1000].
 * The number of operations will be in the range of [1, 1000].
 * Please do not use the built-in Queue library.
 *
 * @author Johnny
 */
public class Solution622 {
    private int head; // the first node in queue, not the first item in array
    private int tail; // the last node in queue, not the first item in array
    private int[] arr;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public Solution622(int k) {
        arr = new int[k];
        head = -1;
        tail = -1;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     * @param value value
     * @return result
     */
    public boolean enQueue(int value) {
        // check if queue is full
        if (isFull()) {
            return false;
        }
        // reset tail if it reaches to the end
        if (tail == arr.length - 1 && head != 0) {
            tail = 0;
            arr[tail] = value;
        } else {
            arr[++tail] = value;
            if (head == -1) {
                head = 0;
            }
        }

        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     * @return result
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        //int value = arr[head];
        if (head == tail) {
            // empty, reset to initial status
            head = -1;
            tail = -1;
        } else if (head == arr.length - 1) {
            head = 0;
        } else {
            head++;
        }

        //return vale;
        return true;
    }

    /**
     * Get the front item from the queue.
     * @return result
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }

    /**
     * Get the last item from the queue.
     * @return result
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[tail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     * @return result
     */
    public boolean isEmpty() {
        return head == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     * @return result
     */
    public boolean isFull() {
        if (tail == arr.length - 1 && head == 0 || tail == head - 1) {
            return true;
        }

        return false;
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

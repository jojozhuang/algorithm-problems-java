package johnny.cc150.algorithm;

/**
 *
 * @author Johnny
 */
public class ArrayQueue {
    private int head; // the first node
    private int tail; // the last node
    private int[] arr;
    
    public ArrayQueue(int capacity) {
        arr = new int[capacity];
        head = -1;
        tail = -1;
    }
    
    // Add value to the array
    public void enqueue(int value) {
        arr[++tail] = value;
        if (head == -1) {
            head = 0;
        }
    }
    
    // Remove value from the array
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        int value = arr[head];
        head++;
        return value;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return arr[head];
    }
    
    public boolean isEmpty() {
        return (head > tail) || (head == -1);
    }
}

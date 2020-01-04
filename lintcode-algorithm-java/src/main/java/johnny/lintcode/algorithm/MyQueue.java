package johnny.lintcode.algorithm;

/**
 * Implement Queue by Linked List
 * <p>
 * Implement a Queue by linked list. Support the following basic methods:
 * <p>
 * enqueue(item). Put a new item in the queue.
 * dequeue(). Move the first item out of the queue, return it.
 * <p>
 * Example
 * Example 1:
 * <p>
 * Input:
 * enqueue(1)
 * enqueue(2)
 * enqueue(3)
 * dequeue() // return 1
 * enqueue(4)
 * dequeue() // return 2
 * Example 2:
 * <p>
 * Input:
 * enqueue(10)
 * dequeue()// return 10
 *
 * @author Johnny
 */
public class MyQueue {
    private ListNode head; // the first node
    private ListNode tail; // the last node

    public MyQueue() {
        head = null;
        tail = null;
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void enqueue(int item) {
        if (tail == null) {
            tail = new ListNode(item);
            head = tail;
        } else {
            tail.next = new ListNode(item);
            tail = tail.next;
        }
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        if (head == null) {
            return -1;
        }
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}

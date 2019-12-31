package johnny.cc150.algorithm.common;

/**
 *
 * @author Johnny
 */
public class DoublyListNode {
    public int val;
    public DoublyListNode previous;
    public DoublyListNode next;
    public DoublyListNode(int x) {
        val = x;
        previous = null;
        next = null;
    }
    
    public static DoublyListNode create(int[] values) {  
        if (values == null || values.length == 0) {
            return null;
        }
        
        DoublyListNode dummy = new DoublyListNode(0);
        DoublyListNode curr = dummy;
        for (int i = 0; i < values.length; i++) {
            curr.next = new DoublyListNode(values[i]);
            curr.next.previous = curr;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}

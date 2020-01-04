package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Linked List Random Node
 * 
 * Given a singly linked list, return a random node's value from the linked list. 
 * Each node must have the same probability of being chosen.
 * 
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you? 
 * Could you solve this efficiently without using extra space
 * 
 * Example:
 * 
 * // Init a singly linked list [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 * 
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should 
 * have equal probability of returning.
 * 
 * solution.getRandom();
 * 
 * @author Johnny
 */
public class Solution382 {
    Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at 
        least one node. */
    public Solution382(ListNode head) {
        int i = 0;
        while (head != null) {
            map.put(i, head);
            head = head.next;
            i++;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        Random r = new Random();
        int num = r.nextInt(map.size());
        return map.get(num).val;
    }
}

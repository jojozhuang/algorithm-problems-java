package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List
 * <p>
 * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
 * <p>
 * After doing so, return the head of the final linked list.  You may return any such answer.
 * <p>
 * <p>
 * <p>
 * (Note that in the examples below, all sequences are serializations of ListNode objects.)
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,-3,3,1]
 * Output: [3,1]
 * Note: The answer [1,2,1] would also be accepted.
 * Example 2:
 * <p>
 * Input: head = [1,2,3,-3,4]
 * Output: [1,2,4]
 * Example 3:
 * <p>
 * Input: head = [1,2,3,-3,-2]
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given linked list will contain between 1 and 1000 nodes.
 * Each node in the linked list has -1000 <= node.val <= 1000.
 *
 * @author Johnny
 */
public class SolutionA1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        Stack<ListNode> stack = new Stack<>();
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        map.put(0, dummy);
        stack.push(dummy);
        while (curr != null) {
            if (curr.val == 0) {
                prev.next = curr.next;
                curr = curr.next;
                continue;
            }
            sum += curr.val;
            if (!map.containsKey(sum)) {
                map.put(sum, curr);
                stack.push(curr);
                prev = curr;
                curr = curr.next;
            } else {
                ListNode node = map.get(sum);
                sum -= curr.val;
                while (!stack.isEmpty()) {
                    ListNode top = stack.peek();
                    if (node == top) {
                        break;
                    } else {
                        stack.pop();
                        map.remove(sum);
                        sum -= top.val;
                    }
                }
                ListNode next = curr.next;
                node.next = next;
                curr = next;
                prev = node;
            }
        }

        return dummy.next;
    }
}

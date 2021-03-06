package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1019. Next Greater Node In Linked List
 * We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
 * <p>
 * {@code Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.}
 * <p>
 * Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
 * <p>
 * Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of a linked list with a head node value of 2, second node value of 1, and third node value of 5.
 * <p>
 * Example 1:
 * Input: [2,1,5]
 * Output: [5,5,0]
 * <p>
 * Example 2:
 * Input: [2,7,4,3,5]
 * Output: [7,0,5,5,0]
 * <p>
 * Example 3:
 * Input: [1,7,5,1,9,2,5,1]
 * Output: [7,9,9,9,0,5,0,0]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= node.val <= 10^9 for each node in the linked list.
 * The given list has length in the range [0, 10000].
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1019 {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) {
            return new int[]{};
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] ans = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(list.get(list.size() - 1));
        ans[ans.length - 1] = 0;
        for (int i = list.size() - 2; i >= 0; i--) {
            while (!stack.isEmpty() && list.get(i) >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(list.get(i));
        }

        return ans;
    }
}

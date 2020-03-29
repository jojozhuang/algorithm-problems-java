package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 817. Linked List Components
 * We are given head, the head node of a linked list containing unique integer values.
 * <p>
 * We are also given the list G, a subset of the values in the linked list.
 * <p>
 * Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.
 * <p>
 * Example 1:
 * Input:
 * head: {@code 0->1->2->3}
 * G = [0, 1, 3]
 * Output: 2
 * Explanation:
 * 0 and 1 are connected, so [0, 1] and [3] are the two connected components.
 * <p>
 * Example 2:
 * Input:
 * head: {@code 0->1->2->3->4}
 * G = [0, 3, 1, 4]
 * Output: 2
 * Explanation:
 * 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
 * Note:
 * <pre>{@code
 * If N is the length of the linked list given by head, 1 <= N <= 10000.
 * The value of each node in the linked list will be in the range [0, N - 1].
 * 1 <= G.length <= 10000.
 * G is a subset of all values in the linked list.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution817 {
    public int numComponents(ListNode head, int[] G) {
        DSU dsu = new DSU(G);
        while (head != null && head.next != null) {
            dsu.union(head.val, head.next.val);
            head = head.next;
        }

        return dsu.count;
    }

    public class DSU {
        Map<Integer, Integer> map; // <child, parent>, use map instead of array
        int count; // the number of component groups

        public DSU(int[] nodes) {
            map = new HashMap<>();
            for (int node : nodes) {
                map.put(node, node);
            }
            count = nodes.length;
        }

        public int find(int i) {
            while (map.get(i) != i) {
                map.put(i, map.get(map.get(i)));
                i = map.get(i);
            }
            return map.get(i);
        }

        public void union(int i, int j) {
            if (map.containsKey(i) && map.containsKey(j)) {
                int p1 = find(i);
                int p2 = find(j);
                map.put(p1, p2);
                count--;
            }
        }
    }

    public int numComponents2(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int g : G) {
            set.add(g);
        }

        int ans = 0;
        while (head != null) {
            if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) {
                ans++;
            }
            head = head.next;
        }

        return ans;
    }
}

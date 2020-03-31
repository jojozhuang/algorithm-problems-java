package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * First Unique Number in Data Stream
 * Given a continuous stream of data, write a function that returns the first unique number (including the last number)
 * when the terminating number arrives. If the unique number is not found, return -1.
 *
 * Example
 * Example1
 * Input:
 * [1, 2, 2, 1, 3, 4, 4, 5, 6]
 * 5
 * Output: 3
 *
 * Example2
 * Input:
 * [1, 2, 2, 1, 3, 4, 4, 5, 6]
 * 7
 * Output: -1
 *
 * Example3
 * Input:
 * [1, 2, 2, 1, 3, 4]
 * 3
 * Output: 3
 *
 */
public class FirstUniqueNumberInDataStream {
    public int firstUniqueNumber(int[] nums, int number) {
        DataStream ds = new DataStream();
        for (int num : nums) {
            ds.add(num);
            if (num == number) {
                return ds.getFirstUnique();
            }
        }

        return -1;
    }

    class DataStream {
        ListNode head;
        ListNode tail;
        Map<Integer, ListNode> map; // numbers appear only once
        Set<Integer> set; // duplicated numbers
        public DataStream() {
            head = new ListNode(-1);
            tail = new ListNode(-1);
            head.next = tail;
            tail.prev = head;
            map = new HashMap<>();
            set = new HashSet<>();
        }

        public void add(int num) {
            if (set.contains(num)) {
                return;
            }

            if (!map.containsKey(num)) {
                ListNode node = new ListNode(num);
                node.prev = tail.prev;
                tail.prev.next = node;
                node.next = tail;
                tail.prev = node;
                map.put(num, node);
            } else {
                ListNode node = map.get(num);
                node.prev.next = node.next;
                node.next.prev = node.prev;
                map.remove(num);
                set.add(num);
            }
        }

        public int getFirstUnique() {
            ListNode node = head.next;
            if (node != null && node != tail) {
                return node.val;
            }

            return -1;
        }
    }

    class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
}

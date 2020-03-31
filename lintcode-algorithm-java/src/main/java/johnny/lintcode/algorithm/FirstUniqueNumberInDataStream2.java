package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * First Unique Number in Data Stream II
 * We need to implement a data structure named DataStream. There are two methods required to be implemented:
 *
 * void add(number) // add a new number
 * int firstUnique() // return first unique number
 * You can assume that there must be at least one unique number in the stream when calling the firstUnique.
 *
 * Have you met this question in a real interview?
 * Example
 *
 * Example 1:
 * Input:
 * add(1)
 * add(2)
 * firstUnique()
 * add(1)
 * firstUnique()
 * Output:
 * [1,2]
 *
 * Example 2:
 * Input:
 * add(1)
 * add(2)
 * add(3)
 * add(4)
 * add(5)
 * firstUnique()
 * add(1)
 * firstUnique()
 * add(2)
 * firstUnique()
 * add(3)
 * firstUnique()
 * add(4)
 * firstUnique()
 * add(5)
 * add(6)
 * firstUnique()
 * Output:
 * [1,2,3,4,5,6]
 *
 */
public class FirstUniqueNumberInDataStream2 {
    private ListNode head;
    private ListNode tail;
    private Map<Integer, ListNode> map; // numbers appear only once
    private Set<Integer> set; // duplicated numbers

    public FirstUniqueNumberInDataStream2() {
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

    public int firstUnique() {
        ListNode node = head.next;
        if (node != null && node != tail) {
            return node.val;
        }

        return -1;
    }

    protected class ListNode {
        public int val;
        public ListNode prev;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
}

package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 1481. Least Number of Unique Integers after K Removals
 *
 * Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [5,5,4], k = 1
 * Output: 1
 * Explanation: Remove the single 4, only 5 is left.
 * Example 2:
 * Input: arr = [4,3,1,1,3,3,2], k = 3
 * Output: 2
 * Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^5
 * 1 <= arr[i] <= 10^9
 * 0 <= k <= arr.length
 *
 */
public class SolutionA1481 {
    class Item {
        public int val;
        public int count;
        public Item(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }

        List<Item> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(new Item(key, map.get(key)));
        }
        Collections.sort(list, (a, b)->a.count-b.count);

        Queue<Item> queue = new LinkedList<>();
        for (Item item : list) {
            queue.offer(item);
        }

        Item item = null;
        while (!queue.isEmpty() && k > 0) {
            item = queue.poll();
            k = k - item.count;
            if (k < 0) {
                queue.offer(item);
            }
        }

        return queue.size();
    }
}

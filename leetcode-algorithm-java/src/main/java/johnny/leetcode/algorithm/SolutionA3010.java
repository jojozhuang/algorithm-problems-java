package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 */
public class SolutionA3010 {
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

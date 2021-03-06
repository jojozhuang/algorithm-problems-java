package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Insert Delete GetRandom O(1)
 * <p>
 * Design a data structure that supports all following operations in average O(1) time.
 * <p>
 * insert(val): Inserts an item val to the set if not already present.
 * <p>
 * remove(val): Removes an item val from the set if present.
 * <p>
 * getRandom: Returns a random element from current set of elements. Each
 * element must have the same probability of being returned.
 * <p>
 * Example:
 * <p>
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 * <p>
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 * <p>
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 * <p>
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 * <p>
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 * <p>
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 * <p>
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 *
 * @author Johnny
 */
public class Solution380 {
    Map<Integer, Integer> map; // <value, index>, index in the list when value was inserted
    List<Integer> list;
    Random random;

    /**
     * Initialize your data structure here.
     */
    public Solution380() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     * @param val value
     * @return result
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     * @param val value
     * @return result
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int index = map.get(val);
            // swap the value with the last one in the list
            if (index < list.size() - 1) {
                int last = list.get(list.size() - 1);
                // move the last element to new position
                list.set(index, last);
                // update the map with the new position of this element
                map.put(last, index);
                // no need to do the above two steps for 'val', since it will be deleted.
            }
            // always delete the last element of the list
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
    }

    /**
     * Get a random element from the set.
     * @return result
     */
    public int getRandom() {
        if (list.isEmpty()) {
            return 0;
        }

        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

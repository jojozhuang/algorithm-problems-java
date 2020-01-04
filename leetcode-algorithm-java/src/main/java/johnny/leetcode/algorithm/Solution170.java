package johnny.leetcode.algorithm;

import java.util.HashMap;

/**
 * Data structure design.
 * <p>
 * Design and implement a TwoSum class. It should support the following operations: add and find.
 * <p>
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 * <p>
 * For example,
 * add(1); add(3); add(5);
 * {@code find(4) -> true}
 * {@code find(7) -> false}
 *
 * @author Johnny
 */
public class Solution170 {
    private HashMap<Integer, Integer> map = new HashMap<>();

    /**
     * Initialize your data structure here.
     */
    public Solution170() {

    }

    /**
     * Add the number to an internal data structure.
     * @param number number
     */
    public void add(int number) {
        if (!map.containsKey(number)) {
            map.put(number, 1);
        } else {
            map.put(number, map.get(number) + 1);
        }
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     * @param value value
     * @return result
     */
    public boolean find(int value) {
        for (Integer i : map.keySet()) {
            int target = value - i;
            if (map.containsKey(target)) {
                if (i == target && map.get(target) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}

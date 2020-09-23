package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Majority Element II.
 * Given an integer array of size n, find all elements that appear more than  n/3 times.
 * The algorithm should run in linear time and in O(1) space.
 *
 * @author Johnny
 */
public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }

        Integer a = null;
        Integer b = null;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a == null || nums[i] == a) {
                a = nums[i];
                count1++;
            } else {
                if (b == null || nums[i] == b) {
                    b = nums[i];
                    count2++;
                } else {
                    count1--;
                    count2--;
                    if (count2 == 0) {
                        b = null;
                    }
                    if (count1 == 0) {
                        a = b;
                        count1 = count2;
                        b = null;
                        count2 = 0;
                    }
                }
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a != null && nums[i] == a) {
                count1++;
            }
            if (b != null && nums[i] == b) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            list.add(a);
        }
        if (count2 > nums.length / 3) {
            list.add(b);
        }
        return list;
    }

    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        int maj1 = 0, maj2 = 0;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && maj2 != nums[i]) {
                maj1 = nums[i];
                count1 = 1;
                continue;
            } else if (count2 == 0 && maj1 != nums[i]) {
                maj2 = nums[i];
                count2 = 1;
                continue;
            }

            if (maj1 == nums[i]) {
                count1++;
            } else if (maj2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maj1 == nums[i]) {
                count1++;
            } else if (maj2 == nums[i]) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            res.add(maj1);
        }
        if (count2 > nums.length / 3) {
            res.add(maj2);
        }
        return res;
    }

    public List<Integer> majorityElement3(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() > nums.length / 3) {
                res.add(item.getKey());
            }
        }

        return res;
    }
}

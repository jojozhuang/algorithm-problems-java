package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Subarray Sum.
 * Given an integer array, find a subarray where the sum of numbers is zero. Your code should return the index of the first number and the index of the last number.
 * <p>
 * Example
 * Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].
 * <p>
 * Note
 * There is at least one subarray that it's sum equals to zero.
 *
 * @author Johnny
 */
public class ZeroSubarraySum {
    public List<Integer> subarraySum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        if (nums == null || nums.length == 0) {
            return list;
        }

        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum[0], 0);
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
            if (sum[i] == 0) {
                list.clear();
                list.add(0);
                list.add(i);
                return list;
            }
            if (map.containsKey(sum[i])) {
                list.clear();
                list.add(map.get(sum[i]) + 1);
                list.add(i);
                return list;
            } else {
                map.put(sum[i], i);
            }
        }

        return list;

    }

    public ArrayList<Integer> subarraySum2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ArrayList<Integer> ret = new ArrayList<Integer>();

        //key is the sum until current index, value is the index of numbers
        /*
        key contains the sum for each step, it same key appears, that means there must a subarray between them, which is zero. eg.
        nums = [5, -1, 2, -1, 2]
        [0] = 0
        [5] = 1
        [4] = 2
        [6] = 3
        [5] = 4 -> back to 5        
        */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // initial, in case the sub array starts from index = 0;
        map.put(0, 0);

        // sum for the all of the previous numbers
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum)) {
                ret.add(map.get(sum));
                ret.add(i);
                break;
            } else {
                map.put(sum, i + 1);
            }
        }

        return ret;

    }
}

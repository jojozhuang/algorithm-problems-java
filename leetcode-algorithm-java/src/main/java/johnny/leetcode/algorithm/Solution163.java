package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Search for a Range.
 * Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.
 * <p>
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return {@code ["2", "4->49", "51->74", "76->99"]}.
 *
 * @author Johnny
 */
public class Solution163 {

    public List<String> findMissingRanges5(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            if (lower != upper) {
                list.add(lower + "->" + upper);
            } else {
                list.add(lower + "");
            }
            return list;
        }
        for (int n : nums) {
            int justBelow = n - 1;
            if (lower == justBelow) list.add(lower + "");
            else if (lower < justBelow) list.add(lower + "->" + justBelow);
            lower = n + 1;
        }
        if (lower == upper) list.add(lower + "");
        else if (lower < upper) list.add(lower + "->" + upper);
        return list;
    }

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            if (lower != upper) {
                result.add(lower + "->" + upper);
            } else {
                result.add(lower + "");
            }
            return result;
        }
        long start = lower;
        start -= 1;

        for (int i = 0; i < nums.length; i++) {
            if ((long) nums[i] - start > 1L) {
                if ((long) nums[i] - start > 2L)
                    result.add((start + 1) + "->" + (nums[i] - 1));
                else
                    result.add((start + 1) + "");
            }
            start = nums[i];
        }
        if ((long) upper - start >= 1L) {
            if ((long) upper - start > 1L)
                result.add((start + 1) + "->" + (upper));
            else
                result.add((start + 1) + "");
        }
        return result;
    }

    String getRange(int n1, int n2) {
        return (n1 == n2) ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
    }

    public List<String> findMissingRanges2(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == lower) {
                lower++;
                continue;
            } else {
                if (nums[i] - lower == 1) {
                    res.add("" + lower);
                } else {
                    res.add("" + lower + "->" + (nums[i] - 1));
                }
                lower = nums[i] + 1;
            }
        }

        if (nums[len - 1] < upper) {
            if (upper - nums[len - 1] == 1) {
                res.add("" + upper);
            } else {
                res.add("" + (nums[nums.length - 1] + 1) + "->" + upper);
            }
        }

        return res;
    }
}

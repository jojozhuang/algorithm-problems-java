package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Intersection of Two Arrays.
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * @author Johnny
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (set.contains(nums1[i])) {
                list.add(nums1[i]);
                set.remove(nums1[i]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}

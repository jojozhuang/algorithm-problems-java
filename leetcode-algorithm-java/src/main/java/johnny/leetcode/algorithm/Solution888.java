package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Johnny
 */
public class Solution888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        Set<Integer> set1 = new HashSet<>();
        for (int i : A) {
            sum1 += i;
            set1.add(i);
        }
        int sum2 = 0;
        Set<Integer> set2 = new HashSet<>();
        for (int i : B) {
            sum2 += i;
            set2.add(i);
        }

        int avg = (sum1 + sum2) / 2;
        for (int i = 0; i < A.length; i++) {
            if (sum1 - A[i] < avg) {
                if (set2.contains(avg - (sum1 - A[i]))) {
                    return new int[]{A[i], avg - (sum1 - A[i])};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int[] fairCandySwap2(int[] A, int[] B) {
        int sum1 = 0, sum2 = 0;
        for (int i : A) {
            sum1 += i;
        }
        for (int j : B) {
            sum2 += j;
        }

        int diff = Math.abs(sum1 - sum2);
        if (sum2 > sum1) {
            return match(A, B, diff);
        } else {
            int[] res1 = match(B, A, diff);
            int[] res = new int[2];
            res[0] = res1[1];
            res[1] = res1[0];
            return res;
        }
    }

    private int[] match(int[] nums1, int[] nums2, int diff) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i] + diff / 2, i);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j])) {
                res[0] = nums1[map.get(nums2[j])];
                res[1] = nums2[j];
            }
        }

        return res;
    }
}

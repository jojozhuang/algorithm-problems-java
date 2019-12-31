package johnny.leetcode.others;

import java.util.HashMap;

import johnny.leetcode.others.common.TreeNode;

/**
 *https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=499490
 *Opposite with the following two. The following two are same questions.
 *410. Split Array Largest Sum
 *1014. Capacity To Ship Packages Within D Days
 *
 *  
 * @author Johnny
 */
public class AAASplitChocolate {
    public int splitArray(int[] nums, int m) {
        int sum = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }
        
        if (m == 1) {
            return sum;
        }
        
        int start = min;
        int end = sum;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, m, mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return start - 1;
    }
    
    private boolean isValid(int[] nums, int m, int target) {
        int count = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total >= target) {
                total = 0;
                count++;
            }
        }
        
        return count >= m;
    }
}

package johnny.algorithm.advanced;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchUnsorted {
    public int[] search(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        boolean[] outrange = new boolean[nums.length];
        helper(nums, 0, nums.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE, outrange);
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< outrange.length; i++) {
            if (outrange[i]) {
                list.add(nums[i]);
            }
        }
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    
    private void helper(int[] nums, int start, int end, int lower, int upper, boolean[] found) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;
        if (nums[mid] < lower || nums[mid] > upper) {
            found[mid] = true;
        }
        
        helper(nums, start, mid - 1, lower, Math.min(nums[mid], upper), found);
        helper(nums, mid + 1, end, Math.max(nums[mid], lower), upper, found);
    }
    // nlog(n)
    public int[] search2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        
        boolean[] found = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    found[i] = true;
                    break;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< found.length; i++) {
            if (!found[i]) {
                list.add(nums[i]);
            }
        }
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

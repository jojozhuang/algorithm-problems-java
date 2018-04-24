package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Search for a Range.
Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
 * 
 * @author Johnny
 */
public class Solution163 {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int pre = lower - 1;
        for(int i = 0 ; i <= nums.length  ; i++){
            int after = i == nums.length ? upper + 1 : nums[i]; 
            if(pre + 2 == after){
                result.add(String.valueOf(pre + 1));
            }else if(pre + 2 < after){
                result.add(String.valueOf(pre + 1) + "->" + String.valueOf(after - 1));
            }
            pre = after;
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

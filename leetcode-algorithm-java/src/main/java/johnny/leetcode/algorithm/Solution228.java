package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Summary Ranges.
 * 
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * @author Johnny
 */
public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        if (nums.length == 1) {
            res.add(String.valueOf(nums[0]));
            return res;
        }
        
        List<String> summary = new ArrayList<>();
        for (int i = 0, j = 0; j < nums.length; ++j) {
            // check if j + 1 extends the range [nums[i], nums[j]]
            if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
                continue;
            // put the range [nums[i], nums[j]] into the list
            if (i == j)
                summary.add(nums[i] + "");
            else
                summary.add(nums[i] + "->" + nums[j]);
            i = j + 1;
        }
        return summary;
    }
    public List<String> summaryRanges2(int[] nums) {
        List<String> res = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        if (nums.length == 1) {
            res.add(String.valueOf(nums[0]));
            return res;
        }
        
        int head = 1;
        int tail = 0;
        while (head < nums.length) {
            if (nums[head - 1] + 1 < nums[head]) {
                if (head - 1 - tail == 0) {
                    res.add(String.valueOf(nums[tail]));
                } else {
                    res.add(String.valueOf(nums[tail]) + "->" + String.valueOf(nums[head - 1]));
                }
                tail = head;
            }
            head++;
        }
        
        if (nums.length - 1 == tail) {
            res.add(String.valueOf(nums[tail]));
        } else {
            res.add(String.valueOf(nums[tail]) + "->" + String.valueOf(nums[nums.length - 1]));
        }
        
        return res;
    }
}

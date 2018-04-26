package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Search for a Range.
Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
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
                list.add(lower+"");
            }
            return list;
        }
        for(int n : nums){
            int justBelow = n - 1;
            if(lower == justBelow) list.add(lower+"");
            else if(lower < justBelow) list.add(lower + "->" + justBelow);
            lower = n+1;
        }
        if(lower == upper) list.add(lower+"");
        else if(lower < upper) list.add(lower + "->" + upper);
        return list;
    }
    
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        if (nums == null || nums.length == 0) {
            if (lower != upper) {
                result.add(lower + "->" + upper);
            } else {
                result.add(lower+"");
            }
            return result;
        }
        
        // eliminate duplicate num
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<Integer>(list);
        List<Integer> identicalList = new ArrayList<Integer>(set);
        nums = identicalList.stream().mapToInt(i->i).toArray();
        Arrays.sort(nums);
        
        long pre = (long)lower - 1;
        for(int i = 0 ; i <= nums.length  ; i++){
            long after = i == nums.length ? upper + 1 : nums[i]; 
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

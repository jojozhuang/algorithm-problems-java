package johnny.leetcode.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 * 
 * @author Johnny
 */

public class Subsets {
    public List<List<Integer>> subsetsThree(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null) {
            return res;
        }

        Arrays.sort(nums);// not necessary, just for unit test
        
        // natural idea
        res.add(new ArrayList<Integer>());                  // res =  [[]]
        for (int i = 0; i < nums.length; i++) {             // i = 0                         i = 0 (still in second loop)         i = 1                                          i = 2
            List<Integer> list = new ArrayList<Integer>();  // list = []                                                          list = []                                      list = []
            list.add(nums[i]);                              // list = [1]                                                         list = [2]                                     list = [3]
            res.add(list);                                  // res =  [[],[1]]                                                    res =  [[],[1],[1,2],[1,2,3],[1,3],[2]]        res =  [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]
            for (int j = i + 1; j < nums.length; j++) {     // j = 1                         j = 2                                j = 2
                list.add(nums[j]);                          // list = [1,2]                  list = [1,3]                         list = [2,3]
                res.add(new ArrayList<>(list));             // res =  [[],[1],[1,2]]         res =  [[],[1],[1,2],[1,2,3],[1,3]]  res =  [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3]]
                for (int k = j + 1; k < nums.length; k++) { // k = 2                         k = 3 (third loop is skipped)        k = 3 (third loop is skipped)
                    list.add(nums[k]);                      // list = [1,2,3]
                    res.add(new ArrayList<>(list));         // res =  [[],[1],[1,2],[1,2,3]]
                    list.remove(list.size() - 1);           // list = [1,2]
                }
                list.remove(list.size() - 1);               // list = [1]                    list = [1]                           list = [2]
            }
        }

        // optimize the first loop, make it use the same pattern
        res.clear();
        List<Integer> list = new ArrayList<Integer>();      // list = []
        res.add(new ArrayList<>(list));                     // res =  [[]]
        for (int i = 0; i < nums.length; i++) {             // i = 0                         i = 0 (still in second loop)         i = 1                                          i = 2
            list.add(nums[i]);                              // list = [1]                                                         list = [2]                                     list = [3]
            res.add(new ArrayList<>(list));                 // res =  [[],[1]]                                                    res =  [[],[1],[1,2],[1,2,3],[1,3],[2]]        res = [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]
            for (int j = i + 1; j < nums.length; j++) {     // j = 1                         j = 2                                j = 2
                list.add(nums[j]);                          // list = [1,2]                  list = [1,3]                         list = [2,3]
                res.add(new ArrayList<>(list));             // res =  [[],[1],[1,2]]         res =  [[],[1],[1,2],[1,2,3],[1,3]]  res =  [[],[1],[1,2],[1,2,3],[1,3],[2],[2,3]]
                for (int k = j + 1; k < nums.length; k++) { // k = 2                         k = 3 (third loop is skipped)        k = 3 (third loop is skipped)
                    list.add(nums[k]);                      // list = [1,2,3]
                    res.add(new ArrayList<>(list));         // res =  [[],[1],[1,2],[1,2,3]]
                    list.remove(list.size() - 1);           // list = [1,2]
                }
                list.remove(list.size() - 1);               // list = [1]                    list = [1]                           list = [2]
            }
            list.remove(list.size() - 1);                   //                               list = []                            list = []                                     list = []
        }

        // []
        // [1], [1,2], [1,2,3],[1,3]
        // [2], [2,3]
        // [3]
        
        return res;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null) {
            return res;
        }

        Arrays.sort(nums);// not necessary, just for unit test
        
        List<Integer> list = new ArrayList<Integer>();
        helper(nums, 0, list, res);
        return res;
    }
    
    private void helper(int[] nums, int pos, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<Integer>(list));
        
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}

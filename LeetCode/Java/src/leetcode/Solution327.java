/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Count of Range Sum.
 * 
 * Given an integer array nums, return the number of range sums that lie in 
 * [lower, upper] inclusive.
 * 
 * Range sum S(i, j) is defined as the sum of the elements in nums between 
 * indices i and j (i ≤ j), inclusive.
 * 
 * Note:
 * A naive algorithm of O(n2) is trivial. You MUST do better than that.
 * 
 * Example:
 * Given nums = [-2, 5, -1], lower = -2, upper = 2,
 * Return 3.
 * The three ranges are : [0, 0], [2, 2], [0, 2] and their respective sums are: -2, -1, 2.
 *  
 * @author RZHUANG
 */
public class Solution327 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] BITree = new int[n + 1];
        // Store the actual values in BITree[] using update()
        for (int i = 0; i < n; i++) {
            updateBIT(BITree, n, i, nums[i]);
        }
        
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                sum = getSum(BITree, i, j);
                if (sum >= lower && sum <= upper) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void updateBIT(int[] BITree, int n, int index, int val)
    {
        index = index + 1;
        while (index <= n)
        {
           BITree[index] += val;
           index += index & (-index);
        }
    }
    
    private int getSum(int[] BITree, int index)
    {
        int sum = 0;
        index = index + 1;
        while (index>0)
        {
            sum += BITree[index];

            // Move index to parent node in getSum View
            index -= index & (-index);
        }
        return sum;
    }
    
    private int getSum(int[] BITree, int from, int to)
    {
        if (from >= 0 && to >= 0 && to >= from) {
            return getSum(BITree, to) - getSum(BITree, from - 1);
        } else {
            return -1;
        }
    }
}

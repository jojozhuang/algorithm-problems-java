/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Maximum Length of Pair Chain
 * 
 * You are given n pairs of numbers. In every pair, the first number is always 
 * smaller than the second number.
 * 
 * Now, we define a pair (c, d) can follow another pair (a, b) if and only 
 * if b < c. Chain of pairs can be formed in this fashion.
 * 
 * Given a set of pairs, find the length longest chain which can be formed. You 
 * needn't use up all the given pairs. You can select pairs in any order.
 * 
 * Example 1:
 * Input: [[1,2], [2,3], [3,4]]
 * Output: 2
 * 
 * Explanation: The longest chain is [1,2] -> [3,4]
 * 
 * Note:
 * The number of given pairs will be in the range [1, 1000].
 * 
 * @author Johnny
 */
public class Solution646 {
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0 || pairs[0].length != 2) {
            return 0;
        }
        
        Arrays.sort(pairs, new Comparator<int[]>(){
            public int compare(int[] s1, int[] s2){
                if (s1[0] == s2[0]) {
                    return s1[1] - s2[1];
                }
                return s1[0] - s2[0];
            }
        });
        
        int count = 1;
        int[] prev = pairs[0];
        
        for (int i = 1; i < pairs.length; i++) {
            int[] curr = pairs[i];
            if (prev[0] <= curr[0] && prev[1] >= curr[1]) {
                prev = curr;
                continue;
            }
            if (prev[1] < curr[0]) {
                count++;
                prev = curr;
            }
        }
        
        return count;
    }
}

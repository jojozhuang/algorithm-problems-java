package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830. Positions of Large Groups
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

 

Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
 * @author Johnny
 */
public class Solution830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        if (S == null || S.length() == 0) {
            return ans;
        }
        
        int i = 0;
        while (i < S.length()) {
            int j = i + 1;
            while (j < S.length() && S.charAt(i) == S.charAt(j)) {
                j++;
            }
            if (j - i >= 3) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j-1);
                ans.add(list);
            }
            i = j;
        }
        
        return ans;
    }
 }

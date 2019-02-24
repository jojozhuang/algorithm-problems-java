package johnny.algorithm.leetcode;

/**
 *821. Shortest Distance to a Character
 *Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 * @author Johnny
 */
public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Integer.MAX_VALUE;
        }

        // left -> right
        int index = -1;
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (ch == C) {
                ans[i] = 0;
                index = i;
            } else {
                if (index >= 0) {
                    ans[i] = i - index;
                }
            }
        }
        
        // right to left
        index = -1;
        for (int i = n - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (ch == C) {
                ans[i] = 0;
                index = i;
            } else {
                if (index >= 0) {
                    ans[i] = Math.min(ans[i], index - i);
                }
            }
        }
        
        return ans;
    }
    
    public int[] shortestToChar2(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        int pos = -n;
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        for (int i = n - 1; i >= 0; --i) {
            if (S.charAt(i) == C)  pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }
}

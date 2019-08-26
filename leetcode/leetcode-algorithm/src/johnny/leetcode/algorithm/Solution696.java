package johnny.leetcode.algorithm;

/**
 *696. Count Binary Substrings
 *Give a string s, count the number of non-empty (contiguous) substrings that have the same number 
 *of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

Example 1:
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", 
"1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:
Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 
1's and 0's.
Note:

s.length will be between 1 and 50,000.
s will only consist of "0" or "1" characters
 * @author Johnny
 */
public class Solution696 {
    // optimized with constant space
    public int countBinarySubstrings(String s) {
        int curr = 1;
        int prev = 0;
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                curr++;
            } else {
                if (prev > 0) {
                    ans += Math.min(prev, curr);
                }
                prev = curr;
                curr = 1;
            }
        }
        
        ans += Math.min(prev, curr);
        
        return ans;
    }
    
    // group by counting the same number, 00110->2,2,1
    public int countBinarySubstrings2(String s) {
        int n = s.length();
        int[] group = new int[n];
        group[0] = 1;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                index++;
                group[index] = 1;
            } else {
                group[index]++;
            }
        }
        
        int ans = 0;
        for (int i = 1; i <= index; i++) {
            ans += Math.min(group[i], group[i-1]);
        }
        
        return ans;
    }
}
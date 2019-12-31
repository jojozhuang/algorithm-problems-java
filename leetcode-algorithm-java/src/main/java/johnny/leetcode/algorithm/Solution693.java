package johnny.leetcode.algorithm;

/**
 *693. Binary Number with Alternating Bits
Given a positive integer, check whether it has alternating bits: namely, if 
two adjacent bits will always have different values.

Example 1:
Input: 5
Output: True
Explanation:
The binary representation of 5 is: 101
Example 2:
Input: 7
Output: False
Explanation:
The binary representation of 7 is: 111.
Example 3:
Input: 11
Output: False
Explanation:
The binary representation of 11 is: 1011.
Example 4:
Input: 10
Output: True
Explanation:
The binary representation of 10 is: 1010.


 * @author Johnny
 */
public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int next = n & 1;
        while (n > 0) {
            if ((n & 1) != next) {
                return false;
            }
            next = next == 1 ? 0 : 1;
            n = n >>> 1;
        }
        
        return true;
    }
    
    public boolean hasAlternatingBits2(int n) {
        if (n <= 0) {
            return false;
        }
        
        long num = 1;
        int last = 0;
        while (num <= Integer.MAX_VALUE) {
            if (num == n) {
                return true;
            }
            
            num = num * 2 + last;
            last = (last == 1) ? 0:1;
        }
        
        return false;
    }
}
package johnny.algorithm.leetcode;

/**
 * Excel Sheet Column Number.
 * Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28 
 * 
 * @author Johnny
 */
public class Solution171 {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int ans = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ans = 26* ans;
            ans += chs[i] - 'A' + 1;
        }
        
        return ans;
    }
    
    public int titleToNumber2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - i - 1);
        }
        
        return num;
    }
}

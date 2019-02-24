package johnny.algorithm.leetcode;

/**
 * Base 7
 * 
 * Given an integer, return its base 7 string representation.
 * 
 * Example 1:
 * Input: 100
 * Output: "202"
 * 
 * Example 2:
 * Input: -7
 * Output: "-10"
 * 
 * Note: The input will be in range of [-1e7, 1e7].
 * 
 * @author Johnny
 */
public class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNeg = num < 0 ? true : false;
        num = isNeg ? -num : num;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 7);
            num = num / 7;
        }
        if (isNeg) {
            return "-" + sb.reverse().toString();
        } else {
            return sb.reverse().toString();
        }
    }
    
    public String convertToBase72(int num) {
        if (num < 0)
            return '-' + convertToBase7(-num);
        if (num < 7)
            return num + "";
        return convertToBase7(num / 7) + num % 7;
    }  
}

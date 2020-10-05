package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Largest Number.
 * Given a list of non negative integers, arrange them such that they form the
 * largest number.
 * <p>
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * <p>
 * Note: The result may be very large, so you need to return a string instead
 * of an integer.
 *
 * @author Johnny
 */
public class Solution179 {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b)->{
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);
            return (s2+s1).compareTo(s1+s2);
        });

        if (arr[0] == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }

    //http://www.programcreek.com/2014/02/leetcode-largest-number-java/
    public String largestNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String leftRight = s1 + s2;
                String rightLeft = s2 + s1;
                return rightLeft.compareTo(leftRight); // big to small
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }

        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}

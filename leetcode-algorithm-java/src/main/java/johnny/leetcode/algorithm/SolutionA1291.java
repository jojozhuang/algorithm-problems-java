package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1291. Sequential Digits
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 * Example 1:
 *
 * Input: low = 100, high = 300
 * Output: [123,234]
 * Example 2:
 *
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 *
 * Constraints:
 *
 * 10 <= low <= high <= 10^9
 *
 * @author Johnny
 */
public class SolutionA1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = Arrays.asList(12,23,34,45,56,67,78,89);
        List<List<Integer>> nums = new ArrayList<>(); // store all the valid numbers, group by length
        nums.add(list);
        for (int i = 1; i < 8; i++) { // 3 digits to 9 digits
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = nums.get(i-1);
            for (int j = 0; j < nums.get(i-1).size() - 1; j++) {
                curr.add(prev.get(j) * 10 + (i + j + 2));
            }
            nums.add(curr);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int num = nums.get(i).get(j);
                if (num >= low && num <= high) {
                    ans.add(num);
                }
                if (num > high) {
                    break;
                }
            }
        }

        return ans;
    }
}

package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 1018. Binary Prefix Divisible By 5
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from A[0] to A[i] interpreted as a binary number (from most-significant-bit to least-significant-bit.)
 * <p>
 * Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.
 * <p>
 * Example 1:
 * Input: [0,1,1]
 * Output: [true,false,false]
 * Explanation:
 * The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
 * <p>
 * Example 2:
 * Input: [1,1,1]
 * Output: [false,false,false]
 * <p>
 * Example 3:
 * Input: [0,1,1,1,1,1]
 * Output: [true,false,false,false,true,false]
 * <p>
 * Example 4:
 * Input: [1,1,1,0,1]
 * Output: [false,false,false,false,false]
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 30000
 * A[i] is 0 or 1
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = num * 2 % 10 + A[i];
            list.add(num % 5 == 0);
        }

        return list;
    }
}

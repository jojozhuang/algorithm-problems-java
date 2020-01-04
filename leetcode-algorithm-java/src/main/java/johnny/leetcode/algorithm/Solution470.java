package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.SolBase;

/**
 * 470. Implement Rand10() Using Rand7()
 * <p>
 * Given a function rand7 which generates a uniform random integer in the range 1 to 7, write a function rand10 which generates a uniform random integer in the range 1 to 10.
 * <p>
 * Do NOT use system's Math.random().
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: [7]
 * Example 2:
 * <p>
 * Input: 2
 * Output: [8,4]
 * Example 3:
 * <p>
 * Input: 3
 * Output: [8,1,10]
 * <p>
 * Note:
 * <p>
 * rand7 is predefined.
 * Each testcase has one argument: n, the number of times that rand10 is called.
 * <p>
 * Follow up:
 * <p>
 * What is the expected value for the number of calls to rand7() function?
 * Could you minimize the number of calls to rand7()?
 *
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * return a random integer in the range 1 to 7
 */
public class Solution470 extends SolBase {
    public int rand10() {
        int index = 41;
        while (index > 40) {
            int row = rand7();
            int col = rand7();
            index = col + (row - 1) * 7;
        }

        return 1 + (index - 1) % 10;
    }
}

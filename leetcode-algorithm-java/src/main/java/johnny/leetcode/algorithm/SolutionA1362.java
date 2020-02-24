package johnny.leetcode.algorithm;

/**
 * 1362. Closest Divisors
 *
 * Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.
 *
 * Return the two integers in any order.
 *
 * Example 1:
 * Input: num = 8
 * Output: [3,3]
 * Explanation: For num + 1 = 9, the closest divisors are 3 & 3, for num + 2 = 10, the closest divisors are 2 & 5, hence 3 & 3 is chosen.
 *
 * Example 2:
 * Input: num = 123
 * Output: [5,25]
 *
 * Example 3:
 * Input: num = 999
 * Output: [40,25]
 *
 * Constraints:
 *
 * 1 <= num <= 10^9
 *
 * @author Johnny
 */
public class SolutionA1362 {
    public int[] closestDivisors(int num) {
        int[] ans1 = helper(num + 1);
        int[] ans2 = helper(num + 2);
        if (Math.abs(ans1[0] - ans1[1]) < Math.abs(ans2[0] - ans2[1])) {
            return ans1;
        } else {
            return ans2;
        }
    }

    public int[] helper(int num) {
        int [] pair = new int[2];
        for (int i=1; i<=Math.sqrt(num); i++) {
            if (num%i==0) {
                if (num/i == i) {
                    return new int[]{i, i};
                } else {
                    if (pair[0] == 0) {
                        pair[0] = i;
                        pair[1] = num / i;
                    } else {
                        if (Math.abs(num/i - i) < Math.abs(pair[0] - pair[1])) {
                            pair[0] = i;
                            pair[1] = num / i;
                        }
                    }
                }
            }
        }

        return pair;
    }
}

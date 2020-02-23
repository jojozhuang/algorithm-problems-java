package johnny.leetcode.algorithm;

/**
 * @author Johnny
 */
public class SolutionA1213 {
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

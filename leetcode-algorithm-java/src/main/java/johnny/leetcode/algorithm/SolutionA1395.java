package johnny.leetcode.algorithm;

/**
 * 1395. Count Number of Teams
 *
 * There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
 *
 * You have to form a team of 3 soldiers amongst them under the following rules:
 *
 * Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
 * A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
 * Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
 *
 * Example 1:
 * Input: rating = [2,5,3,4,1]
 * Output: 3
 * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
 *
 * Example 2:
 * Input: rating = [2,1,3]
 * Output: 0
 * Explanation: We can't form any team given the conditions.
 *
 * Example 3:
 * Input: rating = [1,2,3,4]
 * Output: 4
 *
 * Constraints:
 *
 * n == rating.length
 * 1 <= n <= 200
 * 1 <= rating[i] <= 10^5
 */
public class SolutionA1395 {
    // O(n^2)
    // This solder can form less[left] * greater[right] + greater[left] * less[right] teams.
    public int numTeams(int[] rating) {
        if (rating.length < 3) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            int less[] = new int[2], greater[] = new int[2];
            for (int j = 0; j < rating.length; ++j) {
                if (rating[i] < rating[j])
                    ++less[j > i ? 1 : 0];
                if (rating[i] > rating[j])
                    ++greater[j > i ? 1 : 0];
            }
            ans += less[0] * greater[1] + greater[0] * less[1];
        }
        return ans;
    }

    // n^3
    public int numTeams2(int[] rating) {
        if (rating.length < 3) {
            return 0;
        }

        int ans = 0;
        int n = rating.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        ans++;
                    } else if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}

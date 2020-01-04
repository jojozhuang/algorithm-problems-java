package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * 881. Boats to Save People
 * <p>
 * The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
 * <p>
 * Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: people = [1,2], limit = 3
 * Output: 1
 * Explanation: 1 boat (1, 2)
 * Example 2:
 * <p>
 * Input: people = [3,2,2,1], limit = 3
 * Output: 3
 * Explanation: 3 boats (1, 2), (2) and (3)
 * Example 3:
 * <p>
 * Input: people = [3,5,3,4], limit = 5
 * Output: 4
 * Explanation: 4 boats (3), (3), (4), (5)
 * Note:
 * <p>
 * 1 <= people.length <= 50000
 * 1 <= people[i] <= limit <= 30000
 *
 * @author Johnny
 */
public class Solution881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
}

package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * Heaters
 * <p>
 * Winter is coming! Your first job during the contest is to design a standard
 * heater with fixed warm radius to warm all the houses.
 * <p>
 * Now, you are given positions of houses and heaters on a horizontal line,
 * find out minimum radius of heaters so that all houses could be covered by
 * those heaters.
 * <p>
 * So, your input will be the positions of houses and heaters seperately, and
 * your expected output will be the minimum radius standard of heaters.
 * <p>
 * Note:
 * 1. Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
 * 2. Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
 * 3. As long as a house is in the heaters' warm radius range, it can be warmed.
 * 4. All the heaters follow your radius standard and the warm radius will the same.
 * <p>
 * Example 1:
 * Input: [1,2,3],[2]
 * Output: 1
 * <p>
 * Explanation: The only heater was placed in the position 2, and if we use the
 * radius 1 standard, then all the houses can be warmed.
 * <p>
 * Example 2:
 * Input: [1,2,3,4],[1,4]
 * Output: 1
 * <p>
 * Explanation: The two heater was placed in the position 1 and 4. We need to
 * use radius 1 standard, then all the houses can be warmed.
 *
 * @author Johnny
 */
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;

        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = -(index + 1);
            }
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;

            result = Math.max(result, Math.min(dist1, dist2));
        }

        return result;
    }
}

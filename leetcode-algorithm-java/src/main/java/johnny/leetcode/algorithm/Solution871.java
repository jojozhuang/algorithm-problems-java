package johnny.leetcode.algorithm;

/**
 * 871. Minimum Number of Refueling Stops
 * <p>
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 * <p>
 * Along the way, there are gas stations.  Each station[i] represents a gas station that is station[i][0] miles east of the starting position, and has station[i][1] liters of gas.
 * <p>
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.  It uses 1 liter of gas per 1 mile that it drives.
 * <p>
 * When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 * <p>
 * What is the least number of refueling stops the car must make in order to reach its destination?  If it cannot reach the destination, return -1.
 * <p>
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there.  If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: target = 1, startFuel = 1, stations = []
 * Output: 0
 * Explanation: We can reach the target without refueling.
 * Example 2:
 * <p>
 * Input: target = 100, startFuel = 1, stations = [[10,100]]
 * Output: -1
 * Explanation: We can't reach the target (or even the first gas station).
 * Example 3:
 * <p>
 * Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
 * Output: 2
 * Explanation:
 * We start with 10 liters of fuel.
 * We drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.
 * Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
 * and refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.
 * We made 2 refueling stops along the way, so we return 2.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= target, startFuel, stations[i][1] <= 10^9
 * 0 <= stations.length <= 500
 * 0 < stations[0][0] < stations[1][0] < ... < stations[stations.length-1][0] < target
 *
 * @author Johnny
 */
public class Solution871 {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int N = stations.length;
        long[] dp = new long[N + 1];
        dp[0] = startFuel;
        for (int i = 0; i < N; ++i)
            for (int t = i; t >= 0; --t)
                if (dp[t] >= stations[i][0])
                    dp[t + 1] = Math.max(dp[t + 1], dp[t] + (long) stations[i][1]);

        for (int i = 0; i <= N; ++i)
            if (dp[i] >= target) return i;
        return -1;
    }
}

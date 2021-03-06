package johnny.leetcode.algorithm;

/**
 * 1094. Car Pooling
 * You are driving a vehicle that has capacity empty seats initially available for passengers.  The vehicle only drives east (ie. it cannot turn around and drive west.)
 * <p>
 * Given a list of trips, trip[i] = [num_passengers, start_location, end_location] contains information about the i-th trip: the number of passengers that must be picked up, and the locations to pick them up and drop them off.  The locations are given as the number of kilometers due east from your vehicle's initial location.
 * <p>
 * Return true if and only if it is possible to pick up and drop off all passengers for all the given trips.
 * <p>
 * Example 1:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 4
 * Output: false
 * <p>
 * Example 2:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 5
 * Output: true
 * <p>
 * Example 3:
 * Input: trips = [[2,1,5],[3,5,7]], capacity = 3
 * Output: true
 * <p>
 * Example 4:
 * Input: trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
 * Output: true
 * <p>
 * Constraints:
 * <pre>{@code
 * trips.length <= 1000
 * trips[i].length == 3
 * 1 <= trips[i][0] <= 100
 * 0 <= trips[i][1] < trips[i][2] <= 1000
 * 1 <= capacity <= 100000
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        if (trips == null || trips.length == 0) {
            return true;
        }

        int[] locations = new int[1001];

        // increment if pick up, decrement if drop off
        for (int i = 0; i < trips.length; i++) {
            locations[trips[i][1]] += trips[i][0];
            locations[trips[i][2]] -= trips[i][0];
        }

        // go through and count the passengers on board
        int count = 0;
        for (int i = 0; i < locations.length; i++) {
            count += locations[i];
            if (count > capacity) {
                return false;
            }
        }

        return true;
    }

    public boolean carPooling2(int[][] trips, int capacity) {
        if (trips == null || trips.length == 0) {
            return true;
        }

        // find the minimum and maximum locations
        int start = Integer.MIN_VALUE, end = Integer.MAX_VALUE;
        for (int[] trip : trips) {
            start = Math.min(start, trip[1]);
            end = Math.max(end, trip[2]);
        }

        // create an array with the length of available locations
        int[] locations = new int[end - start + 1];

        // increment if pick up, decrement if drop off
        for (int i = 0; i < trips.length; i++) {
            locations[trips[i][1] - start] += trips[i][0];
            locations[trips[i][2] - start] -= trips[i][0];
        }

        // go through and count the passengers on board
        int count = 0;
        for (int i = 0; i < locations.length; i++) {
            count += locations[i];
            if (count > capacity) {
                return false;
            }
        }

        return true;
    }
}

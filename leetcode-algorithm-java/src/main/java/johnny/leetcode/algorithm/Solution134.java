package johnny.leetcode.algorithm;

/**
 * Gas Station.
 * There are N gas stations along a circular route, where the amount of gas at
 * station i is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from station i to its next station (i+1). You begin the journey with
 * an empty tank at one of the gas stations.
 * <p>
 * Return the starting gas station's index if you can travel around the circuit
 * once, otherwise return -1.
 * <p>
 * Note:
 * The solution is guaranteed to be unique.
 *
 * @author Johnny
 */
public class Solution134 {
    // 1. If sum of gas is more than sum of cost, then there must be a solution.
    // 2. The tank should never be negative, so restart whenever there is a negative number.

    // One pass
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }

        int total = 0;
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (total < 0) {
            return -1;
        } else {
            return start;
        }
    }

    // Two passes
    public int canCompleteCircuit3(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        //determine if we have a solution
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
        }
        if (total < 0) {
            return -1;
        }

        // find out where to start
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length;i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return start;
    }

    // brute force, O(n^2)
    public int canCompleteCircuit4(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] >= cost[i] && helper(gas, cost, i)) {
                return i;
            }
        }

        return -1;
    }

    private boolean helper(int[] gas, int[] cost, int start) {
        int i = start;
        int tank = gas[start];
        for (; i < gas.length; i++) {
            tank = tank - cost[i];
            if (tank < 0) {
                return false;
            }
            if (i + 1 < gas.length) {
                tank += gas[i+1];
            } else {
                tank += gas[0];
            }
        }

        for (i = 0; i < start; i++) {
            tank = tank - cost[i];
            if (tank < 0) {
                return false;
            }
            if (i < start - 1) {
                tank += gas[i+1];
            }
        }

        return true;
    }

    //http://www.programcreek.com/2014/03/leetcode-gas-station-java/
    public int canCompleteCircuit2(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        int start = gas.length - 1;
        int end = 0;
        int sum = gas[start] - cost[start];
        while (start > end) {
            if (sum >= 0) {
                sum += gas[end] - cost[end];
                ++end;
            } else {
                --start;
                sum += gas[start] - cost[start];
            }
        }
        return sum >= 0 ? start : -1;
    }
}

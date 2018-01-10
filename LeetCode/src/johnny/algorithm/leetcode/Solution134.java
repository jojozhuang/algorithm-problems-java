package johnny.algorithm.leetcode;

/**
 * Gas Station.
 * There are N gas stations along a circular route, where the amount of gas at 
 * station i is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to 
 * travel from station i to its next station (i+1). You begin the journey with 
 * an empty tank at one of the gas stations.
 * 
 * Return the starting gas station's index if you can travel around the circuit
 * once, otherwise return -1.
 * 
 * Note:
 * The solution is guaranteed to be unique.
 * 
 * @author Johnny
 */
public class Solution134 {
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
           }
           else {
              --start;
              sum += gas[start] - cost[start];
           }
        }
        return sum >= 0 ? start : -1;
    }
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        int sumRemaining = 0; // track current remaining
	int total = 0; // track total remaining
	int start = 0; 
 
	for (int i = 0; i < gas.length; i++) {
            int remaining = gas[i] - cost[i];

            //if sum remaining of (i-1) >= 0, continue 
            if (sumRemaining >= 0) { 
                sumRemaining += remaining;
            //otherwise, reset start index to be current
            } else {
                sumRemaining = remaining;
                start = i;
            }
            total += remaining;
	}
 
	if (total >= 0){
            return start;
	} else{
            return -1;
	}
    }
}

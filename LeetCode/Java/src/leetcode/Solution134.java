/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
	}else{
            return -1;
	}
    }
}

package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 853. Car Fleet
 * 
 * N cars are going to the same destination along a one lane road.  The destination is target miles away.

Each car i has a constant speed speed[i] (in miles per hour), and initial position position[i] miles towards the target along the road.

A car can never pass another car ahead of it, but it can catch up to it, and drive bumper to bumper at the same speed.

The distance between these two cars is ignored - they are assumed to have the same position.

A car fleet is some non-empty set of cars driving at the same position and same speed.  Note that a single car is also a car fleet.

If a car catches up to a car fleet right at the destination point, it will still be considered as one car fleet.


How many car fleets will arrive at the destination?

 

Example 1:

Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
Output: 3
Explanation:
The cars starting at 10 and 8 become a fleet, meeting each other at 12.
The car starting at 0 doesn't catch up to any other car, so it is a fleet by itself.
The cars starting at 5 and 3 become a fleet, meeting each other at 6.
Note that no other cars meet these fleets before the destination, so the answer is 3.

Note:

0 <= N <= 10 ^ 4
0 < target <= 10 ^ 6
0 < speed[i] <= 10 ^ 6
0 <= position[i] < target
All initial positions are different.

 * @author Johnny
 */
public class Solution853 {
    // target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        
        // position = [10,8,5,3,0]
        Integer[] position2 = new Integer[position.length];
        for (int i = 0; i < position.length; i++) {
            position2[i] = position[i];
        }
        Arrays.sort(position2, Collections.reverseOrder());

        // speed = [2,4,1,3,1]
        Integer[] index = new Integer[position.length];
        for (int i = 0; i < position.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return position[i2] - position[i1];
            }
        });

        Integer[] speed2 = new Integer[position.length];
        for (int i = 0; i < len; i++) {
            speed2[i] = speed[index[i]];
        }
        
        // distance to target = [2, 4, 7, 9, 12]
        int[] distance = new int[len];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = target - position2[i];
        }
        // time required = [1,1,7,3,12]
        double[] time = new double[len];
        for (int i = 0; i < distance.length; i++) {
            time[i] = (double)distance[i] / (double)speed2[i];
        }
        
        Queue<Double> queue = new LinkedList<>();
        for (double t : time) {
            queue.offer(t);
        }
        
        // each round, find the smaller or equal number against the first element
        int round = 0;
        while (!queue.isEmpty()) {
            double first = queue.poll();
            round++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                double item = queue.poll();
                if (item > first) {
                    queue.offer(item);
                }
            }
        }
        
        return round;
    }
}

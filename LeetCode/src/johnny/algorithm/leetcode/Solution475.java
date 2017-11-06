/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;

/**
 * Heaters
 * 
 * Winter is coming! Your first job during the contest is to design a standard 
 * heater with fixed warm radius to warm all the houses.
 * 
 * Now, you are given positions of houses and heaters on a horizontal line, 
 * find out minimum radius of heaters so that all houses could be covered by 
 * those heaters.
 * 
 * So, your input will be the positions of houses and heaters seperately, and 
 * your expected output will be the minimum radius standard of heaters.
 * 
 * Note:
 * 1. Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
 * 2. Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
 * 3. As long as a house is in the heaters' warm radius range, it can be warmed.
 * 4. All the heaters follow your radius standard and the warm radius will the same.
 * 
 * Example 1:
 * Input: [1,2,3],[2]
 * Output: 1
 * 
 * Explanation: The only heater was placed in the position 2, and if we use the 
 * radius 1 standard, then all the houses can be warmed.
 * 
 * Example 2:
 * Input: [1,2,3,4],[1,4]
 * Output: 1
 * 
 * Explanation: The two heater was placed in the position 1 and 4. We need to 
 * use radius 1 standard, then all the houses can be warmed.
 * 
 * @author Johnny
 */
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        if (houses == null || houses.length == 0 ||
                heaters == null || heaters.length == 0) {
            
        }
        
        int[] distances = new int[houses.length];
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i++) {
            distances[i] = findDistance(houses[i], heaters);
        }
        
        int res = 0;
        
        for (int i = 0; i < distances.length; i++) {
            res = Math.max(res, distances[i]);
        }
        
        return res;
    }
    
    private int findDistance(int house, int[] heaters) {
        int start = 0;
        int end = heaters.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (house == heaters[mid]) {
                return 0;
            } else if (house < heaters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        if (house < heaters[start]) {
            if (start - 1 >= 0) {
                return Math.min(house - heaters[start - 1], heaters[start] - house);
            } else {
                return heaters[start] - house;
            }
        } else if (house > heaters[end]) {
            if (end + 1 <= heaters.length - 1) {
                return Math.min(heaters[end + 1] - house, house - heaters[end]);
            } else {
                return house - heaters[start];
            }
        } else {
            return Math.min(house - heaters[start], heaters[end] - house);
        }
    }
}

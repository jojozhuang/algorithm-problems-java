/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Self Crossing.
 * 
 * You are given an array x of n positive numbers. You start at point (0,0) and 
 * moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to
 * the south, x[3] metres to the east and so on. In other words, after each move
 * your direction changes counter-clockwise.
 * 
 * Write a one-pass algorithm with O(1) extra space to determine, if your path 
 * crosses itself, or not.
 * 
 * Example 1:
 * Given x = [2, 1, 1, 2],
 * ┌───┐
 * │   │
 * └───┼──>
 *     │
 * 
 * Return true (self crossing)
 * Example 2:
 * Given x = [1, 2, 3, 4],
 * ┌──────┐
 * │      │
 * │
 * │
 * └────────────>
 * 
 * Return false (not self crossing)
 * Example 3:
 * Given x = [1, 1, 1, 1],
 * ┌───┐
 * │   │
 * └───┼>
 * 
 * Return true (self crossing)
 * 
 * @author Johnny
 */
public class Solution335 {
    public boolean isSelfCrossing(int[] x) {
        // two cases that do not cross, inner helix, outer helix
        if (x == null || x.length < 4) {
            return false;
        }
        
        boolean inner = false;
        
        for (int i = 2; i < x.length; i++) {
            if (x[i] <= x[i - 2]) {
                inner = true;
            } else {                
                if (inner) {
                    return true;
                } else {
                    if (x[i] >= x[i - 2]) {
                        inner = false;
                    } else {
                        inner = true;
                    }
                }                
            }
        }
        
        return false;
    }
}

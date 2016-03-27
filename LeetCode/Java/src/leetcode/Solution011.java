/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Container With Most Water.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point 
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with 
 * x-axis forms a container, such that the container contains the most water.
    Note: You may not slant the container.
 * @author Johnny
 */
public class Solution011 {        
    //Shrink from both sides, O(N2)
    //http://www.programcreek.com/2014/03/leetcode-container-with-most-water-java/
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
           
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
            
        return max;
    }
}

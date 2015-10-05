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
    //Brute force solution, O(N2)
    public int maxArea1(int[] height) {
        int area = 0;
        int current = 0;
        for (int i=0; i<height.length; i++) {
            for (int j=i+1; j<height.length; j++) {
                current = (j-i)*Math.min(height[i], height[j]);
                if (current > area)
                    area = current;
            }
        }
            
        return area;
    }
    
    //Shrink from both sides, O(N2)
    public int maxArea2(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        int current = 0;
        
        while(left<right) {
            current = (right-left)*Math.min(height[left], height[right]);
            if (current>area)
                area = current;
            
            if(height[left]<height[right])
                left++;
            else
                right--;                       
        }
            
        return area;
    }
}

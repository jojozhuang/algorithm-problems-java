package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Largest Rectangle in Histogram.
 * Given n non-negative integers representing the histogram's bar height where 
 * the width of each bar is 1, find the area of largest rectangle in the histogram.
 * 
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * 
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * 
 * For example,
 * Given height = [2,1,5,6,2,3],
 * return 10.
 * 
 * @author Johnny
 */
public class Solution084 {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int len = heights.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
    //http://www.programcreek.com/2014/05/leetcode-largest-rectangle-in-histogram-java/
    public int largestRectangleArea4(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();

        int max = 0;
        int i = 0;

        while (i < heights.length) {
            //push index to stack when the current height is larger than the previous one
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                //calculate max value when the current height is less than the previous one
                int p = stack.pop();
                int h = heights[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }
        }
        
        while (!stack.isEmpty()) {
            int p = stack.pop();
            int h = heights[p];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(h * w, max);
        }

        return max;
    }
    
    //Brute Force
    public int largestRectangleArea3(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        int n = heights.length;
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int min = heights[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, heights[j]);
                max = Math.max(max, (j - i + 1) * min);
            }
        }
        
        return max;
    }
    
    public int largestRectangleArea2(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        int n = heights.length;
        int[][] area = new int[n][n];
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int min = 0;
            for (int j = i; j < n; j++) {
                if (j == i) {
                    min = heights[i];
                    area[i][j] = heights[i];
                } else {
                    min = Math.min(min, heights[j]);
                    area[i][j] = (j - i + 1) * min;
                }
                max = Math.max(max, area[i][j]);
            }
        }
        
        return max;
    }
}

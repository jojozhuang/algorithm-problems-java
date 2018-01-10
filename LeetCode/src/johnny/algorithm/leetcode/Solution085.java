package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Maximal Rectangle.
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle
 * containing all ones and return its area.
 * 
 * @author Johnny
 */
public class Solution085 {
    //http://www.programcreek.com/2014/05/leetcode-maximal-rectangle-java/
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] heights = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    heights[i][j] = 0;
                } else {
                    if (i == 0) {
                        heights[i][j] = 1;
                    } else {
                        heights[i][j] = heights[i - 1][j] + 1;
                    }
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, largestRectangleArea(heights[i]));
        }
        
        return max;
    }
    
    private int largestRectangleArea(int[] heights) {
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
}

package johnny.lintcode.algorithm;

import java.util.Stack;

/**
 * Largest Rectangle in Histogram.
 * @author Johnny
 */
public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] height) {
        // write your code here
        //http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
        //jiuzhang
        if (height == null || height.length == 0) {
            return 0;
        }

        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty() || height[i] > height[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[stack.peek()] > height[i]) {
                    int index = stack.pop();
                    int h = height[index];
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1; 
                    max = Math.max(max, h * width);
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            int h = height[index];
            int width = stack.isEmpty() ? height.length : height.length - stack.peek() - 1; 
            max = Math.max(max, h * width);
        }
        return max;
    }
}

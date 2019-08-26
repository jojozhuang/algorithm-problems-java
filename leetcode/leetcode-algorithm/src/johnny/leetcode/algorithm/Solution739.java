package johnny.leetcode.algorithm;

import java.util.Stack;

/**
*739. Daily Temperatures
*Given a list of daily temperatures, produce a list that, for each day in the input, tells you 
*how many days you would have to wait until a warmer temperature. If there is no future day for
* which this is possible, put 0 instead.

For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should 
be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an 
integer in the range [30, 100].
 * @author Johnny
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                ans[i] = 0;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = stack.peek() - i;
                }
                stack.push(i);
            }
        }
        
        return ans;
    }
    public int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }
}

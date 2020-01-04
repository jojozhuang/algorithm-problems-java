package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 735. Asteroid Collision.
 * We are given an array asteroids of integers representing asteroids in a row.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 * <p>
 * Example 1:
 * Input:
 * asteroids = [5, 10, -5]
 * Output: [5, 10]
 * Explanation:
 * The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.
 * Example 2:
 * Input:
 * asteroids = [8, -8]
 * Output: []
 * Explanation:
 * The 8 and -8 collide exploding each other.
 * Example 3:
 * Input:
 * asteroids = [10, 2, -5]
 * Output: [10]
 * Explanation:
 * The 2 and -5 collide resulting in -5.  The 10 and -5 collide resulting in 10.
 * Example 4:
 * Input:
 * asteroids = [-2, -1, 1, 2]
 * Output: [-2, -1, 1, 2]
 * Explanation:
 * The -2 and -1 are moving left, while the 1 and 2 are moving right.
 * Asteroids moving the same direction never meet, so no asteroids will meet each other.
 * Note:
 * <p>
 * The length of asteroids will be at most 10000.
 * Each asteroid will be a non-zero integer in the range [-1000, 1000]..
 *
 * @author Johnny
 */
public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null || asteroids.length == 0) {
            return new int[]{};
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek() < 0) {
                        stack.push(asteroids[i]);
                        break;
                    } else {
                        if (-asteroids[i] == stack.peek()) {
                            stack.pop();
                            break;
                        } else if (-asteroids[i] > stack.peek()) {
                            stack.pop();
                            if (stack.isEmpty()) {
                                stack.push(asteroids[i]);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        int[] ans = new int[stack.size()];

        int i = ans.length - 1;
        while (!stack.isEmpty()) {
            ans[i] = stack.pop();
            i--;
        }
        return ans;
    }

    public int[] asteroidCollision2(int[] asteroids) {
        LinkedList<Integer> s = new LinkedList<>(); // use LinkedList to simulate stack so that we don't need to reverse at end.
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || s.isEmpty() || s.getLast() < 0)
                s.add(asteroids[i]);
            else if (s.getLast() <= -asteroids[i])
                if (s.pollLast() < -asteroids[i]) i--;
        }
        return s.stream().mapToInt(i -> i).toArray();
    }
}

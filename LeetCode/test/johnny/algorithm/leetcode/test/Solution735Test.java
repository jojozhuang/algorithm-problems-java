package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution735;

public class Solution735Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("asteroidCollision");
        Solution735 instance = new Solution735();

        assertArrayEquals(new int[] {5, 10}, instance.asteroidCollision(new int[] {5, 10, -5}));
        assertArrayEquals(new int[] {}, instance.asteroidCollision(new int[] {8, -8}));
        assertArrayEquals(new int[] {10}, instance.asteroidCollision(new int[] {10, 2, -5}));
        assertArrayEquals(new int[] {-2, -1, 1, 2}, instance.asteroidCollision(new int[] {-2, -1, 1, 2}));
    }
}

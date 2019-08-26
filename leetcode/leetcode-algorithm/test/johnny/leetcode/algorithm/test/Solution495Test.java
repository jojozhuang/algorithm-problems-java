package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution495;

public class Solution495Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findPoisonedDuration");
        Solution495 instance = new Solution495();

        assertEquals(4, instance.findPoisonedDuration(new int[] {1,4}, 2));
        assertEquals(3, instance.findPoisonedDuration(new int[] {1,2}, 2));
    }
}

package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution875;

public class Solution875Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minEatingSpeed");
        Solution875 instance = new Solution875();

        assertEquals(4, instance.minEatingSpeed(new int[] {3,6,7,11}, 8));
        assertEquals(30, instance.minEatingSpeed(new int[] {30,11,23,4,20}, 5));
        assertEquals(23, instance.minEatingSpeed(new int[] {30,11,23,4,20}, 6));
    }
}

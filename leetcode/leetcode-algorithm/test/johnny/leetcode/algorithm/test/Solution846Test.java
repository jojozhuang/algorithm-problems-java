package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution846;

public class Solution846Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isNStraightHand");
        Solution846 instance = new Solution846();

        assertEquals(true, instance.isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));
        assertEquals(false, instance.isNStraightHand(new int[] {1,2,3,4,5}, 4));
        assertEquals(true, instance.isNStraightHand(new int[] {1,2,3,4,5,6}, 2));
        assertEquals(false, instance.isNStraightHand(new int[] {5,1}, 2));
        assertEquals(true, instance.isNStraightHand(new int[] {3,2}, 2));
    }
}

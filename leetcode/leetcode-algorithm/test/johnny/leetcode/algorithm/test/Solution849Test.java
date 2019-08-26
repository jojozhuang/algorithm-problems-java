package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution849;

public class Solution849Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxDistToClosest");
        Solution849 instance = new Solution849();

        assertEquals(2, instance.maxDistToClosest(new int[] {1,1,0,0,0,1,0}));
        assertEquals(1, instance.maxDistToClosest(new int[] {1,1,0,1,1}));
        assertEquals(2, instance.maxDistToClosest(new int[] {1,0,0,0,1,0,1}));
        assertEquals(2, instance.maxDistToClosest(new int[] {0,0,1,}));
        assertEquals(3, instance.maxDistToClosest(new int[] {1,0,0,0}));
        assertEquals(2, instance.maxDistToClosest(new int[] {0,0,1,0,0}));
    }
}

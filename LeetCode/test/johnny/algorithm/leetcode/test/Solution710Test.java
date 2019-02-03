package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution710;

public class Solution710Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("RandomPick");

        Solution710 instance1 = new Solution710(1, new int[] {});
        assertEquals(0, instance1.pick());
        assertEquals(0, instance1.pick());
        assertEquals(0, instance1.pick());

        Solution710 instance2 = new Solution710(2, new int[] {});
        int result1 = instance2.pick();
        assertTrue(result1 == 1 || result1 == 0);
        result1 = instance2.pick();
        assertTrue(result1 == 1 || result1 == 0);
        result1 = instance2.pick();
        assertTrue(result1 == 1 || result1 == 0);
        
        Solution710 instance3 = new Solution710(3, new int[] {1});
        int result3 = instance3.pick();
        assertTrue(result3 == 0 || result3 == 2);
        assertEquals(0, instance3.pick());
        assertEquals(2, instance3.pick());

}
}

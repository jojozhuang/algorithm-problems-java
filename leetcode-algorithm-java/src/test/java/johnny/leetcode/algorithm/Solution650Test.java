package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution650;

public class Solution650Test extends JunitBase {

    @Test
    public void testMinSteps() {
        System.out.println("minSteps");
        Solution650 instance = new Solution650();

        assertEquals(0, instance.minSteps(0));
        assertEquals(2, instance.minSteps(2));
        assertEquals(3, instance.minSteps(3));
        assertEquals(4, instance.minSteps(4));
        assertEquals(5, instance.minSteps(5));
        assertEquals(6, instance.minSteps(8));
        assertEquals(6, instance.minSteps(9));
    }
}

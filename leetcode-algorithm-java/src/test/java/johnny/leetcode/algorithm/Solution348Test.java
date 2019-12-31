package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution348;

public class Solution348Test extends JunitBase {

    @Test
    public void testMove() {
        System.out.println("move");
        Solution348 instance = new Solution348(3);

        assertEquals(0, instance.move(0, 0, 1));
        assertEquals(0, instance.move(0, 2, 2));
        assertEquals(0, instance.move(2, 2, 1));
        assertEquals(0, instance.move(1, 1, 2));
        assertEquals(0, instance.move(2, 0, 1));
        assertEquals(0, instance.move(1, 0, 2));
        assertEquals(1, instance.move(2, 1, 1));
    }
}

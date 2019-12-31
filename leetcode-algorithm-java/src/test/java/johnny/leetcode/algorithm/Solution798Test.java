package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution798;

public class Solution798Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bestRotation");
        Solution798 instance = new Solution798();

        assertEquals(3, instance.bestRotation(new int[]{2, 3, 1, 4, 0}));
        assertEquals(0, instance.bestRotation(new int[]{1, 3, 0, 2, 4}));
    }
}

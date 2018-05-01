package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution518;

public class Solution518Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("change");
        Solution518 instance = new Solution518();

        assertEquals(4, instance.change(5, new int[] {1, 2, 5}));
        assertEquals(0, instance.change(3, new int[] {2}));
        assertEquals(1, instance.change(10, new int[] {10}));
    }
}

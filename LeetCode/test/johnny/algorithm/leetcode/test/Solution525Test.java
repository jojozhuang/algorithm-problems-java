package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution525;

public class Solution525Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaxLength");
        Solution525 instance = new Solution525();

        assertEquals(2, instance.findMaxLength(new int[] {0,1}));
        assertEquals(2, instance.findMaxLength(new int[] {0,1,0}));
    }
}

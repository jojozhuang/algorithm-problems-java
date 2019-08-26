package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution421;

public class Solution421Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaximumXOR");
        Solution421 instance = new Solution421();

        assertEquals(28, instance.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
    }
}

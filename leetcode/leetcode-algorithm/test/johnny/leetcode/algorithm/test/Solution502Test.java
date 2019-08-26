package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution502;

public class Solution502Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaximizedCapital");
        Solution502 instance = new Solution502();

        assertEquals(4, instance.findMaximizedCapital(2, 0, new int[] {1,2,3}, new int[] {0,1,1}));
    }
}

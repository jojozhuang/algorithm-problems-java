package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution665;

public class Solution665Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkPossibility");
        Solution665 instance = new Solution665();

        assertEquals(true, instance.checkPossibility(new int[] {4,2,3}));
        assertEquals(false, instance.checkPossibility(new int[] {4,2,1}));
    }
}

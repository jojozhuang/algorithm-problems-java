package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution473;

public class Solution473Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("makesquare");
        Solution473 instance = new Solution473();

        assertEquals(true, instance.makesquare(new int[] {1,1,2,2,2}));
        assertEquals(false, instance.makesquare(new int[] {3,3,3,3,4}));
    }
}

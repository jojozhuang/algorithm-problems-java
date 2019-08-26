package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution403;

public class Solution403Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canCross");
        Solution403 instance = new Solution403();

        assertEquals(true, instance.canCross(new int[] {0,1,3,5,6,8,12,17}));
        assertEquals(false, instance.canCross(new int[] {0,1,2,3,4,8,9,11}));
    }
}

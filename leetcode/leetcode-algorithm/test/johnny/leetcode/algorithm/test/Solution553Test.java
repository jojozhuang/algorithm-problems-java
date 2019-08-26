package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution553;

public class Solution553Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("optimalDivision");
        Solution553 instance = new Solution553();

        assertEquals("1000/(100/10/2)", instance.optimalDivision(new int[] {1000,100,10,2}));
    }
}

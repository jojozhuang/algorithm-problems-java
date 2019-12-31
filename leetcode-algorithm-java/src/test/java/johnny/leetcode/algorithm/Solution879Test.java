package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution879;

public class Solution879Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("profitableSchemes");
        Solution879 instance = new Solution879();

        assertEquals(2, instance.profitableSchemes(5, 3, new int[] {2,2}, new int[] {2,3}));
        assertEquals(7, instance.profitableSchemes(10, 5, new int[] {2,3,5}, new int[] {6,7,8}));
    }
}

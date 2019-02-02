package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution891;

public class Solution891Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumSubseqWidths");
        Solution891 instance = new Solution891();

        assertEquals(6, instance.sumSubseqWidths(new int[] {2,1,3}));
    }
}

package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution924Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minMalwareSpread");
        Solution924 instance = new Solution924();

        assertEquals(0, instance.minMalwareSpread(new int[][]{{1,1,0},{1,1,0},{0,0,1}}, new int[] {0,1}));
        //assertEquals(1, instance.minMalwareSpread(new int[][]{{1,1,0},{1,1,1},{0,1,1}}, new int[] {0,1}));
        //assertEquals(1, instance.minMalwareSpread(new int[][]{{1,1,0,0},{1,1,1,0},{0,1,1,1},{0,0,1,1}}, new int[] {0,1}));
    }
}

package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution861Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestSubarray");
        Solution861 instance = new Solution861();

        assertEquals(39, instance.matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
    }
}

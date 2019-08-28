package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.Solution994;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution994Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("orangesRotting");
        Solution994 instance = new Solution994();

        assertEquals(4, instance.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
        assertEquals(-1, instance.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
        assertEquals(-0, instance.orangesRotting(new int[][]{{0,2}}));
    }
}

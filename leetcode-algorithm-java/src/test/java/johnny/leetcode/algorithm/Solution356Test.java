package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution356;

public class Solution356Test extends JunitBase {

    @Test
    public void testIsReflected() {
        System.out.println("isReflected");
        Solution356 instance = new Solution356();

        assertEquals(true, instance.isReflected(null));
        assertEquals(true, instance.isReflected(new int[][]{{1,1},{-1,1}}));
        assertEquals(false, instance.isReflected(new int[][]{{1,1},{-1,-1}}));
        assertEquals(false, instance.isReflected(new int[][]{{0,0},{1,0},{3,0}}));
    }
}

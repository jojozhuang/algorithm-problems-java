package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution519;

public class Solution519Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("519. Random Flip Matrix");
        
        Solution519 random1 = new Solution519(2,3);

        assertEquals(2, random1.flip().length);
    }
}

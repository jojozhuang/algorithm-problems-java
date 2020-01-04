package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution519Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("519. Random Flip Matrix");
        
        Solution519 random1 = new Solution519(2,3);

        assertEquals(2, random1.flip().length);
    }
}

package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution935Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("knightDialer");
        Solution935 instance = new Solution935();

        assertEquals(10, instance.knightDialer(1));
        assertEquals(20, instance.knightDialer(2));
        assertEquals(46, instance.knightDialer(3));
    }
}

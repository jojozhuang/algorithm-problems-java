package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution691Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minStickers");
        Solution691 instance = new Solution691();

        assertEquals(3, instance.minStickers(new String[] {"with", "example", "science"}, "thehat"));
        assertEquals(-1, instance.minStickers(new String[] {"notice", "possible"}, "basicbasic"));
    }
}

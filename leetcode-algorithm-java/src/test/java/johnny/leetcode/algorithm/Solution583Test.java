package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution583Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDistance");
        Solution583 instance = new Solution583();

        assertEquals(2, instance.minDistance("sea", "eat"));
    }
}

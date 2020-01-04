package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution798Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bestRotation");
        Solution798 instance = new Solution798();

        assertEquals(3, instance.bestRotation(new int[]{2, 3, 1, 4, 0}));
        assertEquals(0, instance.bestRotation(new int[]{1, 3, 0, 2, 4}));
    }
}

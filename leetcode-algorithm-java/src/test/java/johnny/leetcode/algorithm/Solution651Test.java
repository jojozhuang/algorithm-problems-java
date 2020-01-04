package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution651Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxA");
        Solution651 instance = new Solution651();

        assertEquals(3, instance.maxA(3));
        assertEquals(9, instance.maxA(7));
    }
}

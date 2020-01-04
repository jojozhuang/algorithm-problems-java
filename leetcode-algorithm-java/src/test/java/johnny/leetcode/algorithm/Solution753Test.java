package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution753Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("crackSafe");
        Solution753 instance = new Solution753();

        assertEquals("01", instance.crackSafe(1,2));
        assertEquals("00110", instance.crackSafe(2,2));
    }
}

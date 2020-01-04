package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution639Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numDecodings");
        Solution639 instance = new Solution639();

        assertEquals(9, instance.numDecodings("*"));
        assertEquals(18, instance.numDecodings("1*"));
    }
}

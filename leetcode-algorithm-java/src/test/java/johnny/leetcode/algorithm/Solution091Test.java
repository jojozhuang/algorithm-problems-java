package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution091;

public class Solution091Test extends JunitBase {

    @Test
    public void testNumDecodings() {
        System.out.println("numDecodings");
        Solution091 instance = new Solution091();

        assertEquals(0, instance.numDecodings(""));
        assertEquals(0, instance.numDecodings("0"));
        assertEquals(1, instance.numDecodings("1"));
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(3, instance.numDecodings("123"));
        assertEquals(1, instance.numDecodings("637"));
        assertEquals(1, instance.numDecodings("120"));
        assertEquals(1, instance.numDecodings("2020"));
        assertEquals(2, instance.numDecodings("2120"));
        assertEquals(1, instance.numDecodings("10210"));
        assertEquals(589824, instance.numDecodings("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948"));
    }
}

package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution696Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countBinarySubstrings");
        Solution696 instance = new Solution696();

        
        assertEquals(3, instance.countBinarySubstrings("00110"));
        assertEquals(6, instance.countBinarySubstrings("00110011"));
        assertEquals(4, instance.countBinarySubstrings("10101"));
    }
}

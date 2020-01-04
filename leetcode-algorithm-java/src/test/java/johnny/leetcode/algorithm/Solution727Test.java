package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution727Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minWindow");
        Solution727 instance = new Solution727();

        assertEquals("bcde", instance.minWindow("abcdebdde", "bde"));
    }
}

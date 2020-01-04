package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution791Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("customSortString");
        Solution791 instance = new Solution791();

        assertEquals("cbad", instance.customSortString("cba","abcd"));
    }
}

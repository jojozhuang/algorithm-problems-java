package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution483Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestGoodBase");
        Solution483 instance = new Solution483();

        assertEquals("8", instance.smallestGoodBase("4681"));
        assertEquals("999999999999999999", instance.smallestGoodBase("1000000000000000000"));
    }
}

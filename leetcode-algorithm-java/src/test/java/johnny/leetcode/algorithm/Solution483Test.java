package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution483;

public class Solution483Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestGoodBase");
        Solution483 instance = new Solution483();

        assertEquals("8", instance.smallestGoodBase("4681"));
        assertEquals("999999999999999999", instance.smallestGoodBase("1000000000000000000"));
    }
}

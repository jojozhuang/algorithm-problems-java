package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution390Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lastRemaining");
        Solution390 instance = new Solution390();

        assertEquals(6, instance.lastRemaining(9));
    }
}

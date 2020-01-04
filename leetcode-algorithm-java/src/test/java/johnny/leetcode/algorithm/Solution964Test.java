package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution964Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("leastOpsExpressTarget");
        Solution964 instance = new Solution964();

        assertEquals(5, instance.leastOpsExpressTarget(3,19));
        assertEquals(8, instance.leastOpsExpressTarget(5,501));
        assertEquals(3, instance.leastOpsExpressTarget(100,100000000));
    }
}

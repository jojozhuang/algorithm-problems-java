package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution432Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("AllOne");
        Solution432 instance = new Solution432();

        instance.inc("a");
        instance.dec("b");
        String param_3 = instance.getMaxKey();
        String param_4 = instance.getMinKey();
        assertEquals("a", param_3);
        assertEquals("a", param_4);
    }
}

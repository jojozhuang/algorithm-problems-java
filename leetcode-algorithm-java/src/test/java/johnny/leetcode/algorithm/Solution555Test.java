package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution555Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitLoopedString");
        Solution555 instance = new Solution555();

        assertEquals("zyxcba", instance.splitLoopedString(new String[] {"abc", "xyz"}));
    }
}

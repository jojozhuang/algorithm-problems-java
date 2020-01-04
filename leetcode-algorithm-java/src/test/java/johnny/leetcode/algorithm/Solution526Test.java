package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution526Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countArrangement");
        Solution526 instance = new Solution526();

        assertEquals(2, instance.countArrangement(2));
    }
}

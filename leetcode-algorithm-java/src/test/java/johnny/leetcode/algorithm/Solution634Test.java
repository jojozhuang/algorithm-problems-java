package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution634Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findDerangement");
        Solution634 instance = new Solution634();

        assertEquals(2, instance.findDerangement(3));
    }
}

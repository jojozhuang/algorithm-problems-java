package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution556Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextGreaterElement");
        Solution556 instance = new Solution556();

        assertEquals(21, instance.nextGreaterElement(12));
        assertEquals(-1, instance.nextGreaterElement(21));
    }
}

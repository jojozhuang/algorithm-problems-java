package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution440Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findKthNumber");
        Solution440 instance = new Solution440();

        assertEquals(10, instance.findKthNumber(13,2));
    }
}

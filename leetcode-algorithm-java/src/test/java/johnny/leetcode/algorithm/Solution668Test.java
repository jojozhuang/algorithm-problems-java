package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution668Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findKthNumber");
        Solution668 instance = new Solution668();

        assertEquals(3, instance.findKthNumber(3,3,5));
        assertEquals(6, instance.findKthNumber(2,3,6));
    }
}

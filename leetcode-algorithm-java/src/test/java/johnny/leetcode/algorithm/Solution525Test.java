package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution525Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaxLength");
        Solution525 instance = new Solution525();

        assertEquals(2, instance.findMaxLength(new int[] {0,1}));
        assertEquals(2, instance.findMaxLength(new int[] {0,1,0}));
    }
}

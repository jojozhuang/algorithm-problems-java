package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution502Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaximizedCapital");
        Solution502 instance = new Solution502();

        assertEquals(4, instance.findMaximizedCapital(2, 0, new int[] {1,2,3}, new int[] {0,1,1}));
    }
}

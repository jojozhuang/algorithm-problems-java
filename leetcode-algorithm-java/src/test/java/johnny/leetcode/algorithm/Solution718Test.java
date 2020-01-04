package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution718Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLength");
        Solution718 instance = new Solution718();

        assertEquals(3, instance.findLength(new int[] {1,2,3,2,1}, new int[] {3,2,1,4,7}));
    }
}

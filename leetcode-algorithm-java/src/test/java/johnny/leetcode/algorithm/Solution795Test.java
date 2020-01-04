package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution795Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSubarrayBoundedMax");
        Solution795 instance = new Solution795();

        assertEquals(3, instance.numSubarrayBoundedMax(new int[] {2, 1, 4, 3}, 2, 3));
    }
}

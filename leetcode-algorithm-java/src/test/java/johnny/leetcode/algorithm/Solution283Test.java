package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution283Test extends JunitBase {

    @Test
    public void testMoveZeroes() {
        System.out.println("moveZeroes");
        int[] nums = null;
        Solution283 instance = new Solution283();
        instance.moveZeroes(nums);

        int[] nums2 = new int[]{0, 1, 0, 3, 12};
        instance.moveZeroes(nums2);
        int[] expect2 = new int[]{1, 3, 12, 0, 0};
        assertArrayEquals(expect2, nums2);
    }
}

package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution324;

public class Solution324Test extends JunitBase {

    @Test
    public void testWiggleSort() {
        System.out.println("wiggleSort");
        int[] nums = null;
        Solution324 instance = new Solution324();
        instance.wiggleSort(nums);

        int[] nums2 = new int[]{1, 5, 1, 1, 6, 4};
        instance.wiggleSort(nums2);
        assertArrayEquals(new int[]{1, 6, 1, 5, 1, 4}, nums2);

        int[] nums3 = new int[]{1, 3, 2, 2, 3, 1};
        instance.wiggleSort(nums3);
        assertArrayEquals(new int[]{2, 3, 1, 3, 1, 2}, nums3);
    }
}

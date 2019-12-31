package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution031;

public class Solution031Test extends JunitBase {

    @Test
    public void testNextPermutation() {
        System.out.println("nextPermutation");
        Solution031 instance = new Solution031();

        int[] nums = null;
        instance.nextPermutation(nums);
        assertArrayEquals(null, nums);

        int[] nums2 = new int[]{1};
        instance.nextPermutation(nums2);
        assertArrayEquals(new int[]{1}, nums2);
        int[] nums3 = new int[]{1,3};
        instance.nextPermutation(nums3);
        assertArrayEquals(new int[]{3,1}, nums3);
        int[] nums4 = new int[]{3,1};
        instance.nextPermutation(nums4);
        assertArrayEquals(new int[]{1,3}, nums4);
        int[] nums5 = new int[]{2,3,1};
        instance.nextPermutation(nums5);
        assertArrayEquals(new int[]{3,1,2}, nums5);
        int[] nums6 = new int[]{1,2,3};
        instance.nextPermutation(nums6);
        assertArrayEquals(new int[]{1,3,2}, nums6);
        int[] nums7 = new int[]{3,2,1};
        instance.nextPermutation(nums7);
        assertArrayEquals(new int[]{1,2,3}, nums7);
        int[] nums8 = new int[]{1,1,5};
        instance.nextPermutation(nums8);
        assertArrayEquals(new int[]{1,5,1}, nums8);
        int[] nums9 = new int[]{1,5,8,4,7,6,5,3,1};
        instance.nextPermutation(nums9);
        assertArrayEquals(new int[]{1,5,8,5,1,3,4,6,7}, nums9);
    }
}

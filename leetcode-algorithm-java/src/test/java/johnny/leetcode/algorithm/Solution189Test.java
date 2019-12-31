package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution189;

public class Solution189Test extends JunitBase {

    @Test
    public void testRotate() {
        System.out.println("rotate");
        int[] nums = null;
        int k = 0;
        Solution189 instance = new Solution189();
        int[] expResult = null;
        instance.rotate(nums, k);
        assertArrayEquals(expResult, nums);

        int[] nums2 = new int[0];
        instance.rotate(nums2, 2);
        assertArrayEquals(new int[0], nums2);

        int[] nums3 = new int[]{1};
        instance.rotate(nums3, -1);
        assertArrayEquals(new int[]{1}, nums3);

        int[] nums4 = new int[]{2};
        instance.rotate(nums4, 2);
        assertArrayEquals(new int[]{2}, nums4);

        int[] nums5 = new int[]{3};
        instance.rotate(nums5, 0);
        assertArrayEquals(new int[]{3}, nums5);

        int[] nums6 = new int[]{4};
        instance.rotate(nums6, 1);
        assertArrayEquals(new int[]{4}, nums6);

        int[] nums7 = new int[]{5,6};
        instance.rotate(nums7, 1);
        assertArrayEquals(new int[]{6,5}, nums7);

        int[] nums8 = new int[]{1,2,3,4};
        instance.rotate(nums8, 1);
        assertArrayEquals(new int[]{4,1,2,3}, nums8);

        int[] nums9 = new int[]{1,2,3};
        instance.rotate(nums9, 3);
        assertArrayEquals(new int[]{1,2,3}, nums9);

        int[] nums10 = new int[]{1,2,3,4,5};
        instance.rotate(nums10, 3);
        assertArrayEquals(new int[]{3,4,5,1,2}, nums10);

        int[] nums11 = new int[]{1,2,3,4,5};
        instance.rotate(nums11, 4);
        assertArrayEquals(new int[]{2,3,4,5,1}, nums11);

        int[] nums12 = new int[]{1,2,3,4,5,6,7};
        instance.rotate(nums12, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums12);

        int[] nums13 = new int[]{1,2};
        instance.rotate(nums13, 1);
        assertArrayEquals(new int[]{2,1}, nums13);
        //assertArrayEquals(new int[0], instance.rotate(new int[1], 2));
        //assertArrayEquals(new int[0], instance.rotate(new int[1], 2));
    }
}

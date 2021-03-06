package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution280Test extends JunitBase {

    @Test
    public void testWiggleSort() {
        System.out.println("wiggleSort");
        int[] nums = null;
        Solution280 instance = new Solution280();
        instance.wiggleSort(nums);

        int[] nums2 = new int[]{1,2,3,4,5,6};
        instance.wiggleSort(nums2);
        assertArrayEquals(new int[]{1,3,2,5,4,6}, nums2);
    }
}

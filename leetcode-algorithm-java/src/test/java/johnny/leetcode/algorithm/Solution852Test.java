package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution852Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("peakIndexInMountainArray");
        Solution852 instance = new Solution852();

        assertEquals(1, instance.peakIndexInMountainArray(new int[] {0,1,0}));
        assertEquals(1, instance.peakIndexInMountainArray(new int[] {0,2,1,0}));
    }
}

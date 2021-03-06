package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution949Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestTimeFromDigits");
        Solution949 instance = new Solution949();

        assertEquals("23:41", instance.largestTimeFromDigits(new int[] {1,2,3,4}));
        assertEquals("", instance.largestTimeFromDigits(new int[] {5,5,5,5}));
        assertEquals("00:00", instance.largestTimeFromDigits(new int[] {0,0,0,0}));
    }
}

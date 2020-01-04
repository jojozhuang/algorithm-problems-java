package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution400Test extends JunitBase {

    @Test
    public void testFindNthDigit() {
        System.out.println("findNthDigit");
        Solution400 instance = new Solution400();

        //assertEquals(1, instance.findNthDigit(1));
        //assertEquals(9, instance.findNthDigit(9));
        //assertEquals(1, instance.findNthDigit(10));
        //assertEquals(0, instance.findNthDigit(11));
        //assertEquals(1, instance.findNthDigit(12));
        //assertEquals(1, instance.findNthDigit(13));
        assertEquals(1, instance.findNthDigit(1000000000));
    }
}

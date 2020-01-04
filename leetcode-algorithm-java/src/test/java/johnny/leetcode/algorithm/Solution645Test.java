package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution645Test extends JunitBase {

    @Test
    public void testFindErrorNums() {
        System.out.println("findErrorNums");
        Solution645 instance = new Solution645();

        assertArrayEquals(new int[]{2,3}, instance.findErrorNums(new int[]{1,2,2,4}));
        assertArrayEquals(new int[]{3,2}, instance.findErrorNums(new int[]{1,3,3,4}));
    }
}

package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution764Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("orderOfLargestPlusSign");
        Solution764 instance = new Solution764();

        int[][] mines1 = new int[][] {{4, 2}};
        assertEquals(2, instance.orderOfLargestPlusSign(5, mines1));

        //int[][] mines2 = new int[][] {{}};
        //assertEquals(1, instance.orderOfLargestPlusSign(2, mines2));

        int[][] mines3 = new int[][] {{0, 0}};
        assertEquals(0, instance.orderOfLargestPlusSign(1, mines3));
    }
}

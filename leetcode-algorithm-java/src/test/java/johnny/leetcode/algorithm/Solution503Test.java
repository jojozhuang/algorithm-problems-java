package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution503Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextGreaterElements");
        Solution503 instance = new Solution503();

        assertArrayEquals(new int[] {2,-1,2}, instance.nextGreaterElements(new int[] {1,2,1}));
        assertArrayEquals(new int[] {3,4,-1,3}, instance.nextGreaterElements(new int[] {1,3, 4, 2}));
    }
}

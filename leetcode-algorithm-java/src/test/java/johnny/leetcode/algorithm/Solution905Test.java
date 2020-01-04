package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution905Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sortArrayByParity");
        Solution905 instance = new Solution905();

        assertArrayEquals(new int[] {4,2,1,3}, instance.sortArrayByParity(new int[] {3,1,2,4}));
    }
}

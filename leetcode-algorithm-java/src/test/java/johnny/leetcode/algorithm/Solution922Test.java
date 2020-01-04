package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution922Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sortArrayByParityII");
        Solution922 instance = new Solution922();

        assertArrayEquals(new int[] {4,5,2,7}, instance.sortArrayByParityII(new int[] {4,2,5,7}));
    }
}

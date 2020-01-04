package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution927Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("threeEqualParts");
        Solution927 instance = new Solution927();

        assertArrayEquals(new int[] {0,3}, instance.threeEqualParts(new int[]{1,0,1,0,1}));
        assertArrayEquals(new int[] {-1,-1}, instance.threeEqualParts(new int[]{1,1,0,1,1}));
    }
}

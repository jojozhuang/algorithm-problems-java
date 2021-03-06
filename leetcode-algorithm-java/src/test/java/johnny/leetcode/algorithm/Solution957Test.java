package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution957Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("prisonAfterNDays");
        Solution957 instance = new Solution957();

        assertArrayEquals(new int[] {0,0,1,1,0,0,0,0}, instance.prisonAfterNDays(new int[] {0,1,0,1,1,0,0,1}, 7));
        assertArrayEquals(new int[] {0,0,1,1,1,1,1,0}, instance.prisonAfterNDays(new int[] {1,0,0,1,0,0,1,0}, 1000000000));
    }
}

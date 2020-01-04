package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution740Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("deleteAndEarn");
        Solution740 instance = new Solution740();

        assertEquals(6, instance.deleteAndEarn(new int[] {3, 4, 2}));
        assertEquals(9, instance.deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}));
    }
}

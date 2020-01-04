package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution877Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("stoneGame");
        Solution877 instance = new Solution877();

        assertEquals(true, instance.stoneGame(new int[] {5,3,4,5}));
    }
}

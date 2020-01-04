package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution950Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("deckRevealedIncreasing");
        Solution950 instance = new Solution950();

        assertArrayEquals(new int[] {2,13,3,11,5,17,7}, instance.deckRevealedIncreasing(new int[] {17,13,11,2,3,5,7}));
    }
}

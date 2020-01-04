package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution810Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("xorGame");
        Solution810 instance = new Solution810();

        assertEquals(false, instance.xorGame(new int[] {1,1,2}));
    }
}

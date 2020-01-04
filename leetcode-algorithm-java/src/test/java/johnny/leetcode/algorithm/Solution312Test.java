package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution312Test extends JunitBase {

    @Test
    public void testMaxCoins() {
        System.out.println("maxCoins");
        Solution312 instance = new Solution312();

        assertEquals(0, instance.maxCoins(null));
        assertEquals(167, instance.maxCoins(new int[]{3, 1, 5, 8}));
    }
}

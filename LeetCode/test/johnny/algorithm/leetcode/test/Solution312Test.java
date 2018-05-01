package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution312;

public class Solution312Test extends JunitBase {

    @Test
    public void testMaxCoins() {
        System.out.println("maxCoins");
        Solution312 instance = new Solution312();

        assertEquals(0, instance.maxCoins(null));
        assertEquals(167, instance.maxCoins(new int[]{3, 1, 5, 8}));
    }
}

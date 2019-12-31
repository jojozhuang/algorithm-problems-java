package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution322;

public class Solution322Test extends JunitBase {

    @Test
    public void testCoinChange() {
        System.out.println("coinChange");
        Solution322 instance = new Solution322();

        assertEquals(0, instance.coinChange(null, 0));
        assertEquals(0, instance.coinChange(new int[]{1}, 0));
        assertEquals(-1, instance.coinChange(new int[]{2}, 3));
        assertEquals(-1, instance.coinChange(new int[]{2}, 1));
        assertEquals(1, instance.coinChange(new int[]{2}, 2));
        assertEquals(3, instance.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(3, instance.coinChange(new int[]{1, 2, 5}, 12));
        assertEquals(4, instance.coinChange(new int[]{1, 2, 5}, 14));
        assertEquals(20, instance.coinChange(new int[]{186,419,83,408}, 6249));
        assertEquals(-1, instance.coinChange(new int[]{2147483647}, 2));
    }
}

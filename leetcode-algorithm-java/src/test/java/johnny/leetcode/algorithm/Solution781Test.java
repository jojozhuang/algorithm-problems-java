package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution781Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numRabbits");
        Solution781 instance = new Solution781();

        assertEquals(0, instance.numRabbits(new int[] {}));
        assertEquals(5, instance.numRabbits(new int[] {1, 1, 2}));
        assertEquals(11, instance.numRabbits(new int[] {10, 10, 10}));
    }
}

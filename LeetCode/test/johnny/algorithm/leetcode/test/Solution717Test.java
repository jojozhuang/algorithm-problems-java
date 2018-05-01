package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution717;

public class Solution717Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isOneBitCharacter");
        Solution717 instance = new Solution717();

        assertEquals(true, instance.isOneBitCharacter(new int[] {1, 0, 0}));
        assertEquals(false, instance.isOneBitCharacter(new int[] {1, 1, 1, 0}));
    }
}

package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution683;

public class Solution683Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kEmptySlots");
        Solution683 instance = new Solution683();

        assertEquals(2, instance.kEmptySlots(new int[] {1,3,2}, 1));
        assertEquals(-1, instance.kEmptySlots(new int[] {1,2,3}, 1));
    }
}

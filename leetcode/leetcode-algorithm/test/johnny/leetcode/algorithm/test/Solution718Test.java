package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution718;

public class Solution718Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLength");
        Solution718 instance = new Solution718();

        assertEquals(3, instance.findLength(new int[] {1,2,3,2,1}, new int[] {3,2,1,4,7}));
    }
}

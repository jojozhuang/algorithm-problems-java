package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution455;

public class Solution455Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findContentChildren");
        Solution455 instance = new Solution455();

        assertEquals(1, instance.findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
        assertEquals(2, instance.findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
    }
}

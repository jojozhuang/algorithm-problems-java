package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution455Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findContentChildren");
        Solution455 instance = new Solution455();

        assertEquals(1, instance.findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
        assertEquals(2, instance.findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
    }
}

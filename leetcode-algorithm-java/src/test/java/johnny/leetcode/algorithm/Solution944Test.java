package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution942;

public class Solution944Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("diStringMatch");
        Solution942 instance = new Solution942();

        assertArrayEquals(new int[] {0,4,1,3,2}, instance.diStringMatch("IDID"));
        assertArrayEquals(new int[] {0,1,2,3}, instance.diStringMatch("III"));
        assertArrayEquals(new int[] {3,2,0,1}, instance.diStringMatch("DDI"));
    }
}

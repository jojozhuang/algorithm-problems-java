package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution996;

public class Solution996Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSquarefulPerms");
        Solution996 instance = new Solution996();

        assertEquals(2, instance.numSquarefulPerms(new int[] {1,17,8}));
        assertEquals(1, instance.numSquarefulPerms(new int[] {2,2,2}));

    }
}

package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution967;

public class Solution967Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numsSameConsecDiff");
        Solution967 instance = new Solution967();

        assertArrayEquals(new int[] {181,292,707,818,929}, instance.numsSameConsecDiff(3,7));
        assertArrayEquals(new int[] {10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98}, instance.numsSameConsecDiff(2,1));
    }
}

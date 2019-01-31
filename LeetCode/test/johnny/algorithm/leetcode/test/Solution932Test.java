package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution932;

public class Solution932Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("beautifulArray");
        Solution932 instance = new Solution932();

        assertArrayEquals(new int[] {1,3,2,4}, instance.beautifulArray(4));
        assertArrayEquals(new int[] {1,5,3,2,4}, instance.beautifulArray(5));
    }
}

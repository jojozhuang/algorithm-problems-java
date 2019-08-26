package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution974;

public class Solution974Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("subarraysDivByK");
        Solution974 instance = new Solution974();

        assertEquals(7, instance.subarraysDivByK(new int[] {4,5,0,-2,-3,1}, 5));
        assertEquals(4, instance.subarraysDivByK(new int[] {5,6,7,-1,-4,0,1}, 5));
    }
}

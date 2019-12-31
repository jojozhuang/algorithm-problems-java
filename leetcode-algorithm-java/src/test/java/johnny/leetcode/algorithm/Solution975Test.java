package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution975;

public class Solution975Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("oddEvenJumps");
        Solution975 instance = new Solution975();

        assertEquals(2, instance.oddEvenJumps(new int[] {10,13,12,14,15}));
        assertEquals(3, instance.oddEvenJumps(new int[] {2,3,1,1,4}));
    }
}

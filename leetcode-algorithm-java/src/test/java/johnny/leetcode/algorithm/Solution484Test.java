package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution484;

public class Solution484Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findPermutation");
        Solution484 instance = new Solution484();

        assertArrayEquals(new int[] {1,2}, instance.findPermutation("I"));
        assertArrayEquals(new int[] {2,1,3}, instance.findPermutation("DI"));
    }
}

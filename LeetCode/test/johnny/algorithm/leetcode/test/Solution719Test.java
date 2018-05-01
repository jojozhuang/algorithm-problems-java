package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution719;

public class Solution719Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestDistancePair");
        Solution719 instance = new Solution719();

        assertEquals(0, instance.smallestDistancePair(new int[] {1,3,1}, 1));
    }
}

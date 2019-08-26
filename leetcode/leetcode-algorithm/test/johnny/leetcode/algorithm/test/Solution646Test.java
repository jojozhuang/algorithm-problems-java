package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution646;

public class Solution646Test extends JunitBase {

    @Test
    public void testFindLongestChain() {
        System.out.println("findLongestChain");
        Solution646 instance = new Solution646();

        assertEquals(0, instance.findLongestChain(null));
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4}}));
        assertEquals(3, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{7,8}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{4,5}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{1,2},{2,3},{3,4},{1,4}}));
        assertEquals(2, instance.findLongestChain(new int[][]{{3,4},{2,3},{1,2}}));
        assertEquals(3, instance.findLongestChain(new int[][]{{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}}));
        assertEquals(4, instance.findLongestChain(new int[][]{{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}}));
    }
}
